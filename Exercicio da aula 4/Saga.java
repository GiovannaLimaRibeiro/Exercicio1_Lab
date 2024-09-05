import java.util.ArrayList;

public class Saga {
    private int nota;
    private ArrayList<Livro> livros;

    // Construtor
    public Saga(int nota) {
        this.nota = nota;
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro nesta saga.");
        } else {
            System.out.println("Livros na saga:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    // Getters
    public int getNota() {
        return nota;
    }
}
