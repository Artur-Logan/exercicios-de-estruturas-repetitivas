package exercicioQuando;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("SENHA INCORRETA");
            senha = sc.nextInt();
        }

        System.out.println("SENHA CORRETA");

        sc.close();
    }

}
