import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100

        System.out.println("Pensei em um número entre 1 e 100. (debug: " + numeroSecreto + ")");
    }
}
