package HoraDeCodar1.ex04;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do lado da base: ");
        double base = ler.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double altura = ler.nextDouble();
        System.out.println("O valor da area do triangulo é " + (base*altura)/2);
        ler.close();
    }
}
