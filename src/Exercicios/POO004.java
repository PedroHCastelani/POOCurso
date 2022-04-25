package Exercicios;

import java.util.Scanner;

public class POO004 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o valor de \'a\': ");
        a = leia.nextDouble();

        System.out.println("Digite o valor de \'b\': ");
        b = leia.nextDouble();

        System.out.println("Digite o valor de \'c\': ");
        c = leia.nextDouble();

        System.out.println("\nDelta: " + delta(a,b,c));
    }

    static double delta(double a, double b, double c){

        return Math.pow(b, 2) - 4 * a * c;
    }
}
