package Exercicios;

public class POO013_1 {
    public static void main(String[] args){
        int um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0, seis = 0;
        int milhao = 1000000;

        for (int i = 0; i < milhao; i++){
            switch (dado()){
                case 1 -> {
                    um++;
                }

                case 2 -> {
                    dois++;
                }

                case 3 -> {
                    tres++;
                }

                case 4 -> {
                    quatro++;
                }

                case 5 -> {
                    cinco++;
                }

                case 6 -> {
                    seis++;
                }
            }
        }

        double umPer = (um * 100) / (double) milhao;
        double doisPer = (dois * 100) / (double) milhao;
        double tresPer = (tres * 100) / (double) milhao;
        double quatroPer = (quatro * 100) / (double) milhao;
        double cincoPer = (cinco * 100) / (double) milhao;
        double seisPer = (seis * 100) / (double) milhao;

        System.out.printf("1: %d - %.2f%%\n", um, umPer);
        System.out.printf("2: %d - %.2f%%\n", dois, doisPer);
        System.out.printf("3: %d - %.2f%%\n", tres, tresPer);
        System.out.printf("4: %d - %.2f%%\n", quatro, quatroPer);
        System.out.printf("5: %d - %.2f%%\n", cinco, cincoPer);
        System.out.printf("6: %d - %.2f%%\n", seis, seisPer);
    }

    static int dado(){

        return (int)(Math.random() * 6)+1;
    }
}
