import java.util.Scanner;
public class Main
{
    public static int somatoria(int n){
		int i = 1;
		int soma = 0;
		
        while(n>=i){
        System.out.println("Valor de i:  \n" +i);
        soma = i+soma;
        i++;
    }
    return soma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor de N: ");
        int n = sc.nextInt();
        int s = somatoria(n);
	System.out.println("O valor da somatoria é:\n"+s);
	}
}
