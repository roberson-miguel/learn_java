import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Vamos jogar Par ou Ímpar!");
        
        String escolhaJogador;
        do {
            System.out.print("Escolha Par ou Ímpar (P/I): ");
            escolhaJogador = scanner.next().toUpperCase();
            if (!escolhaJogador.equals("P") && !escolhaJogador.equals("I")) {
                System.out.println("Entrada inválida. Por favor, escolha 'P' para Par ou 'I' para Ímpar.");
            }
        } while (!escolhaJogador.equals("P") && !escolhaJogador.equals("I"));
        
        int numeroJogador = -1;
        boolean numeroValido = false;
        do {
            System.out.print("Escolha um número de 0 a 5: ");
            if (scanner.hasNextInt()) {
                numeroJogador = scanner.nextInt();
                if (numeroJogador >= 0 && numeroJogador <= 5) {
                    numeroValido = true;
                } else {
                    System.out.println("Número inválido. Por favor, escolha um número entre 0 e 5.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        } while (!numeroValido);
        
        System.out.println("Você escolheu: " + numeroJogador);
        System.out.println("Computador está escolhendo um número...");
        Thread.sleep(2000); // Pausa de 2 segundos
        
        int numeroComputador = random.nextInt(6); // Número aleatório de 0 a 5
        System.out.println("O computador escolheu: " + numeroComputador);
        
        Thread.sleep(1500); // Pausa de 1.5 segundos
        int soma = numeroJogador + numeroComputador;
        System.out.println("A soma é: " + soma);
        
        Thread.sleep(1500); // Pausa de 1.5 segundos
        boolean jogadorVenceu = (soma % 2 == 0 && escolhaJogador.equals("P")) ||
                                (soma % 2 != 0 && escolhaJogador.equals("I"));
        
        if (jogadorVenceu) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
        
        scanner.close();
    }
}



