import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double desconto=0;
        double vc=0;
        double vddd=0;
        double vt=0;

        System.out.println("infrme o valor de compra:");
        vc = teclado.nextDouble();


        while (vc>500){

            desconto = 0.20;
            vddd = vc*desconto;
            vt = vc-vddd;
            break;
        }
        while (vc<=500){
            desconto = 0.15;
            vddd = vc*desconto;
            vt = vc-vddd;
            break;
        }
        System.out.println("o valor a ser pago será " + vt);
        teclado.close();
    }
}
