package exercicios;

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
    Scanner Leitor = new Scanner (System.in);

        System.out.println("Informe um número");
        int numero = Leitor.nextInt();

        System.out.println("tabuada do " + numero + ":");
        for (int i = 1; i<= 10; i++){
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }
    }
}
