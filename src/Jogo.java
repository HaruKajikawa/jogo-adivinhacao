import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pensei em um número entre 1 e 100. Tente adivinhar:");

        int palpite = scanner.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou!");
        } else if (palpite < numeroSecreto) {
            System.out.println("O número secreto é maior. (número era: " + numeroSecreto + ")");
        } else {
            System.out.println("O número secreto é menor. (número era: " + numeroSecreto + ")");
        }

        scanner.close();
    }
}