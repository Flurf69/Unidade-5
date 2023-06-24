import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int impar = 0;
        int par = 0;

        for (int i = 1; i <= 100; i++){

            if (i % 2 == 0){
                par += i;
            } else {
                impar += i;
            }
        }
    
    System.out.println("A soma dos numeros pares de 1 até 100 é " + par);
    System.out.println("A soma dos numeros ímpares de 1 até 100 é " + impar);

    teclado.close();
    }
}
