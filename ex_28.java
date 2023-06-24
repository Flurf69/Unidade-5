import java.util.Scanner;

public class ex_28 {
    public static void main(String[] args) {
        int nenhumdenos = 0;
        int cpm22 = 0;
        int skank = 0;
        int jotaquest = 0;
        int tv = 0;

        Scanner teclado = new Scanner(System.in);
        char r = 's';

        while (r =='s') {
            System.out.print("Mais um voto? (s/n) ");
            r = teclado.next().charAt(0);

            if (r == 'n') {
                break;
            }

            System.out.print("Digite o código da banda (1-Nenhum de Nós, 2-CPM22, 3-Skank, 4-Jota Quest): ");
            int codigo = teclado.nextInt();

            switch (codigo) {
                case 1:
                    nenhumdenos++;
                    break;
                case 2:
                    cpm22++;
                    break;
                case 3:
                    skank++;
                    break;
                case 4:
                    jotaquest++;
                    break;
                default:
                    System.out.println("Código inválido");
                    continue;
            }

            tv++;
            teclado.nextLine();
        }

        System.out.println("Total de votos para cada grupo ");
        System.out.println("Nenhum de Nós " + nenhumdenos);
        System.out.println("CPM22 " + cpm22);
        System.out.println("Skank " + skank);
        System.out.println("Jota Quest " + jotaquest);

        System.out.println("Percentual dos votos para cada grupo ");
        System.out.println("Nenhum de Nós: " + (nenhumdenos * 100.0 / tv) + "%");
        System.out.println("CPM22 " + (cpm22 * 100.0 / tv) + "%");
        System.out.println("Skank " + (skank * 100.0 / tv) + "%");
        System.out.println("Jota Quest " + (jotaquest * 100.0 / tv) + "%");

        System.out.println("Grupo vencedor:");
        if (nenhumdenos > cpm22 && nenhumdenos > skank && nenhumdenos > jotaquest) {
            System.out.println("Nenhum de Nós");
        } else if (cpm22 > nenhumdenos && cpm22 > skank && cpm22 > jotaquest) {
            System.out.println("CPM22");
        } else if (skank > nenhumdenos && skank > cpm22 && skank > jotaquest) {
            System.out.println("Skank");
        } else if (jotaquest > nenhumdenos && jotaquest > cpm22 && jotaquest > skank) {
            System.out.println("Jota Quest");
        } else {
            System.out.println("Empate");
        }
        teclado.close();
    }
}
