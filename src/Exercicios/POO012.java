package Exercicios;

import java.util.Scanner;

public class POO012 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        String resposta = "";

        do {
            System.out.println("Jogar o dado [s/n]: ");
            resposta = leia.nextLine().toLowerCase();

            if (resposta.charAt(0) == 's') {
                System.out.println("Saiu: " + dado());
            }
        }while(resposta.charAt(0) == 's');
    }

    static int dado(){

        return (int)(Math.random() * 6)+1;

    }
}
