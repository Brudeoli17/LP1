import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        // Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
        // Calcular e escrever o valor do novo salário.

        Scanner reajuste = new Scanner(System.in);

        System.out.print("Informe o salário atual: ");
        double salario = reajuste.nextDouble();

        System.out.print("Informe a porcentagem do reajuste: ");
        double porcentagem = reajuste.nextDouble();

        double salario1 = ((salario * porcentagem) / 100) + salario;

        System.out.print(salario1);

        reajuste.close();
    }
}
