import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100

        Scanner scanner = new Scanner(System.in);

        int tentativasMaxima = 10;
        int tentativasUsadas = 0;
        boolean acertou = false;

        System.out.println("Pensei em um número entre 1 e 100. Você tem " + tentativasMaxima + " tentativas.");

        while (tentativasUsadas < tentativasMaxima && !acertou) {
            System.out.print("Tentativa " + (tentativasUsadas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativasUsadas++;

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou em " + tentativasUsadas + " tentativa(s)!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}