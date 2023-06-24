import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de linhas");
        int n = teclado.nextInt();

        int u = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int t = u + 1;
                u = t;
                System.out.print(t + " ");
            }
            System.out.println("");
        }
        teclado.close();
    }
}
