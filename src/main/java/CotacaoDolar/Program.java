package CotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos dolares vao ser comprados? ");
        double compra = sc.nextDouble();

        double valorCompra = CurrencyConverter.converter(compra);
        System.out.printf("Valor a ser pago em Reais:R$ %.2f%n ", valorCompra);

    }
}
