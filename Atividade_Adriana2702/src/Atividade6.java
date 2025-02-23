import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius.
// Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: " );
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.print("O valor em Fahrenheit é de: " + fahrenheit + "°F");
        sc.close();
    }

}
