import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,
        // cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        // Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
        // que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o total de horas trabalhadas no mês: ");
        double horasTrab = sc.nextDouble();

        System.out.print("Informe o salário base: ");
        double salarioBase = sc.nextDouble();

        double valorHora = salarioBase / (40 * 4);

        double horaExtra = horasTrab - (40 * 4);

        double valorExtra = ((valorHora * 0.5) + valorHora) * horaExtra;

        double salarioFinal = valorExtra + salarioBase;

        System.out.print("\nO salário a receber com as horas extra é de: " + salarioFinal);

        sc.close();
    }
}
