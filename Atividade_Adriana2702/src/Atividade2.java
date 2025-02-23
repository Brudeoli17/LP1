import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        // Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
        // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

        Scanner eleicao = new Scanner(System.in);

        // Informando a quantidade total de votos, quatidade de votos nulos, brancos e válidos.
        System.out.print("Informe o número total de eleitores: ");
        int eleitores = eleicao.nextInt();

        System.out.print("Informe o número de votos em brancos: ");
        int brancos = eleicao.nextInt();

        System.out.print("Informe o número de votos nulos: ");
        int nulos = eleicao.nextInt();

        System.out.print("Informe o número de votos válidos: ");
        int varios = eleicao.nextInt();

        // Calculando a porcentagem de votos em branco

        double VotoBranco = ((double) brancos / eleitores) * 100;
        System.out.println("A porcentagem de votos em branco é de : " + VotoBranco + "%");

        // Calculando a porcentagem de votos nulos

        double VotoNulo = ((double) nulos / eleitores) * 100;
        System.out.println("A porcentagem de votos nulos é de : " + VotoNulo + "%");

        // Calculadno a porcentagem de votos válidos

        double VotoVario = ((double) varios / eleitores) * 100;
        System.out.println("A porcentagem de votos válidos é de  : " + VotoVario + "%");

        eleicao.close();

        }

    }
