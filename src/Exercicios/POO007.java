package Exercicios;

import java.util.Scanner;

public class POO007 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite um numero inteiro: ");
        numero1 = leia.nextInt();

        System.out.println("Digite um numero inteiro: ");
        numero2 = leia.nextInt();

        System.out.println("O menor numero é: " + menor(numero1, numero2));
    }

    static int menor(int n1, int n2){
        if (n1 < n2){
            return n1;
        } else{
            return n2;
        }
    }
}
