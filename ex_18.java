import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int canal = -1;
        double tp = 0;
        int pa;
        int al4 = 0;
        int al5 = 0;
        int al9 = 0;
        int al12 = 0;

        System.out.println("Digite o número do canal (4, 5, 9, 12) e o número de pessoas assistindo:");

        while (canal != 0) {
            canal = teclado.nextInt();

            if (canal == 0) {
                break;
            }

            pa = teclado.nextInt();
            tp += pa;

            switch (canal) {
                case 4:
                    al4 += pa;
                    break;
                case 5:
                    al5 += pa;
                    break;
                case 9:
                    al9 += pa;
                    break;
                case 12:
                    al12 += pa;
                    break;
                default:
                    System.out.println("Canal inválido.");
                    break;
            }
        }

        double pa4 =  (al4 / tp) * 100;
        double pa5 =  (al5 / tp) * 100;
        double pa9 =  (al9 / tp) * 100;
        double pa12 =  (al12 / tp) * 100;

        System.out.println("Percentual de audiência para o Canal 4 " + pa4);
        System.out.println("Percentual de audiência para o Canal 5 " + pa5);
        System.out.println("Percentual de audiência para o Canal 9 " + pa9);
        System.out.println("Percentual de audiência para o Canal 12 " + pa12);

        teclado.close();
    }
}