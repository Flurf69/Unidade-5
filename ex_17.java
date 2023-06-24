import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ni=1;
        double a;
        int nima = 0;
        int nimb = 0;
        double aama = -1;
        double aamb = 9;
        double sa = 0;
        int qa =0;
        System.out.println("Numero de inscrição:");
            ni = teclado.nextInt();

        while (ni != 0){


            if (ni == 0){
               
            }

            System.out.println("digite a altura:");
            a = teclado.nextDouble();

            if (a>0){

            }

            if (a>aama){
                aama = a;
                nima =ni;
            }
            if (a<aamb){
                aamb = a;
                nimb =ni;
            }
            sa += a;
            qa++;
            double am = sa/qa;
            System.out.println("Atleta mais alto = " + nima + " com " + aama + " metros de altura");
        System.out.println("Atleta mais baixo = " + nimb + " com " + aamb + " metros de altura");
        System.out.println("Altura média dos atletas = " + am + " metros de altura");
            System.out.println("Numero de inscrição:");
            ni = teclado.nextInt();
        }
        System.out.println("fim do programa");
        teclado.close();

    }
}