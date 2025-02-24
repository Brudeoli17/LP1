import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        //Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
        //sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a hora de início do jogo: ");
        int horaInicio = sc.nextInt();

        System.out.print("Informe a hora de finalização do jogo: ");
        int horaFim = sc.nextInt();

        int duracao;
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)." );

        sc.close();
    }
}
