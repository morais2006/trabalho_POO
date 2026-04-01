public class Velho extends Imovel {
    double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double precoFinal() {
        return preco - desconto;
    }
}
