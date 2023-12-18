package exercicios;

import java.text.DecimalFormat;

public class ConversorDollar {
    public static void main(String[] args) {
        double valorEmDolares = 100;

        double dollar = 4.94;

        double valorConvertido = valorEmDolares * dollar;

        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("O valor em reais é R$"+ formatador.format (valorConvertido));

    }
}
