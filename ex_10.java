

public class ex_10 {
    public static void main(String[] args) {

        int q = 0;

        for (int i=1;i<=99999;i++){
            
            for(int g=1;g<=99999;g++){
                int j = i+g;
                String d = i+""+g;
                int x = Integer.parseInt(d);

                if (Math.pow((j), 2) == x) {
                    System.out.println(i+"+"+g+"="+j+"->"+j+"^2 ="+x);
                    q++;
                
                }
                if (q==10) {
                    break;
                }
            }
            }
        }
    }