package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();;
        double areaY = y.area();

        System.out.println("Area Triangulo X: " + areaX);
        System.out.println("Area Triangulo Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("Area maior X");
        } else {
            System.out.println("Area maior Y");
        }
        sc.close();
    }
}