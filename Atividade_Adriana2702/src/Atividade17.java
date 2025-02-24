import java.util.Locale;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

    //Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.
    //Fórmula para cálculo de média de LP1.
    //(P1*0.6+((E1+E2)/2)*0.4)*0.5
        // +(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/
        // ((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.3)

        System.out.print("Informe o valor de P1: ");
        double p1 = sc.nextDouble();

        System.out.print("Informe o valor de E1: ");
        double e1 = sc.nextDouble();

        System.out.print("Informe o valor de E2: ");
        double e2 = sc.nextDouble();

        System.out.print("Informe o valor da API: ");
        double api = sc.nextDouble();

        System.out.print("Informe o valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Informe o valor da SUB: ");
        double sub = sc.nextDouble();

        // (P1*0.6+((E1+E2)/2)*0.4)*0.5
        // +(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.3)

        double resultadoMedia = calculoMedia(p1,e1,e2,api,x,sub);

        System.out.print(resultadoMedia);
    }

    public static double calculoMedia(double p1,double e1, double e2, double api, double x, double sub){
       double a = p1*0.6+((e1 + e2)/2)*0.4;
       double b = a-5.9;
       double e = ((a-5.9)+.0);
       double c = (api*0.5)+x+(sub*0.3);
        double d;
        return d = (a*0.5)+(Math.max(e,b))*c;
    }
}
