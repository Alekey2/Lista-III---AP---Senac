import java.util.Scanner;
public class Main
{
    public static int fatorial(int m){
        int fatorial = 1;
		
       for(int i=1; i<=m;i++){
           fatorial *= i;
       }
        return fatorial;
        
    }
    public static int soma(int n){
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
        System.out.println("Digite o Valor de m: ");
        int m = sc.nextInt();
        int t = fatorial(m);
        System.out.println("Valor do fatorial: \n"+t);
        System.out.println("");
        System.out.println("Digite o Valor de n: ");
        int n = sc.nextInt();
        int s = soma(n);
        System.out.println("Valor da somatoria: \n"+s);
        int d = t/s;
	System.out.println("O valor da divsão do fatorial pela somatoria é: "+d);
	}
}
