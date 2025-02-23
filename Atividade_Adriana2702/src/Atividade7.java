import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        if (valor > 10 ) {
            System.out.print("É MAIOR QUE 10!");
        } else {
            System.out.print("NÃO É MAIOR QUE 10!");
        }
        sc.close();
    }
}
