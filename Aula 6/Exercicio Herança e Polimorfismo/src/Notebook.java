public class Notebook extends Produto {

    private double espacoDisco;
    private String modeloGPU;
    private String tipoProcessador;

    public Notebook(String nome, double preco, double espacoDisco, String modeloGPU, String tipoProcessador) {
        super(nome, preco);
        this.espacoDisco = espacoDisco;
        this.modeloGPU = modeloGPU;
        this.tipoProcessador = tipoProcessador;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + " | Armazenamento: " + espacoDisco + "GB | GPU: " + modeloGPU + " | CPU: " + tipoProcessador;
    }
}