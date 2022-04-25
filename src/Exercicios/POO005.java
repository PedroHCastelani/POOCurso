package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class POO005 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o valor de \'a\': ");
        a = leia.nextDouble();

        System.out.println("Digite o valor de \'b\': ");
        b = leia.nextDouble();

        System.out.println("Digite o valor de \'c\': ");
        c = leia.nextDouble();

        System.out.print("\nResposta: ");
        imprimir(equacaoDoSegundoGrau(a, b, c));
    }

    static void imprimir(double[] array){
        System.out.println(Arrays.toString(array));
    }

    static double[] equacaoDoSegundoGrau(double a, double b, double c){

        double d = delta(a, b, c);
        int raizes = 0;

        if (! isEquacaoDoSegundoGrau(a) || d< 0.0) return null;

        if (d > 0) {
            raizes = 2;
        }else {
            raizes = 1;
        }

        double retorno[] = new double[raizes];

        if (d > 0){
            retorno[0] = (-b + Math.sqrt(d)) /2*a;
            retorno[1] = (-b - Math.sqrt(d)) /2*a;
        } else {
            retorno[0] = -b/2*a;
        }
        return retorno;
    }

    static boolean isEquacaoDoSegundoGrau(double a){

        return (a != 0.0);

    }

    static double delta(double a, double b, double c){

        return Math.pow(b, 2) - 4 * a * c;
    }
}
