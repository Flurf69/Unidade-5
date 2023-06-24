import java.util.Scanner;

public class ex_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario =0;
        int np;
        char r = 's';

        while (r != 'n'){
            System.out.println("Insira o nome do funcionario");
            String nome = teclado.next();
            System.out.println("insira a quantidade de produtos");
            int n = teclado.nextInt();

            for (int i=1; i<=n;i++){
                System.out.println("digite quantas unidades de produtos");
                np = teclado.nextInt();
                System.out.println("digite o preço ");
                double preço = teclado.nextDouble();
                double pp = 1.3*preço*np; 
                salario+=pp;             
            }
            System.out.println("O nome do funcionario é " + nome + " elu vendeu " +n+ " produtos e tem salario de " +salario); 
        }
        teclado.close();
        
    }
}

        