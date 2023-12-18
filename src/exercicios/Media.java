package exercicios;

import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe sua primeira nota");
        double nota1 = leitor.nextDouble();
        System.out.println("Informe sua segunda nota");
        double nota2 = leitor.nextDouble();
       double media = (nota1 + nota2)/2;

        System.out.println("A média das notas é: " + media);

    }
}
