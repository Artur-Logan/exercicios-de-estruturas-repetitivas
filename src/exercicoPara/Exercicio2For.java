package exercicoPara;

import java.util.Scanner;

public class Exercicio2For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int oout = 0;
        int in = 0;

        for (int i = 0; i<x;i++){
            int numero = sc.nextInt();
            if (numero >= 10 && numero <= 20){
                in++;
            } else {
                oout++;
            }
        }

        System.out.println("in: " + in);
        System.out.println("out: " + oout);

        sc.close();
    }
}
