package HoraDeCodar1.ex04;

import java.util.Scanner;

public class paralelogramo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do lado da base: ");
        double base = ler.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double altura = ler.nextDouble();
        System.out.println("O valor da area do paralelogramo é " + base*altura);
        ler.close();
    }
}
