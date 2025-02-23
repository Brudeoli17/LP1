import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        //Ler as notas da 1a. e 2a. avaliações de um aluno.
        // Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

        Scanner sc = new Scanner(System.in);

       System.out.print("Informe a nota da primeira prova: ") ;
       double n1 = sc.nextDouble();

       System.out.print("Informe a nota da segunda prova: ");
       double n2 = sc.nextDouble();

       double media = (n1 + n2) / 2;

       if (media >= 6 ) {
           System.out.print("Aprovado");
       } else {
           System.out.print("Reprovado");
       }
        sc.close();
    }
}
