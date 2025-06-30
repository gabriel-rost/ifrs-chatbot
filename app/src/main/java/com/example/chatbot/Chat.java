package com.example.chatbot;

import static com.example.chatbot.Contextos.INSTITUICAO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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

        addMessageToChat(new ChatMessage(
                "Olá! Sou seu assistente virtual e estou aqui para te ajudar com informações sobre o curso Tecnólogo em Análise e Desenvolvimento de Sistemas do IFRS – Campus Rolante. Em que posso te ajudar hoje?",
                false
        ));

        Button btnInfoGeral = findViewById(R.id.button_info_geral);
        Button btnMatriz1 = findViewById(R.id.button_matriz_1);
        Button btnContato = findViewById(R.id.button_contato);

        btnInfoGeral.setOnClickListener(v -> simulateUserInput("Informações gerais sobre o curso"));
        btnMatriz1.setOnClickListener(v -> simulateUserInput("Quais disciplinas do primeiro semestre?"));
        btnContato.setOnClickListener(v -> simulateUserInput("Quem é o coordenador do curso?"));

    }

    private void simulateUserInput(String texto) {
        addMessageToChat(new ChatMessage(texto, true));
        askChatGpt(texto);
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

        List<Message> messageList = new ArrayList<>();

        List listaPromptUsuario = new ArrayList<>();
        listaPromptUsuario = Arrays.asList(Arrays.stream(userPrompt.split(" ")).toArray());
        String entradaUsuario = String.join(" ", listaPromptUsuario).toLowerCase();

        if (entradaUsuario.matches(".*(nome do curso|qual.*curso|informações gerais|objetivo.*curso|estrutura.*curso|carga horária total|número de vagas|requisito|modalidade|turno).*")) {
            Message messageSistema = new Message("system", "Informações gerais sobre o curso:");
            Message messageUsuario = new Message("user", Contextos.TADS_JSON_COMPLETO);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(nome do curso|qual.*curso|informações gerais|objetivo.*curso|estrutura.*curso|carga horária total|número de vagas|requisito|modalidade|turno).*")) {
            Message messageSistema = new Message("system", "Informações gerais sobre o curso:");
            Message messageUsuario = new Message("user", Contextos.TADS_INFORMACOES_GERAIS);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(coordenador|coordenação|coordenacao|contato.*tads|email.*tads).*")) {
            Message messageSistema = new Message("system", "Informações da coordenação do curso:");
            Message messageUsuario = new Message("user", Contextos.TADS_COORDENACAO);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(matriz(\\s+curricular)?|disciplinas.*(primeiro)?\\s*semestre|grade.*primeiro).*")) {
            Message messageSistema = new Message("system", "Informações sobre a matriz curricular do 1º semestre:");
            Message messageUsuario = new Message("user", Contextos.TADS_MATRIZ_CURRICULAR_PRIMEIRO_SEMESTRE);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(matriz.*(curricular)?.*segundo|disciplinas.*(segundo)?\\s*semestre|grade.*segundo).*")) {
            Message messageSistema = new Message("system", "Informações sobre a matriz curricular do 2º semestre:");
            Message messageUsuario = new Message("user", Contextos.TADS_MATRIZ_CURRICULAR_SEGUNDO_SEMESTRE);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(matriz.*(curricular)?.*terceiro|disciplinas.*(terceiro)?\\s*semestre|grade.*terceiro).*")) {
            Message messageSistema = new Message("system", "Informações sobre a matriz curricular do 3º semestre:");
            Message messageUsuario = new Message("user", Contextos.TADS_MATRIZ_CURRICULAR_TERCEIRO_SEMESTRE);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(matriz.*(curricular)?.*quarto|disciplinas.*(quarto)?\\s*semestre|grade.*quarto).*")) {
            Message messageSistema = new Message("system", "Informações sobre a matriz curricular do 4º semestre:");
            Message messageUsuario = new Message("user", Contextos.TADS_MATRIZ_CURRICULAR_QUARTO_SEMESTRE);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(matriz.*(curricular)?.*quinto|disciplinas.*(quinto)?\\s*semestre|grade.*quinto).*")) {
            Message messageSistema = new Message("system", "Informações sobre a matriz curricular do 5º semestre:");
            Message messageUsuario = new Message("user", Contextos.TADS_MATRIZ_CURRICULAR_QUINTO_SEMESTRE);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(matriz.*(curricular)?.*sexto|disciplinas.*(sexto)?\\s*semestre|grade.*sexto).*")) {
            Message messageSistema = new Message("system", "Informações sobre a matriz curricular do 6º semestre:");
            Message messageUsuario = new Message("user", Contextos.TADS_MATRIZ_CURRICULAR_SEXTO_SEMESTRE);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(optativas|optativos|disciplinas opcionais|componentes opcionais).*")) {
            Message messageSistema = new Message("system", "Estas são as disciplinas optativas do curso:");
            Message messageUsuario = new Message("user", Contextos.TADS_COMPONENTES_OPTATIVOS_E_COMPLEMENTARES);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }

        if (entradaUsuario.matches(".*(instituição|instituicao|ifrs|campus rolante|informações do campus).*")) {
            Message messageSistema = new Message("system", "Aqui estão as informações da instituição:");
            Message messageUsuario = new Message("user", INSTITUICAO);
            messageList.add(messageSistema);
            messageList.add(messageUsuario);
        }


        Message messageSistema = new Message("system", Contextos.MENSAGEM_CONTEXTO + Contextos.MENSAGEM_CONTEXTO_TADS);
        Message messageUsuario = new Message("user", userPrompt);
        messageList.add(messageSistema);
        messageList.add(messageUsuario);

        //Message messageSistema = new Message("system", Contextos.MENSAGEM_CONTEXTO);
        //Message messageUsuario = new Message("user", userPrompt);


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