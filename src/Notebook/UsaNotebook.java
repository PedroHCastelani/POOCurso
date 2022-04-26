package Notebook;

import java.util.Scanner;

public class UsaNotebook {
    public static void main(String[] args){

        int quantidade;

        Scanner leia = new Scanner(System.in);
        Notebook dell = new Notebook();
        dell.processador = "Core I5";
        dell.memoria = 8;


        System.out.println("Dell: ");
        System.out.println("Processador: " + dell.processador);
        System.out.println("Memoria: " + dell.memoria + "RAM");

        Notebook hp = new Notebook();
        hp.processador = "Xeon Extreme";
        hp.memoria = 12;

        System.out.println("\nHP: ");
        System.out.println("Processador: " + dell.processador);
        System.out.println("Memoria: " + dell.memoria + "RAM");
    }
}
