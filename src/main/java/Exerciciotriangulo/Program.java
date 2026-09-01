package Exerciciotriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a largura e altura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println("AREA: " + retangulo.area());
        System.out.println("PERIMETRO: " + retangulo.perimetro());
        System.out.println("DIAGONAL: " + retangulo.diagonal());
        sc.close();
    }
}
