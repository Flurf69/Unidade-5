import java.util.Scanner;

public class ex_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;
        int manha;
        int tarde;
        double vr;

        int mp = 0;
        int dmp = 0;
        int totalmanha = 0;
        int totaltarde = 0;
        String pmp = "";

        int resposta = 1;

        while (resposta == 1) {
            System.out.print("Dia do mês de abril ");
            dia = sc.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                System.out.print("Dia do mês de abril ");
                dia = sc.nextInt();
            }

            System.out.print("Produção no turno da manhã ");
            manha = sc.nextInt();
            System.out.print("Produção no turno da tarde ");
            tarde = sc.nextInt();

            if (dia <= 15) {
                if (manha >= 30 && tarde >= 30 && manha + tarde > 100) {
                    vr = (manha + tarde) * 0.80;
                } else {
                    vr = (manha + tarde) * 0.50;
                }
            } else {
                vr = manha * 0.40 + tarde * 0.30;
            }

            System.out.println("Valor recebido  " + vr);

            if (manha + tarde > mp) {
                mp = manha + tarde;
                dmp = dia;
            }

            if (manha > totalmanha) {
                totalmanha = manha;
                pmp = "manhã";
            }

            if (tarde > totaltarde) {
                totaltarde = tarde;
                pmp = "tarde";
            }

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            resposta = sc.nextInt();
        }

        System.out.println("Dia da maior produção: " + dmp);
        System.out.println("Período de maior produção: " + pmp + " com " + mp + " peças.");

        sc.close();
    }
}
