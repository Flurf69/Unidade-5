import java.util.Scanner;

public class ex_34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int contafechada = 0;
        
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede ");
                    String nome = teclado.next();
                    
                    System.out.print("Digite o número de diárias ");
                    int numdiarias = teclado.nextInt();
                    
                    double taxas;
                    
                    if (numdiarias < 15) {
                        taxas = 7.50;
                    } else if (numdiarias == 15) {
                        taxas = 6.50;
                    } else {
                        taxas = 5.00;
                    }
                    
                    double total = (50.00 + taxas) * numdiarias;
                    
                    System.out.println("Hóspede: " + nome);
                    System.out.println("Total a ser pago: R$" + total);
                    break;
                    
                case 2:
                    System.out.println("Número de contas encerradas: " + contafechada);
                    break;
                    
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            if (opcao == 1) {
                contafechada++;
            }
            
            System.out.println();
            
        } while (opcao != 3);
        
        teclado.close();
    }
}
