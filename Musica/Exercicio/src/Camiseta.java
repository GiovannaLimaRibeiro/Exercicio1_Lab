public class Camiseta extends Produto {

    private String corCamiseta;
    private String tamanhoCamiseta;

    public Camiseta(String nome, double preco, String corCamiseta, String tamanhoCamiseta) {
        super(nome, preco);
        this.corCamiseta = corCamiseta;
        this.tamanhoCamiseta = tamanhoCamiseta;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + " | Cor: " + corCamiseta + " | Tamanho: " + tamanhoCamiseta;
    }
}
