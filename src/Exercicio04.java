import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                        "Junho", "Julho", "Agosto", "Setembro",
                        "Outubro", "Novembro", "Dezembro"};
        double[] temperatura = new double[mes.length];
        double media = 0;

        // entrada das temperatura
        for(int i = 0; i < temperatura.length; i++) {
            System.out.print("Temperatura de " + mes[i] + " --> ");
            temperatura[i] = sc.nextDouble();
            media = media + temperatura[i];
        }

        // cálculo da média
        media = media / mes.length;
        System.out.println("Temperatura média anual: " + media);
        for(int i = 0; i < temperatura.length; i++) {
            if(temperatura[i] > media) {
                System.out.println(mes[i] + " --> " + temperatura[i]);
            }
        }
    }
}
