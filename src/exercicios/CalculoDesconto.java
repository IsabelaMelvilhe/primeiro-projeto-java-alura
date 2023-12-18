package exercicios;

public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 59.90;
        double percentualDesconto = 10;

        double valorDesconto = precoOriginal*percentualDesconto/100;

        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("O preço com desconto é: R$" + precoComDesconto);

    }
}
