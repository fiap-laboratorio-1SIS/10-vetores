import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[6];

        // armazenamento dos números
        for(int i = 0; i < x.length; i++) {
            System.out.print("Valor --> ");
            x[i] = in.nextInt();
        }

        // impressão dos valores
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        // impressão invertido
        System.out.println();
        for(int i = x.length-1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }

    }
}
