public class Calculadora {
    // Inicializando a constante PI com o valor correto
    private static final double PI = Math.PI;

    public static double circunferencia(double raio) {
        double circunf = 2 * PI * raio;
        return circunf;
    }

    public static double volumeEsfera(double raio) {
        double volEsf = (4.0 / 3.0) * PI * Math.pow(raio, 3);
        return volEsf;
    }

    public static double volumeCilindro(double raio, double altura) {
        double volCil = PI * Math.pow(raio, 2) * altura;
        return volCil;
    }
}