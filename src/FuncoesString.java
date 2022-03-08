import java.util.Scanner;

public class FuncoesString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int tamanho = max(x, y, z);

        showResult(tamanho);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux = 0;
        if(x > y && x > z){
            aux = x;
        } else if (y > x && y > z){
            aux = y;
        } else if (z > x && z > y){
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior numro é" + value);
    }
}