public class Main {
    public static void main(String[] args) {
        double raio = 2.0;
        double altura = 2.0;

        System.out.println("Circunferência: " + Calculadora.circunferencia(raio));
        System.out.println("Volume da Esfera: " + Calculadora.volumeEsfera(raio));
        System.out.println("Volume do Cilindro: " + Calculadora.volumeCilindro(raio, altura));
    }
}