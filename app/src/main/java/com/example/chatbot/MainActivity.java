package com.example.chatbot;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.chatbot.bancoDados.BancoHelper;
import com.example.chatbot.bancoDados.InteracaoDAO;

public class MainActivity extends AppCompatActivity {
    TextView textViewApresentacao;
    private InteracaoDAO interacaoDAO;
    private BancoHelper bancoHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textViewApresentacao = findViewById(R.id.textViewApresentacao);
        interacaoDAO = new InteracaoDAO(this);
        bancoHelper = new BancoHelper(this);

    }

    public void test(View view) {
        String test = String.valueOf(interacaoDAO.listar());
        Toast.makeText(this, test, Toast.LENGTH_LONG).show();
    }

    public void iniciarConversa(View v) {
        Intent intent = new Intent(this, Chat.class);
        startActivity(intent);
    }
}