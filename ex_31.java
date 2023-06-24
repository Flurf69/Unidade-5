import java.util.Scanner;

public class ex_31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        int divisor = 2;

        System.out.println("Número Decomposição");
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(numero + " " + divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }
        System.out.println("1");
        teclado.close();
    }
}
