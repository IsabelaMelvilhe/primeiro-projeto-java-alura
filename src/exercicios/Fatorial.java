package exercicios;

import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Infome um número");
        double numero = Leitor.nextDouble();

        int fatorial =1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        };
        System.out.println("O fatorial de " + numero + "é: " + fatorial);
    }
}
