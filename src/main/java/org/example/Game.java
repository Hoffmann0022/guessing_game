package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

   public static void selectLevel(){
       //1º Máximo de números | 2º Máximo de tentativas | 3º Pontuação base
       int[] easy = {50, 10, 100};
       int[] medium = {100, 7, 200};
       int[] hard = {200, 5, 300};
       String[] levels = {"Fácil", "Médio", "Difícil"};
       int level = 0;

       while (level !=4){
            System.out.println("Selecione um nível");
            System.out.println("----------------------");
            System.out.print("1 - Fácil \n2 - Médio \n3 - Difícil \n4 - Voltar\n");
            level = scanner.nextInt();

            switch (level){
                case 1 -> play(easy, levels[0]);
                case 2 -> play(medium, levels[1]);
                case 3 -> play(hard, levels[2]);
                default -> System.out.println("Opção inválida! ");
            }
       }
   }
   static ArrayList<String> scores = new ArrayList<>();
   public static void play(int[] level, String levelName) {

       Random random = new Random();

       int randomNumber = random.nextInt(level[0]) + 1;
       System.out.println("Neste nível você terá que adivinhar um número de 1 a " + level[0] + "." );
       int num = 0;
       double score = level[2];

       for (int i = 1; i <= level[1]; i++){
           System.out.println("Tentativa " + i + " - Digite um número: ");
           System.out.println("----------------------");
           num = scanner.nextInt();

           if (num > level[0] || num < 1){
                System.out.println("Número inválido!");
                i--;
                continue;
           }

           if (num == randomNumber){

               if (i < level[1]){
                    score = score + ((level[1] - i)* 50);
               }

               System.out.println("Parabéns, você adivinhou!!");
               System.out.println("----------------------");
               System.out.println("Sua pontuação foi de " + score + " pontos.");
               break;
           } else {
               System.out.println("Não foi dessa vez, tente novamente!");
               score = score - (level[2]*0.1);
               System.out.println(score);
               System.out.println("----------------------");
               int wantTip = 0;

               do {
                   System.out.println("Deseja uma dica?");
                   System.out.println("----------------------");
                   System.out.println("1 - Sim | 2 - Não");
                   wantTip = scanner.nextInt();

                   if (wantTip != 1 && wantTip != 2){
                       System.out.println("Opção inválida!");
                   }
               }
               while (wantTip != 1 && wantTip != 2);


               if (wantTip == 1){
                   int opcTip = 0;

                   System.out.println("Dicas");
                   System.out.println("----------------------");
                   System.out.println("1 - Dica de paridade (par/ímpar): -10 pontos");
                   System.out.println("2 - Dica de comparação (maior/menor): -15 pontos");
                   System.out.println("3 - Dica de intervalo (metade superior/inferior): -20 pontos");
                   opcTip = scanner.nextInt();

                   switch (opcTip){
                       case 1:
                           score = score - 10;

                           if (randomNumber%2 == 0){
                               System.out.println("Número par");
                           } else {
                               System.out.println("Número ímpar");
                           }
                           break;
                       case 2:
                           score = score - 15;

                           if (num > randomNumber){
                               System.out.println("Menor");
                           } else {
                               System.out.println("Maior");
                           }
                           break;
                       case 3:
                           score = score - 20;

                           int half = level[0]/2;

                           if (randomNumber >= half){
                               System.out.println("Metade superior");
                           } else {
                               System.out.println("Metade Inferior");
                           }
                       break;
                       default:
                           System.out.println("Opção inválida!");
                       break;
                   }
               }
           }
       }

       if (num != randomNumber){
           System.out.println("Que pena, você não adivinhou, o número era: " + randomNumber);
           System.out.println("----------------------");
           System.out.println("Sua pontuação foi de " + score + " pontos.");
           System.out.println("----------------------");
       }

       if (scores.size() < 10) {
           scores.add(levelName + ": " + score);
       } else {
           System.out.println("Ranking cheio!");
       }
   }

    public static void ranking() {
        System.out.println("Pontuações");
        System.out.println("----------------------");
        System.out.println(scores);
    }
}


