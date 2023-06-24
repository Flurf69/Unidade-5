import java.util.Scanner;

public class ex_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio ");
        double vmp = sc.nextDouble();

        int tavm = 0;
        int ti = 0;
        int ta150 = 0;
        double pedagio = 0;
        while (pedagio >= 0) {
            System.out.print("Pedágio ");
            pedagio = sc.nextDouble();
            System.out.print("Distância (em Km) ");
            int distancia = sc.nextInt();
            ti++;
            if (pedagio > vmp) {
                tavm++;
            }
            if (distancia > 150 && (pedagio <= vmp)) {
                ta150++;
            }
            System.out.print("Pedágio ");
            pedagio = sc.nextDouble();
        }
        System.out.println(tavm + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(ti + " (quantidade de trechos informados)");
        System.out.println(ta150 + " (trechos acima de 150km com valor aceito por ele)");

        sc.close();
    }
}
