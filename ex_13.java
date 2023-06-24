import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de abastecimentos");
        int rt = teclado.nextInt();
        double q = 0;
        double ct = 0;

        for (int i=1; i<=rt;i++){
            System.out.println("reabastecimento " + i);

            System.out.println("digite a quilometragem do odometro");
            double o = teclado.nextDouble();

            System.out.println("digite a quantidade de combustivel comrada");
            double cp = teclado.nextDouble();

            double qpl = o/cp;
            System.out.println("quilmetragem por litro: "+qpl);

            q += o;
            ct += cp;

        }

        double qm = q/ct;
        System.out.println("quilometragem media por litro na viagem foi " +qm);
        teclado.close();
        
    }
    
}