public class ex_4 {
    public static void main(String[] args) {
        double S = 0.0;

        for (int i = 1; i <= 20; i++) {
            int numerator = 2 * i + 1;
            int denominator = (i*(i+1));

            double term = (double) numerator / denominator;
            S += term;
        }

        System.out.println("O valor de S é: " + S);
    }
}
