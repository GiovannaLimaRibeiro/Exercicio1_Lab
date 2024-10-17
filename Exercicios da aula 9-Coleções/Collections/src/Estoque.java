import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Estoque {
    private ArrayList<Item> itensArray = new ArrayList<>();

    //Adiciona intens no array
    public void adicionarArray(Item item) {
        itensArray.add(item);
    }

   //Busca esses itens
    public void buscar(int posicao) {
        if (posicao >= 0 && posicao < itensArray.size()) {
            Item item = itensArray.get(posicao);
            item.mostrarInfo();
        } else {
            System.out.println("Posição inválida.");
        }
    }

    // Deleta um item por meio da posição desse item
    public void deletar(int posicao) {
        if (posicao >= 0 && posicao < itensArray.size()) {
            itensArray.remove(posicao);
            System.out.println("Item deletado.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    // Deleta um item pelo objeto
    public void deletar(Item item) {
        if (itensArray.contains(item)) {
            itensArray.remove(item);
            System.out.println("Item deletado.");
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    // Modifica um item
    public void modificar(Item item, int posicao) {
        if (posicao >= 0 && posicao < itensArray.size()) {
            itensArray.set(posicao, item);
            System.out.println("Item modificado.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    //Método para ordenar por valor em ordem decrescente
    public void ordenarDecrescente() {
        Collections.sort(itensArray,new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                return Integer.compare(i2.getValor(), i1.getValor());
            }
        });
    }

    // Mostra todos os itens
    public void mostrarTodosItens() {
        for (Item item : itensArray) {
            item.mostrarInfo();
        }
    }
}