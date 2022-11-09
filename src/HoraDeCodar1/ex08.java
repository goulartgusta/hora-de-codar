package HoraDeCodar1;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
//8
//Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO,
// deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão
// do primeiro valor lido pelo segundo valor lido.
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        int n1 = ler.nextInt();
        System.out.println("Qual o segundo valor?");
        int n2 = ler.nextInt();

        while(n2 < 0 || n2 == 0){
            System.out.println("Informe um valor maior que zero:");
            n2 = ler.nextInt();
        }
        System.out.println("A divisão entre os dois valores é = " + n1/n2);
        ler.close();
    }
}
