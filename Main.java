import java.util.Scanner;

public class Main {

    // Função que calcular o fatorial de n
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    // Função que calcula e imprimi todos os números pares entre 0 e n
    public static void mostrar5Pares(int n) {
        System.out.print("Números pares entre 0 e " + n + ": ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int resultadoFatorial = fatorial(n);
        System.out.println("Fatorial de " + n + " é: " + resultadoFatorial);

        mostrarPares(n);
    }
}
