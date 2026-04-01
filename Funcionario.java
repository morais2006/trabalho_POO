public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
