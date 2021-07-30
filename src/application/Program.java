package application;

import entities.TaxaBrasilJuros;
import entities.TaxaUsaJuros;
import interfaces.TaxaJuros;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("TAXA DE JUROS DO BRASIL");
        System.out.print("Informe taxa de juros: ");
        Double juros = scan.nextDouble();

        System.out.print("Informe o Valor: ");
        Double valor = scan.nextDouble();

        System.out.print("Informe a quantidade de mes: ");
        Integer qde = scan.nextInt();

        TaxaJuros brasilJuros = new TaxaBrasilJuros(juros);

        System.out.println("Taxa cobrada Com Juros: " + String.format("%.2f",brasilJuros.pagamento(valor,qde)));

        System.out.println("TAXA DE JUROS DOS ESTADOS UNIDOS");
        System.out.print("Informe taxa de juros: ");
        juros = scan.nextDouble();

        System.out.print("Informe o Valor: ");
        valor = scan.nextDouble();

        System.out.print("Informe a quantidade de mes: ");
        qde = scan.nextInt();

        TaxaJuros usaJuros = new TaxaUsaJuros(juros);
        System.out.println("Taxa cobrada Com Juros: " + String.format("%.2f",usaJuros.pagamento(valor,qde)));

    }



}
