package Exercicios;

import java.util.Scanner;

public class POO010 {
    public static void main(String[] args){

        System.out.println("O maior numero digitado foi: " + maior());

    }

    static int maior(){
        Scanner leia = new Scanner(System.in);
        int max;
        max = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite um numero: ");
            int numero = leia.nextInt();

            if (numero > max){
                max = numero;
            }
        }
        return max;
    }
}
