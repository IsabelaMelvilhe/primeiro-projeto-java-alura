package exercicios;

import java.util.Random;
import java.util.Scanner;

public class GeradorAleatorio {

    public static void main(String[] args) {
        Random gerador = new Random();
        int numero = gerador.nextInt(100);

        Scanner leitor = new Scanner(System.in);

        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            int palpite = leitor.nextInt();

            tentativas++;

            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (tentativas == 5) {
                System.out.println("Você não acertou o número em 5 tentativas. O número era " + numero + ".");
            } else {
                if (palpite > numero) {
                    System.out.println("O número é menor do que " + palpite + ".");
                } else {
                    System.out.println("O número é maior do que " + palpite + ".");
                }
            }
        }

        leitor.close();

    }
}