import java.util.Scanner;

public class ex_24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double limite;
        char resposta = 's';
        double peso;
        double sp = 0;

        System.out.println("insira o limite diário ");
            limite = teclado.nextDouble();

        while (resposta != 'n'){
            System.out.println("Insira o peso do pexe ");
            peso = teclado.nextDouble();

            sp += peso/1000;
            if (sp>limite){
                System.out.println("Limite de pexe excedido fim do programa");
                System.out.println("Gostaria de registrar mais pexe? s/n");
                resposta = teclado.next().charAt(0);
            }
        }
        teclado.close();
    }
}