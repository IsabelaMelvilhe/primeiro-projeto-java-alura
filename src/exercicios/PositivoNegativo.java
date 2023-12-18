package exercicios;

import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        }else{
            System.out.println("Número negativo");
        }
    }
}
