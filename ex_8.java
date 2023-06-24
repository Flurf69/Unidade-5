import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de números inteiros");
        int n = teclado.nextInt();

        int menor = 999999999;
        int positivos = 0;
        int qtpositivos = 0;

        for (int i=1; i<=n;i++){
            System.out.println("Digite o " + i + "º número real:");
            int numero = teclado.nextInt();

            if (numero>0){
                qtpositivos+=1;
                positivos+=numero;
            } else
            if (numero<menor)
            menor = numero;
        } 
        
        if (menor==999999999){
            System.out.println("não há negativos");
        } else
        System.out.println("menor negativo" + menor);

        System.out.println("A média dos maiores é " + (positivos/qtpositivos));
        teclado.close();
    }
    
}
