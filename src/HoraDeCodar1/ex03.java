package HoraDeCodar1;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // ex 3 Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
        // Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = ler.nextLine();
        System.out.println("Informe sua idade:");
        int idade = ler.nextInt();
        System.out.println("Olá " + nome + ", sua idade é " + idade);
        ler.close();
    }
}
