package SalarioFuncionario;

public class Funcionario {
    public String nome;
    public double salariobruto;
    public double taxa;

    public double salarioLiquido() {
        return salariobruto * taxa;
    }

    public void aumentoSalario(double porcentagem) {
        salariobruto += salariobruto * porcentagem;
    }

    public String toString(){
        return nome + ", $" + String.format("%.2f", salariobruto);
    }
}

