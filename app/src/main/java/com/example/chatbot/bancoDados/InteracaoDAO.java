package com.example.chatbot.bancoDados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.chatbot.Interacao;

import java.util.ArrayList;
import java.util.List;

public class InteracaoDAO {
    private SQLiteDatabase db;

    public InteracaoDAO(Context context) {
        BancoHelper helper = new BancoHelper(context);
        db = helper.getWritableDatabase();
    }

    public long inserir(Interacao interacao) {
        ContentValues valores = new ContentValues();
        valores.put("id", interacao.getId());
        return db.insert("interacao", null, valores);
    }

    public List<Interacao> listar() {
        List<Interacao> interacoes = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM interacao", null);

        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            int idInteracao = cursor.getInt(1);
            String resposta = cursor.getString(2);
            interacoes.add(new Interacao(id, idInteracao, resposta));
        }
        cursor.close();

        return interacoes;
    }
}
