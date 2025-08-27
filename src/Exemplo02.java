import java.util.Random;

public class Exemplo02 {
    public static void main(String[] args) {
        Random rd = new Random();
//        double aux = Math.random()*10;
//        int valor = (int)aux;
//        System.out.println(aux);
//        System.out.println(valor);

        int x = rd.nextInt()%20;
        System.out.println(x);

    }
}
