import java.util.Locale;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {

        // Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
        // Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa
        // total no trimestre e a média mensal de gastos.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int soma = janeiro + fevereiro + marco;
        System.out.println("O valor total de gastos do trimestre e de: " + soma);

        double media = soma / 3;
        System.out.print("A média de valor gasto por mês é de: " + media);

        sc.close();
    };
}
