import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        // Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double valor = sc.nextDouble();

        if ( valor >= 0 ){
            System.out.print("Positivo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
