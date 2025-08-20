import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        boolean especial = true;

        System.out.print("Total de números: ");
        total = sc.nextInt();

        int[] x = new int[total];

        // entrada de dados
        for(int i = 0; i < x.length; i++) {
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
        }

        // verificar se o array é especial ou não
        for(int i = 0; i < x.length-1; i++) {
            if(x[i] % 2 == x[i + 1] % 2) {
                especial = false;
                break;
            }
        }
        if(especial) {
            System.out.println("Array é especial");
        }
        else {
            System.out.println("Array não é especial");
        }
    }
}
