package NotaAluno;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        System.out.printf("NOTA FINAL: %.2f%n" + aluno.notaFinal());

        if(aluno.notaFinal() < 60.0){
            System.out.println("Reprovado");
            System.out.printf("Pontos %.2f Faltados%n" + aluno.Recuperacao());
        } else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}
