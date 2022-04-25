package Exercicios;



public class POO013 {
    public static void main(String[] args){
        int[] numeros = new int[6];
        int milhao = 1000000;

        for (int i = 0; i < milhao; i++){

            numeros[dado() - 1]++;

        }

        double[] porcentagens = new double[6];

        for (int i = 0; i < 6; i ++){
            porcentagens[i] = (numeros[i] * 100) / (double) milhao;

            System.out.printf("%d: %d - %.2f%%\n", i + 1, numeros[i], porcentagens[i]);
        }

    }

    static int dado(){

        return (int)(Math.random() * 6)+1;
    }
}
