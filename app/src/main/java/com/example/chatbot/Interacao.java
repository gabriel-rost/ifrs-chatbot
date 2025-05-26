package com.example.chatbot;

public class Interacao {
    int id;
    int idInteracao;
    String resposta;

    public Interacao(int id, int idInteracao, String resposta) {
        this.id = id;
        this.idInteracao= idInteracao;
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public int getId_interacao() {
        return idInteracao;
    }

    public int getId() {
        return id;
    }

}
