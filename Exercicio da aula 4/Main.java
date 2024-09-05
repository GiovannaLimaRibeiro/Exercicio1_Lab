import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um autor
        System.out.print("Digite o nome do autor: ");
        String nomeAutor = scanner.nextLine();
        Autor autor = new Autor(nomeAutor);

        // Adicionar múltiplas sagas ao autor
        System.out.print("Quantas sagas deseja adicionar? ");
        int quantidadeSagas = scanner.nextInt();

        for (int j = 0; j < quantidadeSagas; j++) {
            System.out.println("Saga " + (j + 1) + ":");
            System.out.print("Digite a nota da saga (0-10): ");
            int notaSaga = scanner.nextInt();
            Saga saga = new Saga(notaSaga);

            // Adicionar livros à saga
            System.out.print("Quantos livros deseja adicionar à saga? ");
            int quantidadeLivros = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            for (int i = 0; i < quantidadeLivros; i++) {
                System.out.println("Livro " + (i + 1) + ":");
                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o número de páginas do livro: ");
                int paginas = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                Livro livro = new Livro(titulo, paginas);
                saga.adicionarLivro(livro);
            }

            // Adicionar a saga ao autor
            autor.adicionarSaga(saga);
        }

        // Listar todas as sagas e livros do autor
        autor.listarSagas();

        scanner.close();
    }
}
