package com.example.chatbot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Contextos {
    public static final String MENSAGEM_CONTEXTO = "Atue como um monitor, fornecendo informações relevantes sobre o IFRS - Campus Rolante. Responda de forma clara, cordial e objetiva em pt-br. Responda utilizando dados fornecidos via chat.";
    public static final String MENSAGEM_CONTEXTO_TADS = "Atue como um monitor, fornecendo informações relevantes sobre o curso Tecnólogo em Análise e Desenvolvimento de Sistemas do IFRS - Campus Rolante. Responda de forma clara, cordial e objetiva em pt-br. Responda utilizando dados fornecidos via chat.";
    public static final String TADS_JSON_COMPLETO = "{\"curso\":{\"nome\":\"Tecnologia em Análise e Desenvolvimento de Sistemas\",\"objetivo\":\"Formar profissionais capazes de atuar no desenvolvimento de software, realizando atividades de análise, projeto, implementação, teste e manutenção de sistemas computacionais, com base em princípios éticos, humanos, sociais e ambientais.\",\"informacoes_gerais\":{\"habilitacao\":\"Tecnólogo em Análise e Desenvolvimento de Sistemas\",\"forma_oferta\":\"Curso Superior de Tecnologia\",\"modalidade\":\"Presencial\",\"carga_horaria_total\":\"2.215 horas\",\"numero_vagas\":35,\"periodicidade_oferta\":\"Anual (início no primeiro semestre)\",\"tempo_integralizacao\":\"6 semestres (3 anos)\",\"tempo_maximo_integralizacao\":\"12 semestres\",\"turno\":\"Noturno\",\"requisito\":\"Ensino Médio concluído\"},\"coordenacao\":{\"nome\":\"Marco Antoni\",\"email\":\"tads@rolante.ifrs.edu.br\"},\"matriz_curricular\":{\"semestres\":[{\"semestre\":1,\"componentes\":[{\"nome\":\"Matemática Básica\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Inglês\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Algoritmos e Programação\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Lógica\",\"horas_relogio\":33,\"horas_aula\":40,\"periodos_semana\":2,\"pre_requisito\":null},{\"nome\":\"Fundamentos da Computação\",\"horas_relogio\":100,\"horas_aula\":120,\"periodos_semana\":6,\"pre_requisito\":null}],\"total_horas_relogio\":331,\"total_horas_aula\":400,\"total_periodos_semana\":20},{\"semestre\":2,\"componentes\":[{\"nome\":\"Organização e Arquitetura de Computadores\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Fundamentos da Computação\"},{\"nome\":\"Algoritmos e Estruturas de Dados\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Algoritmos e Programação, Lógica, Fundamentos da Computação\"},{\"nome\":\"Banco de Dados I\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Fundamentos da Computação\"},{\"nome\":\"Linguagem e Comunicação\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Inglês para Informática\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Inglês\"}],\"total_horas_relogio\":330,\"total_horas_aula\":400,\"total_periodos_semana\":20},{\"semestre\":3,\"componentes\":[{\"nome\":\"Programação Orientada a Objetos\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Algoritmos e Programação\"},{\"nome\":\"Banco de Dados II\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Banco de Dados I\"},{\"nome\":\"Engenharia de Software I\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Sistemas Operacionais\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Organização e Arquitetura de Computadores\"},{\"nome\":\"Métodos Quantitativos\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Matemática Básica\"}],\"total_horas_relogio\":330,\"total_horas_aula\":400,\"total_periodos_semana\":20},{\"semestre\":4,\"componentes\":[{\"nome\":\"Redes de Computadores\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Sistemas Operacionais\"},{\"nome\":\"Desenvolvimento Web I\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Algoritmos e Programação\"},{\"nome\":\"Engenharia de Software II\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Engenharia de Software I\"},{\"nome\":\"Gestão de Projetos\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Engenharia de Software I\"},{\"nome\":\"Informática e Sociedade\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null}],\"total_horas_relogio\":330,\"total_horas_aula\":400,\"total_periodos_semana\":20},{\"semestre\":5,\"componentes\":[{\"nome\":\"Desenvolvimento Web II\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Desenvolvimento Web I, Programação Orientada a Objetos\"},{\"nome\":\"Interação Humano-Computador\",\"horas_relogio\":33,\"horas_aula\":40,\"periodos_semana\":2,\"pre_requisito\":null},{\"nome\":\"Metodologia Científica\",\"horas_relogio\":33,\"horas_aula\":40,\"periodos_semana\":2,\"pre_requisito\":\"Linguagem e Comunicação\"},{\"nome\":\"Projeto Multidisciplinar\",\"horas_relogio\":100,\"horas_aula\":120,\"periodos_semana\":6,\"pre_requisito\":\"Programação Orientada a Objetos, Engenharia de Software II, Banco de Dados I, Desenvolvimento Web I\"},{\"nome\":\"Teste e Qualidade de Software\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Engenharia de Software II\"},{\"nome\":\"Programação para Dispositivos Móveis\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Programação Orientada a Objetos, Desenvolvimento Web I\"},{\"nome\":\"Legislação Aplicada à Informática\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Linguagem e Comunicação\"}],\"total_horas_relogio\":430,\"total_horas_aula\":520,\"total_periodos_semana\":26},{\"semestre\":6,\"componentes\":[{\"nome\":\"Empreendedorismo e Inovação\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Tópicos Especiais em Informática\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Projeto Multidisciplinar\"},{\"nome\":\"Optativa\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Segurança da Informação\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Redes de Computadores\"},{\"nome\":\"Trabalho de Conclusão de Curso\",\"horas_relogio\":100,\"horas_aula\":120,\"periodos_semana\":6,\"pre_requisito\":\"Metodologia Científica\"}],\"total_horas_relogio\":364,\"total_horas_aula\":440,\"total_periodos_semana\":22}],\"componentes_optativos\":[{\"nome\":\"Frameworks para Desenvolvimento de Software\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Desenvolvimento Web II\"},{\"nome\":\"Língua Brasileira de Sinais - Libras\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":null},{\"nome\":\"Introdução à Robótica e à Internet das Coisas\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Algoritmos e Estruturas de Dados, Redes de Computadores\"},{\"nome\":\"Inteligência Artificial\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Algoritmos e Estruturas de Dados\"},{\"nome\":\"Administração e Configuração de Serviços e Servidores\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Redes de Computadores, Sistemas Operacionais\"},{\"nome\":\"Monitoramento e Gerência de Redes\",\"horas_relogio\":66,\"horas_aula\":80,\"periodos_semana\":4,\"pre_requisito\":\"Redes de Computadores\"}],\"atividades_complementares\":{\"carga_horaria\":\"100 horas\"}}}}\n";
    public static final String TADS_INFORMACOES_GERAIS = "  \"curso\": {\n" +
            "    \"nome\": \"Tecnologia em Análise e Desenvolvimento de Sistemas\",\n" +
            "    \"objetivo\": \"Formar profissionais capazes de atuar no desenvolvimento de software, realizando atividades de análise, projeto, implementação, teste e manutenção de sistemas computacionais, com base em princípios éticos, humanos, sociais e ambientais.\",\n" +
            "    \"informacoes_gerais\": {\n" +
            "      \"habilitacao\": \"Tecnólogo em Análise e Desenvolvimento de Sistemas\",\n" +
            "      \"forma_oferta\": \"Curso Superior de Tecnologia\",\n" +
            "      \"modalidade\": \"Presencial\",\n" +
            "      \"carga_horaria_total\": \"2.215 horas\",\n" +
            "      \"numero_vagas\": 35,\n" +
            "      \"periodicidade_oferta\": \"Anual (início no primeiro semestre)\",\n" +
            "      \"tempo_integralizacao\": \"6 semestres (3 anos)\",\n" +
            "      \"tempo_maximo_integralizacao\": \"12 semestres\",\n" +
            "      \"turno\": \"Noturno\",\n" +
            "      \"requisito\": \"Ensino Médio concluído\"\n" +
            "    }";
    public static final String TADS_COORDENACAO = "    \"coordenacao\": {\n" +
            "      \"nome\": \"Marco Antoni\",\n" +
            "      \"email\": \"tads@rolante.ifrs.edu.br\"\n" +
            "    }";
    public static final String TADS_MATRIZ_CURRICULAR_PRIMEIRO_SEMESTRE = "{\n" +
            "          \"semestre\": 1,\n" +
            "          \"componentes\": [\n" +
            "            {\n" +
            "              \"nome\": \"Matemática Básica\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Inglês\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Algoritmos e Programação\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Lógica\",\n" +
            "              \"horas_relogio\": 33,\n" +
            "              \"horas_aula\": 40,\n" +
            "              \"periodos_semana\": 2,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Fundamentos da Computação\",\n" +
            "              \"horas_relogio\": 100,\n" +
            "              \"horas_aula\": 120,\n" +
            "              \"periodos_semana\": 6,\n" +
            "              \"pre_requisito\": null\n" +
            "            }\n" +
            "          ],\n" +
            "          \"total_horas_relogio\": 331,\n" +
            "          \"total_horas_aula\": 400,\n" +
            "          \"total_periodos_semana\": 20\n" +
            "        }";
    public static final String TADS_MATRIZ_CURRICULAR_SEGUNDO_SEMESTRE = "        {\n" +
            "          \"semestre\": 2,\n" +
            "          \"componentes\": [\n" +
            "            {\n" +
            "              \"nome\": \"Organização e Arquitetura de Computadores\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Fundamentos da Computação\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Algoritmos e Estruturas de Dados\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Algoritmos e Programação, Lógica, Fundamentos da Computação\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Banco de Dados I\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Fundamentos da Computação\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Linguagem e Comunicação\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Inglês para Informática\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Inglês\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"total_horas_relogio\": 330,\n" +
            "          \"total_horas_aula\": 400,\n" +
            "          \"total_periodos_semana\": 20\n" +
            "        }";

    public static final String TADS_MATRIZ_CURRICULAR_TERCEIRO_SEMESTRE = "    {\n" +
            "          \"semestre\": 3,\n" +
            "          \"componentes\": [\n" +
            "            {\n" +
            "              \"nome\": \"Programação Orientada a Objetos\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Algoritmos e Programação\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Banco de Dados II\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Banco de Dados I\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Engenharia de Software I\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Sistemas Operacionais\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Organização e Arquitetura de Computadores\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Métodos Quantitativos\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Matemática Básica\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"total_horas_relogio\": 330,\n" +
            "          \"total_horas_aula\": 400,\n" +
            "          \"total_periodos_semana\": 20\n" +
            "        }";

    public static final String TADS_MATRIZ_CURRICULAR_QUARTO_SEMESTRE = "{\n" +
            "          \"semestre\": 4,\n" +
            "          \"componentes\": [\n" +
            "            {\n" +
            "              \"nome\": \"Redes de Computadores\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Sistemas Operacionais\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Desenvolvimento Web I\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Algoritmos e Programação\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Engenharia de Software II\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Engenharia de Software I\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Gestão de Projetos\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Engenharia de Software I\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Informática e Sociedade\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            }\n" +
            "          ],\n" +
            "          \"total_horas_relogio\": 330,\n" +
            "          \"total_horas_aula\": 400,\n" +
            "          \"total_periodos_semana\": 20\n" +
            "        }";

    public static final String TADS_MATRIZ_CURRICULAR_QUINTO_SEMESTRE = "{\n" +
            "          \"semestre\": 5,\n" +
            "          \"componentes\": [\n" +
            "            {\n" +
            "              \"nome\": \"Desenvolvimento Web II\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Desenvolvimento Web I, Programação Orientada a Objetos\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Interação Humano-Computador\",\n" +
            "              \"horas_relogio\": 33,\n" +
            "              \"horas_aula\": 40,\n" +
            "              \"periodos_semana\": 2,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Metodologia Científica\",\n" +
            "              \"horas_relogio\": 33,\n" +
            "              \"horas_aula\": 40,\n" +
            "              \"periodos_semana\": 2,\n" +
            "              \"pre_requisito\": \"Linguagem e Comunicação\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Projeto Multidisciplinar\",\n" +
            "              \"horas_relogio\": 100,\n" +
            "              \"horas_aula\": 120,\n" +
            "              \"periodos_semana\": 6,\n" +
            "              \"pre_requisito\": \"Programação Orientada a Objetos, Engenharia de Software II, Banco de Dados I, Desenvolvimento Web I\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Teste e Qualidade de Software\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Engenharia de Software II\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Programação para Dispositivos Móveis\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Programação Orientada a Objetos, Desenvolvimento Web I\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Legislação Aplicada à Informática\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Linguagem e Comunicação\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"total_horas_relogio\": 430,\n" +
            "          \"total_horas_aula\": 520,\n" +
            "          \"total_periodos_semana\": 26\n" +
            "        }";

    public static final String TADS_MATRIZ_CURRICULAR_SEXTO_SEMESTRE = " {\n" +
            "          \"semestre\": 6,\n" +
            "          \"componentes\": [\n" +
            "            {\n" +
            "              \"nome\": \"Empreendedorismo e Inovação\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Tópicos Especiais em Informática\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Projeto Multidisciplinar\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Optativa\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": null\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Segurança da Informação\",\n" +
            "              \"horas_relogio\": 66,\n" +
            "              \"horas_aula\": 80,\n" +
            "              \"periodos_semana\": 4,\n" +
            "              \"pre_requisito\": \"Redes de Computadores\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"nome\": \"Trabalho de Conclusão de Curso\",\n" +
            "              \"horas_relogio\": 100,\n" +
            "              \"horas_aula\": 120,\n" +
            "              \"periodos_semana\": 6,\n" +
            "              \"pre_requisito\": \"Metodologia Científica\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"total_horas_relogio\": 364,\n" +
            "          \"total_horas_aula\": 440,\n" +
            "          \"total_periodos_semana\": 22\n" +
            "        }";

    public static final String TADS_COMPONENTES_OPTATIVOS_E_COMPLEMENTARES = "\n" +
            "      \"componentes_optativos\": [\n" +
            "        {\n" +
            "          \"nome\": \"Frameworks para Desenvolvimento de Software\",\n" +
            "          \"horas_relogio\": 66,\n" +
            "          \"horas_aula\": 80,\n" +
            "          \"periodos_semana\": 4,\n" +
            "          \"pre_requisito\": \"Desenvolvimento Web II\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"nome\": \"Língua Brasileira de Sinais - Libras\",\n" +
            "          \"horas_relogio\": 66,\n" +
            "          \"horas_aula\": 80,\n" +
            "          \"periodos_semana\": 4,\n" +
            "          \"pre_requisito\": null\n" +
            "        },\n" +
            "        {\n" +
            "          \"nome\": \"Introdução à Robótica e à Internet das Coisas\",\n" +
            "          \"horas_relogio\": 66,\n" +
            "          \"horas_aula\": 80,\n" +
            "          \"periodos_semana\": 4,\n" +
            "          \"pre_requisito\": \"Algoritmos e Estruturas de Dados, Redes de Computadores\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"nome\": \"Inteligência Artificial\",\n" +
            "          \"horas_relogio\": 66,\n" +
            "          \"horas_aula\": 80,\n" +
            "          \"periodos_semana\": 4,\n" +
            "          \"pre_requisito\": \"Algoritmos e Estruturas de Dados\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"nome\": \"Administração e Configuração de Serviços e Servidores\",\n" +
            "          \"horas_relogio\": 66,\n" +
            "          \"horas_aula\": 80,\n" +
            "          \"periodos_semana\": 4,\n" +
            "          \"pre_requisito\": \"Redes de Computadores, Sistemas Operacionais\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"nome\": \"Monitoramento e Gerência de Redes\",\n" +
            "          \"horas_relogio\": 66,\n" +
            "          \"horas_aula\": 80,\n" +
            "          \"periodos_semana\": 4,\n" +
            "          \"pre_requisito\": \"Redes de Computadores\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"atividades_complementares\": {\n" +
            "        \"carga_horaria\": \"100 horas\"\n" +
            "      }";
    public static final String INSTITUICAO = "    \"instituicao\": {\n" +
            "        \"nome_oficial\": \"Instituto Federal de Educação, Ciência e Tecnologia do Rio Grande do Sul – Campus Rolante\",\n" +
            "        \"sigla\": \"IFRS - Campus Rolante\",\n" +
            "        \"tipo\": \"Instituição pública federal de ensino gratuito\",\n" +
            "        \"rede\": \"IFRS (rede multicampi)\",\n" +
            "        \"endereco\": {\n" +
            "            \"logradouro\": \"Rodovia RS-239, Km 68, Nº 3505 (Estrada Taquara/Rolante)\",\n" +
            "            \"cep\": \"95690-000\",\n" +
            "            \"cidade\": \"Rolante\",\n" +
            "            \"estado\": \"RS\",\n" +
            "            \"caixa_postal\": \"118 (correspondência)\"\n" +
            "        },\n" +
            "        \"contato_geral\": {\n" +
            "            \"telefone\": \"(51) 3547-9600\"\n" +
            "        },\n" +
            "        \"website\": \"https://ifrs.edu.br/rolante\"\n" +
            "    }";
}
