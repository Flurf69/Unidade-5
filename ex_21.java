import java.util.Scanner;

public class ex_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double achico = 1.50;
        double aze = 1.10;
        int anos = 0;

        while (aze<achico){
            achico += 0.02;
            aze += 0.03;
            anos++;
        }
        System.out.println("vai demorar " + anos + " anos para zé ser maior que chico");
        teclado.close();
    }
}
