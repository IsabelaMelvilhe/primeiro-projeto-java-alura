package exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha =0;

        while (escolha != 3){

            System.out.println("Menu \nEscolha a ação abaixo: \n1-Calcular área do quadrado \n2-Calcular área do circulo \n3-Sair ");

            escolha = leitor.nextInt();

            if (escolha ==1){
                System.out.println("Digite o lado do quadrado");
                double lado = leitor.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
            }else if (escolha ==2){
                System.out.println("Digite o raio do circulo");
                double raio = leitor.nextDouble();
                double areaCirculo = 3.14* raio * raio;

                System.out.println("A área do circulo é: " + areaCirculo);
            }else if (escolha == 3){
                System.out.println("Programa encerrado");
            }else{
                System.out.println("Opção invalida.");
            }

        }
    }
}
