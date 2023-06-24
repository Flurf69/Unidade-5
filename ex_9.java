import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String nomes = "";
        int numero = 0;
        for (int x=1;x<=n;x++){
            System.out.println("Nome do Aluno nmr " + n);
            String nome = teclado.next();
            System.out.println("Qual a idade de " + nome);
            int idade = teclado.nextInt();
            
            if (idade==18){
                nomes +=nome + "\n";
            }
            if (idade>20)
            numero +=1;
            


        }
        System.out.println("aluos com 18");
        System.out.println(nomes);
        System.out.println("Alunos com 20");
        System.out.println(numero + "tem mais de 20 anos");
        teclado.close();
    }
}


