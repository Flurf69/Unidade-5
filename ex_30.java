import java.util.Scanner;

public class ex_30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor inicial ");
        int N = teclado.nextInt();

        System.out.print("Digite o decremento ");
        int K = teclado.nextInt();

        System.out.print("Digite o tamanho da mochila ");
        int M = teclado.nextInt();

        int nm = 0;
        int fm = 0;
        int snm = 0;
        int sfm = 0;

        while (N > 0 && M > 0) {
            System.out.print(N + " "); 

            if (M >= N) {
                nm++;
                snm += N;
                M -= N;
            } else {
                fm++;
                sfm += N;
            }

            N -= K;
        }

        System.out.println("Elementos que entraram na mochila: " + nm);
        System.out.println("Elementos que ficaram fora da mochila: " + fm);
        System.out.println("Soma dos elementos que entraram na mochila: " + snm);
        System.out.println("Soma dos elementos que não entraram na mochila: " + sfm);
        teclado.close();
    }
}
