import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nome do aluno");
        String aluno = teclado.next();

        while (aluno != "fim"){
            System.out.println("digite 2 notas");
            double n1 = teclado.nextDouble();
            double n2 = teclado.nextDouble();

            double media = (n1 + n2)/2;

            System.out.println("a media de " + aluno + " é " + media );
            System.out.println("digite o nome do proximo aluno");
         aluno = teclado.next();
        }
        teclado.close();
    }
}
