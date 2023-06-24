import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        double altura = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a altura da " + i + "pessoa");
            altura = teclado.nextDouble();
            soma += altura;
        }

        double media = soma/20;
        System.out.println("A média da altura das 20 pessoas é " + media);
        teclado.close();
    }
}