import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pontosD=0;
        int pontosE=0;
        char QF;

        while (pontosD>=0 && pontosE>=0){
            System.out.println("quem fez ponto? d/e ");
            QF = teclado.next().charAt(0);
            if (QF == 'd'){
                pontosD++;
            } else if (QF =='e'){
                pontosE++;
            } else {
                System.out.println("letra invalida");
                System.out.println(" tente novamente");
                QF = teclado.next().charAt(0);
            }
            System.out.println("D tem " +pontosD+ " pontos");
            System.out.println("E tem " +pontosE+ " pontos");
            if (((pontosD-pontosE)>=2 && pontosD>=21) || ((pontosE-pontosD)>=2 && pontosE>=21)){
                break;
            }
            }
            if (pontosD<pontosE){
                System.out.println("Lado E ganhou");
            } else {
                System.out.println("Lado D ganhou");
            }
            System.out.println("Cabo");
            teclado.close();
        }
        }
