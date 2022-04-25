package Exercicios;

import java.util.Scanner;

public class POO002 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        double numero;

        System.out.println("Digite um numero: ");
        numero = leia.nextDouble();

        System.out.println("\n" + (!isZero(numero)?"nao " : "") + "eh zero!");

    }

    static boolean isZero(double numero){

        return (numero == 0.0);
    }
}
