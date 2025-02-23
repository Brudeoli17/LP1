import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        //Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais
        // 5% do valor das vendas por ele efetuadas.
        // Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
        // Calcule e escreva o salário final do vendedor.

        Scanner vendaCarro = new Scanner(System.in);

        System.out.print("Informe o salário fixo: ");
        double salarioFixo = vendaCarro.nextDouble();

        System.out.print("Informe o valor fixo da comissão de venda: ");
        double comissaoPorCarro = vendaCarro.nextDouble();

        System.out.print("Informe a quantidade de carros vendidos: ");
        double quantidadeCarro = vendaCarro.nextDouble();

        System.out.print("Informe o valor total de venda: ");
        double totalVenda = vendaCarro.nextDouble();

        double comissao = totalVenda * 0.05;
        System.out.println("O valor a receber de comissão é de: " + comissao);

        double comissaoCarro = quantidadeCarro * comissaoPorCarro;
        System.out.println("O valor a receber de comissão por venda é de: " + comissaoCarro);

        double salarioFinal = comissao + comissaoCarro + salarioFixo;
        System.out.println("O salário final será de: " + salarioFinal);

        vendaCarro.close();

    }
}
