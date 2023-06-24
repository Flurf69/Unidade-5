import java.util.Scanner;

public class ex_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tempo = 0;

        System.out.println("insira a massa: ");
        double massa= teclado.nextDouble();
        massa *= 1000;

        while (massa > 0.5){
            massa/=2;
            tempo+=50;
        }
        System.out.println("a massa demora " + tempo + " segundos e de massa " + massa);
        teclado.close();
    }
}