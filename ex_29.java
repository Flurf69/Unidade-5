import java.util.Scanner;

public class ex_29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        int valor = teclado.nextInt();

        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int moedas1 = 0;

        while (valor > 0) {
            if (valor >= 20) {
                notas20++;
                valor -= 20;
            } else if (valor >= 10) {
                notas10++;
                valor -= 10;
            } else if (valor >= 5) {
                notas5++;
                valor -= 5;
            } else if (valor >= 2) {
                notas2++;
                valor -= 2;
            } else {
                moedas1++;
                valor -= 1;
            }
        }

        System.out.println("Quantidade mínima de cédulas:");
        System.out.println("Cédulas de 20: " + notas20);
        System.out.println("Cédulas de 10: " + notas10);
        System.out.println("Cédulas de 5: " + notas5);
        System.out.println("Cédulas de 2: " + notas2);
        System.out.println("Cédulas de 1: " + moedas1);
        teclado.close();
    }
}
