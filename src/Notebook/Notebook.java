package Notebook;

import java.util.Scanner;

public class Notebook {

        String processador;
        String marca;
        String HD;
        String memoria;

        void ligando(){
            System.out.println("=============================");
            System.out.println("Computador sendo inicializado");
            System.out.println("=============================");
        }

        void escolherNB(){
           Scanner leia = new Scanner(System.in);
           int resposta;

                System.out.println("Escolha qual Notebook quer inicializar: [1/2]");
                resposta = leia.nextInt();


           if (resposta == 1){
                   modeloDell();
           } else {
                 modeloHP();
           }
        }

        void modeloDell(){
            System.out.println(marca = "Dell");
            System.out.println(processador = "Core I5");
            System.out.println(memoria = "8GB RAM");
            System.out.println(HD = "1T");
        }

        void modeloHP(){
            System.out.println(marca = "HP");
            System.out.println(processador = "Core I7");
            System.out.println(memoria = "12GB RAM");
            System.out.println(HD = "500GB");
        }

}
