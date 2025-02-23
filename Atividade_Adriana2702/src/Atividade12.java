import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

        //Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double n1 = sc.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.print("O primeiro valor é maior");
        } else {
            System.out.print("O segundo valor é maior");
        }

        sc.close();

    }
}
