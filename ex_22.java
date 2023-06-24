import java.util.Scanner;

public class ex_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int at = 1995;
        double salario = 2000, aumento = 1.5;
        while (at < 2023){
            at++;
            salario = salario + (salario*aumento/100);
            aumento = aumento*2;
        }
        System.out.println("Salario atual " + salario);
        teclado.close();
    }
}