public class Main {
    public static void main(String[] args) {

        Banda banda = new Banda("Natiruts", 3, 15);

        banda.imprimirInfoBanda();

        Musica[] novasMusicas = {
                new Musica("Sorri, sou rei", "Natiruts"),
                new Musica("Quero Ser Feliz Também", "Natiruts"),
                new Musica("Andei só", "Natiruts"),
                new Musica("Me Namora", "Natiruts")
        };

        System.out.println();

        for (int i = 0; i < novasMusicas.length; i++) {
            if (banda.adicionarMusica(novasMusicas[i])) {
                System.out.println(novasMusicas[i].getNome() + " adicionada!");
            } else {
                System.out.println("Falha ao adicionar " + novasMusicas[i].getNome());
            }
        }

        System.out.println();
        banda.tocarMusica(2);

        System.out.println();
        banda.tocarShow();

        System.out.println();
        if (banda.deletarMusica("Me Namora")) {
            System.out.println("Música deletada com sucesso.");
        } else {
            System.out.println("Falha ao deletar.");
        }
        System.out.println();
        banda.tocarShow();
    }
}