import java.util.Random;

public class Exemplo12 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[10];
        int aux;

        // antes da ordenação
        System.out.println("antes da ordenação");
        for(int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(55);
            System.out.print(x[i] + " ");
        }

        // processo de ordenação --> ordem crescente
        for(int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }

        // impressão após a ordenação
        System.out.println("\ndepois da ordenação");
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
