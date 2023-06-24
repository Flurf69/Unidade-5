import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = teclado.nextInt();
        
        double maior = -99999999;
        double menor = 999999999;
        
        for(int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número real: ");
            double numero = teclado.nextDouble();
            
            if(numero > maior) {
                maior = numero;
            }
            
            if(numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
        
        teclado.close();
    }
}
