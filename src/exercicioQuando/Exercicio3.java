package exercicioQuando;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int codRecebido = sc.nextInt();
        int quantAlccol = 0, quantGasolina = 0, quantDiesel = 0;

        while( codRecebido != 4 ){
            if (codRecebido == 1){
                quantAlccol += 1;
            } else if (codRecebido == 2) {
                quantGasolina += 1;
            } else if (codRecebido == 3){
                quantDiesel += 1;
            }

            codRecebido = sc.nextInt();
        }

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + quantAlccol);
            System.out.println("Gasolina: " + quantGasolina);
            System.out.println("Diesel: "+ quantDiesel);

        sc.close();
    }
}
