package HoraDeCodar1.ex04;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do lado do raio: ");
        double raio = ler.nextDouble();
        System.out.println("O valor da area do circulo é " + 3.14*(raio*2));
        ler.close();
    }
}
