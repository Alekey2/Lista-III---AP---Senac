import java.util.Scanner;
public class Main
{
    public static int somador(int A, int N){
        int soma = N+N+A;
        if(N>0){
            System.out.println("O valor desta função é : "+ soma);
        }
        else
        System.out.println("O valor desta função é -1");
       return soma;
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor de A: ");
            int A = sc.nextInt();
            System.out.println("Digite o valor de N: ");
            int N = sc.nextInt();
            
            somador(A,N);
            
}
}

