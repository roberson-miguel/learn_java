import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Vamos jogar Par ou Ímpar!");
        System.out.print("Escolha Par ou Ímpar (P/I): ");
        String escolhaJogador = scanner.next().toUpperCase();
        
        System.out.print("Escolha um número de 0 a 5: ");
        int numeroJogador = scanner.nextInt();
        
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


