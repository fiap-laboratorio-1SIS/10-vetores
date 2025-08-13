import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];

        // armazenar 5 valores recebidos pelo teclado
        for(int i = 0; i < x.length; i++) {
            System.out.print("Informe o valor --> ");
            x[i] = in.nextInt();
        }

        // impressão dos valores no terminal
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
