package exercicios;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = leitor.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número: " + numero1 + " é maior que o segundo número:  " + numero2);
        }else{
            System.out.println("O primeiro número: " + numero1 + " é menor que o segundo número: " + numero2);
        }
    }
}
