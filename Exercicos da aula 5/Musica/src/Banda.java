public class Banda {

        private Musica[] musicas;
        private String nome;
        private int numeroIntegrantes;


        public Banda(String nome, int numeroIntegrantes, int maxMusicas) {
            this.nome = nome;
            this.numeroIntegrantes = numeroIntegrantes;
            this.musicas = new Musica[maxMusicas]; // Array de músicas
        }

        // Toca a  música por posição
        public void tocarMusica(int posicao) {
            if (posicao >= 0 && posicao < musicas.length && musicas[posicao] != null) {
                musicas[posicao].imprimirMusica();
            } else {
                System.out.println("Música não encontrada na posição " + posicao);
            }
        }

        // Mostra todas as músicas
        public void tocarShow() {
            System.out.println("Show da Banda: " + nome + " | Número de Integrantes: " + numeroIntegrantes);
            for (Musica musica : musicas) {
                if (musica != null) {
                    musica.imprimirMusica();
                }
            }
        }

        public boolean adicionarMusica(Musica musica) {
            for (int i = 0; i < musicas.length; i++) {
                if (musicas[i] == null) {
                    musicas[i] = musica;
                    return true;
                }
            }
            return false;
        }

        public boolean deletarMusica(String nome) {
            for (int i = 0; i < musicas.length; i++) {
                if (musicas[i] != null && musicas[i].getNome().equals(nome)) {
                    musicas[i] = null;
                    return true;
                }
            }
            return false;
        }
    public void imprimirInfoBanda() {
        System.out.println("Nome da Banda: " + nome);
        System.out.println("Número de Integrantes: " + numeroIntegrantes);
    }

}
