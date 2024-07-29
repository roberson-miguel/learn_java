import java.util.Random;
import java.util.Scanner;

class Jogador {
    private String escolha;
    private int numero;

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

class JogoParOuImpar {
    private Jogador jogador;
    private int numeroComputador;
    private Random random;
    private Scanner scanner;

    public JogoParOuImpar() {
        jogador = new Jogador();
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void iniciarJogo() throws InterruptedException {
        System.out.println("Vamos jogar Par ou Ímpar!");
        escolherParOuImpar();
        escolherNumero();
        escolherNumeroComputador();
        calcularResultado();
    }

    private void escolherParOuImpar() {
        String escolha;
        do {
            System.out.print("Escolha Par ou Ímpar (P/I): ");
            escolha = scanner.next().toUpperCase();
            if (!escolha.equals("P") && !escolha.equals("I")) {
                System.out.println("Entrada inválida. Por favor, escolha 'P' para Par ou 'I' para Ímpar.");
            }
        } while (!escolha.equals("P") && !escolha.equals("I"));
        jogador.setEscolha(escolha);
    }

    private void escolherNumero() {
        int numero = -1;
        boolean numeroValido = false;
        do {
            System.out.print("Escolha um número de 0 a 5: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 0 && numero <= 5) {
                    numeroValido = true;
                } else {
                    System.out.println("Número inválido. Por favor, escolha um número entre 0 e 5.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        } while (!numeroValido);
        jogador.setNumero(numero);
    }

    private void escolherNumeroComputador() throws InterruptedException {
        System.out.println("Você escolheu: " + jogador.getNumero());
        System.out.println("Computador está escolhendo um número...");
        Thread.sleep(2000); // Pausa de 2 segundos

        numeroComputador = random.nextInt(6); // Número aleatório de 0 a 5
        System.out.println("O computador escolheu: " + numeroComputador);
    }

    private void calcularResultado() throws InterruptedException {
        Thread.sleep(1500); // Pausa de 1.5 segundos
        int soma = jogador.getNumero() + numeroComputador;
        System.out.println("A soma é: " + soma);

        Thread.sleep(1500); // Pausa de 1.5 segundos
        boolean jogadorVenceu = (soma % 2 == 0 && jogador.getEscolha().equals("P")) ||
                                (soma % 2 != 0 && jogador.getEscolha().equals("I"));

        if (jogadorVenceu) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }

    public void encerrarScanner() {
        scanner.close();
    }
}

public class ParOuImpar {
    public static void main(String[] args) throws InterruptedException {
        JogoParOuImpar jogo = new JogoParOuImpar();
        jogo.iniciarJogo();
        jogo.encerrarScanner();
    }
}




