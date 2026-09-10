package ProblemExemplo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com o valor do Raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunfercia(raio);
        double v = Calculator.volume(raio);

        System.out.println("Circunferencia: " + c);
        System.out.println("Volume: " + v);
        System.out.println("Valor de PI:" + Calculator.PI);

        sc.close();
    }
}
