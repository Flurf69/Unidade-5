public class ex_11 {
    public static void main(String[] args) {
        int tcb = 0;
        int cb = 0;

        for (int hour = 1; hour <= 16; hour++) {
            if (hour == 1) {
                cb = 1;
            } else {
                cb = cb * 3;
            }

            tcb += cb;
        }

        System.out.println("No final do dia, foram quebrados " + tcb + " biscoitos.");
    }
}
