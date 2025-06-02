package com.example.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class Chat extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
        recyclerView = findViewById(R.id.recycler_view_chat);
        chatAdapter = new ChatAdapter(new ArrayList<>());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(chatAdapter);
        // Set the custom item decoration to add spacing between chat bubbles
        int spacingBetweenBubbles = getResources().getDimensionPixelSize(R.dimen.spacing_between_bubbles);
        recyclerView.addItemDecoration(new ChatItemDecoration(spacingBetweenBubbles));
        Button sendButton = findViewById(R.id.button_send);
        EditText inputEditText = findViewById(R.id.edit_text_input);
        sendButton.setOnClickListener(v -> {
            String userMessage = inputEditText.getText().toString().trim();
            if (!userMessage.isEmpty()) {
                addMessageToChat(new ChatMessage(userMessage, true));
                // ask chat gpt
                askChatGpt(userMessage);
                inputEditText.setText("");
            }
        });
    }
    // Method to add a new message to the chat list
    private void addMessageToChat(ChatMessage chatMessage) {
        chatAdapter.addMessage(chatMessage);
        recyclerView.scrollToPosition(chatAdapter.getItemCount() - 1);
    }
    // interact with chat gpt api
    private void askChatGpt(String userPrompt) {
        // Create the Retrofit client
        OpenAIAPIClient.OpenAIAPIService apiService = OpenAIAPIClient.create();
        // Create the request model
        Message message = new Message("user", userPrompt);
        List<Message> messageList = new ArrayList<>();
        messageList.add(message);
        OpenAIRequestModel requestModel = new OpenAIRequestModel("gpt-3.5-turbo", messageList, 0.7f);
        // Make the API request
        Call<OpenAIResponseModel> call = apiService.getCompletion(requestModel);
        call.enqueue(new Callback<OpenAIResponseModel>() {
            @Override
            public void onResponse(Call<OpenAIResponseModel> call, Response<OpenAIResponseModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    OpenAIResponseModel responseBody = response.body();
                    String generatedText = responseBody.getChoices()[0].getMessage().getContent();
                    addMessageToChat(new ChatMessage(generatedText, false));
                } else {
                    // Handle API error
                    addMessageToChat(new ChatMessage("API error", false));
                }
            }
            @Override
            public void onFailure(Call<OpenAIResponseModel> call, Throwable t) {
                // Handle network or request failure
                addMessageToChat(new ChatMessage("API onFailure: "+t.getMessage(), false));
            }
        });
    }

    public void botaoVoltar(View view) {
        Intent intent = new Intent(Chat.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}