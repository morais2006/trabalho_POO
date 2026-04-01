public class CamaroteInferior extends VIP {
    String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }
}
