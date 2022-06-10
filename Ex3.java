import java.util.Scanner;
public class Main
{
    public static int fatorial(int n){
		int fatorial = 1;
		
       for(int i=1; i<=n;i++){
           fatorial *= i;
       }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor de n: ");
		int n = sc.nextInt();
        int s = fatorial(n);
	System.out.println("O valor do fatorial é:\n"+s);
	}
}
