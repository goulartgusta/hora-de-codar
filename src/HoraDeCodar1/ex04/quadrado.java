package HoraDeCodar1.ex04;

import java.util.Scanner;

public class quadrado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado: ");
        int lado = ler.nextInt();
        System.out.println("O valor da area do quadrado é " + lado*lado);
        ler.close();
    }
}
