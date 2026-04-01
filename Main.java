public class Main {
    public static void main(String[] args) {

        Tecnico t = new Tecnico("João", 2000, 123, 500);
        Administrativo a = new Administrativo("Maria", 1800, 456, "noite", 300);

        t.exibeDados();
        System.out.println("Ganho anual: " + t.ganhoAnual());

        System.out.println("------------");

        a.exibeDados();
        System.out.println("Ganho anual: " + a.ganhoAnual());

        VIP vip = new VIP(100, 50);
        System.out.println("VIP: " + vip.valorVIP());

        Normal n = new Normal(80);
        n.tipoIngresso();

        CamaroteInferior ci = new CamaroteInferior(150, 50, "Fila A");
        ci.imprimirLocalizacao();

        CamaroteSuperior cs = new CamaroteSuperior(200, 100);
        System.out.println("Camarote Superior: " + cs.valorTotal());

        Novo novo = new Novo("Rua A", 200000, 30000);
        Velho velho = new Velho("Rua B", 150000, 20000);

        System.out.println("Novo: " + novo.precoFinal());
        System.out.println("Velho: " + velho.precoFinal());
    }
}