import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        DecimalFormat mascara = new DecimalFormat("#,##0.00");
        Scanner sc = new Scanner(System.in);
        int qtd;
        double total = 0.0;
        double maiorSalario = 0.0;
        int posicao = 0;

        System.out.print("Informe a quantidade de funcionários --> ");
        qtd = sc.nextInt();

        String[] nome = new String[qtd];
        double[] salario = new double[qtd];

        // entrada de dados
        for(int i = 0; i < qtd; i++) {
            System.out.print("Informe o nome do funcionário --> ");
            nome[i] = sc.next();
            System.out.print("Informe do salário do Sr(a) " + nome[i] + " --> ");
            salario[i] = sc.nextDouble();
            System.out.println();
            total = total + salario[i];
            if(salario[i] > maiorSalario) {
                maiorSalario = salario[i];
                posicao = i;
            }
        }
        System.out.println("Total da folha de pagamento R$ " + mascara.format(total));
        System.out.println("Média salarial R$ " + mascara.format(total/qtd));
        System.out.println("Funcionário com o maior salário --> " + nome[posicao]);
    }
}
