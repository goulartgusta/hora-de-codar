package HoraDeCodar1.ex04;

import java.util.Scanner;

public class trapezio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do lado da base menor: ");
        double bma = ler.nextDouble();
        System.out.println("Informe o valor da base menor: ");
        double bme = ler.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double altura = ler.nextDouble();
        System.out.println("O valor da area do trapezio é " + ((bme+bma)*altura)/2 );
        ler.close();
    }
}
