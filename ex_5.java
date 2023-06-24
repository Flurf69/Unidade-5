import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int n = teclado.nextInt();
       int num = 0;
       int pot = 0;

       if (n > 2) {
        for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            num = (int) Math.pow(2, pot) * 8 + 2;
            pot += 1;
        } else {
            num = (int) Math.pow(2, pot) * 8;
        }
        System.out.println(num);
        }
    } else {
        System.out.println("erro");
    }
    teclado.close();
}
}

        