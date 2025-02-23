import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        // Ler o ano atual e o ano de nascimento de uma pessoa.
        // Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.print("Informe seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int valor = anoAtual - anoNascimento;

        if (valor > 16) {
            System.out.print("Apto a votar");
        } else {
            System.out.print("Não pode votar");
        }

        sc.close();

    }
}
