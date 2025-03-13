import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        // Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double v1 = sc.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double v2 = sc.nextDouble();

        if (v1 < v2) {
            System.out.print(v1 + " , " + v2);
        } else {
            System.out.print(v2 + " , " + v1);
        }

        sc.close();
    }

}
