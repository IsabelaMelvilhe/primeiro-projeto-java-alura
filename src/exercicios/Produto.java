package exercicios;

import java.text.DecimalFormat;

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 19.90;
        int quantidade = 3;

        double valorTotal = precoProduto * quantidade;

        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("O valor total da compra é: R$"+ formatador.format (valorTotal));
    }
}
