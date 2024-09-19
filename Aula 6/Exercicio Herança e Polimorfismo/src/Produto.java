public class Produto {

    private String descricaoProduto;
    private double valorProduto;

    public Produto(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public String etiquetaPreco() {
        return descricaoProduto + " valor  R$ " + String.format("%.2f", valorProduto);
    }
}