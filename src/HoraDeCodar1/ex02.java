package HoraDeCodar1;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
    // ex 2 Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = ler.nextLine();
        System.out.println("Olá " + nome);
        ler.close();
    }
}
