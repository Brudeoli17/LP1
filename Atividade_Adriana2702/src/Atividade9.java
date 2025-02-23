import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze.
        // Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

        System.out.print("Informe a quantidade de maçãs compradas: ");
        int qtdMaca = sc.nextInt();

        double maca;
        double valor;

        if ( qtdMaca < 12 ) {
            maca = 1.30;
            valor = maca * qtdMaca;
            System.out.print(valor);
        } else {
            maca = 1.00;
            valor = maca * qtdMaca;
            System.out.print(valor);
        }
        sc.close();
    }
}
