package Metodos;

import java.util.Scanner;

public class Metodo01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, total;

        System.out.print("Entre com um número: ");
        n1 = leia.nextInt();

        System.out.print("Entre com outro número: ");
        n2 = leia.nextInt();

        total = soma(n1, n2);

        System.out.println("A soma dos números é: " + total);
    }

    static int soma(int numero1, int numero2){

        return numero1 + numero2;
    }


}
