import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número inteiro: ");
            int n = teclado.nextInt();
            
            if (n % 2 == 0) {
                System.out.println(n + " é um número par");
            } else {
                System.out.println(n + " é um número ímpar");
            }
        }
        
        teclado.close();
    }
}
