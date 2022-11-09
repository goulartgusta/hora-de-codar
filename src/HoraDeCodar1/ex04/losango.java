package HoraDeCodar1.ex04;

import java.util.Scanner;

public class losango {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da diagonal maior: ");
        double dma = ler.nextDouble();
        System.out.println("Informe o valor da diagonal menor: ");
        double dme = ler.nextDouble();
        System.out.println("O valor da area do losango é " + dma*dme/2);
        ler.close();
    }
}
