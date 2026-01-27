package org.example;

public class Rules {
    public static void showRules() {
        System.out.println("\n=====================================");
        System.out.println("        REGRAS DO JOGO");
        System.out.println("=====================================\n");

        System.out.println("OBJETIVO:");
        System.out.println("Adivinhar o número secreto gerado pelo");
        System.out.println("computador antes de acabar as tentativas.\n");

        System.out.println("NÍVEIS DE DIFICULDADE:");
        System.out.println("-------------------------------------");
        System.out.println("FÁCIL");
        System.out.println("- Número entre 1 e 50");
        System.out.println("- 10 tentativas");
        System.out.println("- Pontuação base: 100 pontos\n");

        System.out.println("MÉDIO");
        System.out.println("- Número entre 1 e 100");
        System.out.println("- 7 tentativas");
        System.out.println("- Pontuação base: 200 pontos\n");

        System.out.println("DIFÍCIL");
        System.out.println("- Número entre 1 e 200");
        System.out.println("- 5 tentativas");
        System.out.println("- Pontuação base: 300 pontos\n");

        System.out.println("SISTEMA DE PONTUAÇÃO:");
        System.out.println("-------------------------------------");
        System.out.println("- Pontuação inicial depende do nível");
        System.out.println("- Pontos são perdidos a cada erro");
        System.out.println("- Bônus de +50 pontos para cada");
        System.out.println("  tentativa não utilizada\n");

        System.out.println("SISTEMA DE DICAS:");
        System.out.println("-------------------------------------");
        System.out.println("- Paridade (par/ímpar): -10 pontos");
        System.out.println("- Maior ou menor: -15 pontos");
        System.out.println("- Metade do intervalo: -20 pontos\n");

        System.out.println("MODO SEQUÊNCIA:");
        System.out.println("-------------------------------------");
        System.out.println("- Em vez de um único número, o jogador");
        System.out.println("  deve adivinhar uma SEQUÊNCIA de 3 números");
        System.out.println("- Exemplo de sequência: [5, 8, 2]");
        System.out.println("- O jogador deve acertar cada número");
        System.out.println("  da sequência na ordem correta");
        System.out.println("- As tentativas e a pontuação seguem");
        System.out.println("  o nível de dificuldade escolhido\n");

        System.out.println("HISTÓRICO DE PONTUAÇÕES:");
        System.out.println("-------------------------------------");
        System.out.println("- Armazena as 10 últimas pontuações");
        System.out.println("- Cada registro mostra o nível e a pontuação\n");

        System.out.println("REGRAS GERAIS:");
        System.out.println("-------------------------------------");
        System.out.println("- Apenas números dentro do intervalo");
        System.out.println("- Entradas inválidas não contam tentativa");
        System.out.println("- O jogo termina ao acertar o objetivo");
        System.out.println("  ou ao acabar as tentativas\n");

        System.out.println("Boa sorte e divirta-se!");
        System.out.println("=====================================\n");
    }
}
