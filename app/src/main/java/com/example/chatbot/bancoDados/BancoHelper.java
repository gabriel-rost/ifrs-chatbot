package com.example.chatbot.bancoDados;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "chatbot.db";
    private static final int DATABASE_VERSION = 1;

    public BancoHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlChat =
                "CREATE TABLE IF NOT EXISTS interacao (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "id_interacao INTEGER NOT NULL," +
                "resposta VARCHAR NOT NULL" +
                        ")";

        db.execSQL(sqlChat);

        cargaRegistros(db);
    }

    public void cargaRegistros(SQLiteDatabase db) {
        String sqlCargaInicial = "INSERT INTO interacoes (id, id_interacao, resposta)" +
                "VALUES (1, 1, 'Exemplo')";

        db.execSQL(sqlCargaInicial);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Chat");
        onCreate(db);
    }
}
