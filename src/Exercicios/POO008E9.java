package Exercicios;

import java.util.Scanner;

public class POO008E9 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite um numero inteiro: ");
        numero1 = leia.nextInt();

        System.out.println("Digite um numero inteiro: ");
        numero2 = leia.nextInt();

        System.out.println("O maio numero eh " + Math.max(numero1, numero2));
        System.out.println("O menor numero eh: " + Math.min(numero1, numero2));

    }
}
