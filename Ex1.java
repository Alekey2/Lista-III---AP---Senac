import java.util.Scanner;
public class Main
{
    public static int menor(int a, int b, int c){
        int l = 0;
        if(a<b && a<c){
            l=a;
        }
        else if (b<a && b<c){
            l=b;
        }
        else {
            l=c;
        }
        return l;
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = sc.nextInt();
		System.out.println("O menor entre os três é: "+ menor(a,b,c));
	}
}
