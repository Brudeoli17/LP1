
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
        // Considerar ano com 365 dias e mês com 30 dias.

                Scanner idade = new Scanner(System.in);

                // Informando a idade em anos, meses e dias
                System.out.print("Digite a idade em anos: ");
                int anos = idade.nextInt();

                System.out.print("Digite a idade em meses: ");
                int meses = idade.nextInt();

                System.out.print("Digite a idade em dias: ");
                int dias = idade.nextInt();

                // Calcula a idade total em dias
                int idadeEmDias = (anos * 365) + (meses * 30) + dias;

                // Exibe o resultado
                System.out.println("A idade expressa em dias é: " + idadeEmDias);

                idade.close();
            }
        }
