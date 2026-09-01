package SalarioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario emp = new Funcionario();

        System.out.println("Nome: ");
        emp.nome = sc.nextLine();
        System.out.println("Salario Bruto: ");
        emp.salariobruto = sc.nextDouble();
        System.out.println("Taxa: ");
        emp.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + emp);
        System.out.println();
        System.out.println("Qual a porcentagem de aumento de salario?: ");
        double porcentagem = sc.nextDouble();
        emp.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados Atualizados: " + emp);
        sc.close();
    }
}
