package Exercicios;

import java.util.Scanner;

public class POO010_1 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite o primeiro numero: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = leia.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = leia.nextInt();

        System.out.println("O maior numero digitado foi: " + maior(n1, n2, n3));

    }

    static int maior(int n1, int n2) {

        return Math.max(n1, n2);
    }

    static int maior(int n1, int n2, int n3){

        return maior(n1, maior(n2, n3));
    }
}
