package Exercicios;

import java.util.Scanner;

public class POO011 {
    public static void main(String[] args){

        System.out.println("O menor numero digitado foi: " + menor());

    }

    static int menor(){
        Scanner leia = new Scanner(System.in);
        Scanner leiast = new Scanner(System.in);
        int n;
        int m = Integer.MAX_VALUE;
        char r;

        do {
            System.out.println("Entre com um numero inteiro: ");
            n = leia.nextInt();

            if (n < m){
                m = n;
            }

            System.out.println("Inserir outro[s/n]");
            r = leiast.nextLine().charAt(0);

        }while (r == 's');

        return m;
    }
}
