package com.example.chatbot;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chat extends AppCompatActivity {
    TextView textViewRespostaChat;
    TextView textViewRespostaUsuario;
    EditText editTextMensagem;
    String respostaChat;
    String respostaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewRespostaChat = findViewById(R.id.textViewRespostaChat);
        textViewRespostaUsuario = findViewById(R.id.textViewRespostaUsuario);
        editTextMensagem = findViewById(R.id.editTextMensagem);
    }

    public void botaoEnviarMensagem(View v) {
        atualizarMensagemUsuario();
        atualizarMensagemChatBot();
    }

    public void atualizarMensagemUsuario() {
        respostaUsuario = String.valueOf(editTextMensagem.getText());
        textViewRespostaUsuario.setText(respostaUsuario);
    }

    public void atualizarMensagemChatBot() {
        // Consulta DB
        //respostaChat = String.valueOf()
        textViewRespostaChat.setText("Testando...");
    }

    public void voltarAoInicio(View v) {
        finish();
    }
}