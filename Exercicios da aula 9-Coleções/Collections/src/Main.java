public class Main {
    public static void main(String[] args) {
        Item i1 = new Item(40, "Fone bluethoth");
        Item i2 = new Item(180, "Teclado RGB");
        Item i3 = new Item(980, "Monitor Gamer");
        Item i4 = new Item(60, "Mousepad");

        // Cria o  estoque e adicionar os itens
        Estoque estoque = new Estoque();
        estoque.adicionarArray(i1);
        estoque.adicionarArray(i2);
        estoque.adicionarArray(i3);
        estoque.adicionarArray(i4);

        // Mostrar todos os itens
        System.out.println("Itens no estoque:");
        estoque.mostrarTodosItens();

        // Ordenar itens por valor decrescente
        System.out.println("\nItens ordenados por valor (decrescente):");
        estoque.ordenarDecrescente();
        estoque.mostrarTodosItens();

        // Buscar item pela posição
        System.out.println("\nBuscando item na posição 1:");
        estoque.buscar(1);

        // Deletar item pela posição
        System.out.println("\nDeletando item na posição 0:");
        estoque.deletar(0);
        estoque.mostrarTodosItens();

        // Modificar item
        System.out.println("\nModificando item na posição 1:");
        estoque.modificar(new Item(200, "Notebook"), 1);
        estoque.mostrarTodosItens();
    }
}
