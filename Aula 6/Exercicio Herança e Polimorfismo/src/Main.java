public class Main {

    public static void main(String[] args) {

        Produto[] listaDeProdutos = new Produto[3];

        listaDeProdutos[0] = new Notebook("Notebook Dell Inspiron", 4500.0, 1024, "RTX 4060", "12 Geração Intel Core i7");
        listaDeProdutos[1] = new Camiseta("Cropped Farm", 175.0, "Rosa", "P");
        listaDeProdutos[2] = new Produto("Prateleira para livros", 145.0);

        for (Produto item : listaDeProdutos) {
            if (item instanceof Notebook) {
                System.out.println("Detalhes do Notebook: " + item.etiquetaPreco());
            } else if (item instanceof Camiseta) {
                System.out.println("Detalhes da Camiseta: " + item.etiquetaPreco());
            } else {
                System.out.println("Outros Produtos: " + item.etiquetaPreco());
            }
        }
    }
}