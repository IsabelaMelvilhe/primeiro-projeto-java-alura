package exercicios;

import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = Leitor.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é impar");
        }
    }
}
