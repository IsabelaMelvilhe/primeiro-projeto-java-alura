package exercicios;

import java.util.Scanner;
public class Perfil {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Preencha seu nome: ");
        String nome = leitor.next ();
        System.out.println("Olá, "+ nome + " tudo bem?");
    }
}
