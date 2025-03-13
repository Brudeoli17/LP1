import java.util.Locale;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota do E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota do E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota do API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota do X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite a nota do SUB: ");
        double SUB = scanner.nextDouble();

        double mediaInicial = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        double ajusteAPI = (Math.max((mediaInicial - 5.9), 0) / (mediaInicial - 5.9)) * (API * 0.5);
        double mediaFinal = (mediaInicial * 0.5) + ajusteAPI + X + (SUB * 0.3);

        System.out.printf("A média final de LP1 é: %.2f\n", mediaFinal);

        scanner.close();

    }
}
