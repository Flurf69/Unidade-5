import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        
        for (double i = 1.0; i <= 100.0; i++){
            numero += 1.0/i;

        }
        System.out.println("a soma dos termos até 100 é " + numero);
        teclado.close();
    }
}