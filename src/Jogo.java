import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (15 tentativas");
        System.out.println("2. - Médio (10 tentativas)");
        System.out.println("3. - Díficil (5 tentativas)");
        System.out.println("Opção: ");
        int opcao = scanner.nextInt();

        int tentativasMaximas;
        switch(opcao){
            case 1 -> tentativasMaximas = 15;
            case 3 -> tentativasMaximas = 5;
            default -> tentativasMaximas = 10;
        }

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativasUsadas = 0;
        boolean acertou = false;

        System.out.println("Pensei em um número entre 1 e 100. Você tem " + tentativasMaximas + " tentativas.");

        while (tentativasUsadas < tentativasMaximas && !acertou) {
            System.out.print("Tentativa " + (tentativasUsadas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativasUsadas++;

            int distancia = Math.abs(palpite - numeroSecreto);

            if (palpite == numeroSecreto) {
                int pontuacao = Math.max(0, (tentativasMaximas - tentativasUsadas + 1) * 15);
                acertou = true;
                System.out.println("Parabéns! Você acertou em " + tentativasUsadas + " tentativa(s)! Pontuação: " + pontuacao);
            } else {
                String dica = palpite < numeroSecreto ? "maior" : "menor";
                String temperatura;

                if (distancia <= 5) {
                    temperatura = "Quentíssimo!";
                } else if (distancia <= 15) {
                    temperatura = "Quente.";
                } else if (distancia <= 30) {
                    temperatura = "Morno.";
                } else {
                    temperatura = "Frio.";
                }

                System.out.println("O número secreto é " + dica + ". " + temperatura);
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroSecreto);
        }
        scanner.close();
    }
}