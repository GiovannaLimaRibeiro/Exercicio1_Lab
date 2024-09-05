import java.util.ArrayList;

public class Autor {
    private String nome;
    private ArrayList<Saga> sagas;

    // Construtor
    public Autor(String nome) {
        this.nome = nome;
        this.sagas = new ArrayList<>();
    }

    // Método para adicionar uma saga
    public void adicionarSaga(Saga saga) {
        sagas.add(saga);
    }

    // Método para listar todas as sagas
    public void listarSagas() {
        if (sagas.isEmpty()) {
            System.out.println("Nenhuma saga adicionada.");
        } else {
            System.out.println("Sagas do autor " + nome + ":");
            for (int i = 0; i < sagas.size(); i++) {
                Saga saga = sagas.get(i);
                System.out.println("Saga " + (i + 1) + ":");
                System.out.println("Nota da saga: " + saga.getNota());
                saga.listarLivros(); // Mostra os livros da saga
            }
        }
    }

    // Getter
    public String getNome() {
        return nome;
    }
}
