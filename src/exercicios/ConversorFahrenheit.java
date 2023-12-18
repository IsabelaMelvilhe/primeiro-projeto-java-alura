package exercicios;

import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] args){

        System.out.println("Conversor Celsius para Fahrenheit");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius ");

        double celsius = leitor.nextDouble();

        double fahrenheit = (celsius *1.8 ) +32;

        String mensagem = String.format("A temperatura de %f Celcius é equivalente a %f Fahrenheit ", celsius, fahrenheit);

        System.out.println(mensagem);

        int temperatura = (int) fahrenheit;
        System.out.println("A temperatura Fahrenheit inteira é: " + temperatura);

    }
}
