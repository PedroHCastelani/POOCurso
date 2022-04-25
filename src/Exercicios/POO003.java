package Exercicios;

import java.util.Scanner;

public class POO003 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double numero;

        System.out.println("Digite um numero: ");
        numero = leia.nextDouble();

        System.out.println(verifica(numero));

    }

    static String verifica(double numero){

        return (numero == 0 ? "Zero" : (numero > 0 ? "Positivo" : "Negativo"));

     /*   if (numero > 0){
            return "Positivo";
        }else if (numero < 0){
            return "Negativo";
        }else {
            return "Zero";
        }*/
    }
}
