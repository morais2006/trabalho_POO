public class Administrativo extends Assistente {
    String turno;
    double adicional;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicional) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicional = adicional;
    }

    public double ganhoAnual() {
        if (turno.equals("noite")) {
            return (salario + adicional) * 12;
        }
        return salario * 12;
    }
}
