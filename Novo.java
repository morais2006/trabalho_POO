public class Novo extends Imovel {
    double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double precoFinal() {
        return preco + adicional;
    }
}