CREATE TABLE interacoes (
    id INTEGER PRIMARY KEY,
    id_interacao INT NOT NULL,
    resposta TEXT NOT NULL,
);

INSERT INTO interacoes (id, id_interacao, resposta)
VALUES (1, 1, "Exemplo de interação");