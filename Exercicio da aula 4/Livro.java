public class Livro {
    private String titulo;
    private int paginas;

    // Construtor
    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    // Método para retornar as informações do livro

    public String toString() {
        return "Título: " + titulo + ", Páginas: " + paginas;
    }
}
