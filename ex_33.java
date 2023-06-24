import java.util.Scanner;

public class ex_33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        double votosnulos = 0;
        double votosbranco = 0;
        int tv = 0;

        int voto;

        do {
            System.out.print("Digite o código do voto (1 até 4) (5 nulo e 6 em brancos) (0 para sair): ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    tv++;
                    break;
                case 2:
                    candidato2++;
                    tv++;
                    break;
                case 3:
                    candidato3++;
                    tv++;
                    break;
                case 4:
                    candidato4++;
                    tv++;
                    break;
                case 5:
                    votosnulos++;
                    tv++;
                    break;
                case 6:
                    votosbranco++;
                    tv++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta. Digite um número de opção válido.");
            }
        } while (voto != 0);

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");

        System.out.println("Total de votos nulos: " + votosnulos);
        System.out.println("Total de votos em branco: " + votosbranco);

        double percentualNulos = votosnulos / tv * 100;
        double percentualBranco = votosbranco / tv * 100;

        System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + percentualBranco + "%");
        teclado.close();
    }
}
