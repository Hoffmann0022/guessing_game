package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcMenu;

        do {
            System.out.println("Menu principal");
            System.out.println("----------------------");
            System.out.print("1 - Novo jogo \n2 - Regras \n3 - Histórico de pontuações \n4 - Sair\n");
            opcMenu = scanner.nextInt();

            if (opcMenu == 1) {
                Game.selectLevel();
            } else if (opcMenu == 2){
                Rules.showRules();
            } else if (opcMenu == 3){
                Game.ranking();
            } else if (opcMenu == 4){
                System.out.println("Encerrando sistema...");
            } else{
                System.out.println("Opção inválida!");
            }

        } while (opcMenu != 4);


    }
}
