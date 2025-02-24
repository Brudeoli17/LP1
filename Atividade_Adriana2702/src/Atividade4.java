 import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        // O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        // Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

        Scanner carro = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica: ");
        double custoFabrica = carro.nextDouble();

        double porcDistribuidor = custoFabrica * 0.28;

        double porcImposto = custoFabrica * 0.45;

        double resultado3 = porcDistribuidor + porcImposto + custoFabrica;

        System.out.print(resultado3);

        carro.close();

    }
}
