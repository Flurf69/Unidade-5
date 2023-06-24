import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double at = 0;
        int f = 0;
        int m = 0;
        double af = 0;

        while (at>=0){
            System.out.println("digite a altura do aluno");
        double a = teclado.nextDouble();
        if (a == 0){
            break;
        }
        System.out.println("digite o genero do aluno");
        char g = teclado.next().toLowerCase().charAt(0);
        if ( g == 'f'){
            at+=a;
            af +=a;
            f++;
        }
        else if (g == 'm'){
            at +=a;
            m++;
        } 
        double mg = at/(m+f);
        double mf = af/f;
        System.out.println("media da altura das mulhers " + (mf));
        System.out.println("media da altura do grupo " + (mg));
    }
    teclado.close();
}
}
