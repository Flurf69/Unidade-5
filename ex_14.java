import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tm = 20;
        int lm10 = 0;
        int l1020 = 0;
        int l20 = 0;
        double vt = 0;
        double vvt = 0;

        for (int i = 1; i <= tm; i++) {
            System.out.println("Mercadoria " + i);

            System.out.print("Digite o preço de compra da mercadoria: ");
            double precoCompra = teclado.nextDouble();

            System.out.print("Digite o preço de venda da mercadoria: ");
            double precoVenda = teclado.nextDouble();

            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;
            if (lucroPercentual < 10) {
                lm10++;
            } else if (lucroPercentual <= 20) {
                l1020++;
            } else {
                l20++;
            }

            vt += precoCompra;
            vvt += precoVenda;

        }

        double lt = vvt - vt;

        System.out.println("Quantidade de mercadorias com lucro menor que 10% " + lm10);
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20% " + l1020);
        System.out.println("Quantidade de mercadorias com lucro maior que 20% " + l20);
        System.out.println("Valor total de compra das mercadorias " + vt);
        System.out.println("Valor total de venda das mercadorias " + vvt);
        System.out.println("Lucro total: " + lt);

        teclado.close();
    }
}
