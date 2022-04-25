package Exercicios;

import java.util.Scanner;

public class POO001 {

    public static void main (String[] args){

        Scanner leia = new Scanner(System.in);
        double numero;

        System.out.println("Digite um numero: ");
        numero = leia.nextDouble();

        if (isPositivo(numero)) {
            System.out.println("\nPositivo");
        }else {
            System.out.println("\nNegativo");
        }

    }

    static boolean isPositivo(double numero){

        return (numero >= 0.0);
    }

}
