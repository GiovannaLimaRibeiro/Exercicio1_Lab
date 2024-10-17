public class Item {
    private int valor;
    private String nome;

    public Item(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    // Getters
    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    // Método para exibir informações do Item
    public void mostrarInfo() {
        System.out.println("Item: " + nome + ", Valor: " + valor);
    }
}

