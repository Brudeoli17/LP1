 import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        // O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        // Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

        Scanner carro = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica: ");
        double custoFabrica = carro.nextDouble();

        double porcDistribuidor = 28;

        double resultado1 = (porcDistribuidor / custoFabrica) * 100;

        double porcImposto = 45;

        double resultado2 = (porcImposto / custoFabrica) * 100 ;

        double resultado3 = resultado1 + resultado2 + custoFabrica;

        System.out.print(resultado3);

        carro.close();

    }
}
