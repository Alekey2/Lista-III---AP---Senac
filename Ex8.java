import java.util.Scanner;
public class Main
{
    static boolean f (int a){
    boolean result = true;
    for(int i = 2;i<a;i++){
        if(a % i ==0)
        return false;
    }
    return true;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor : ");
		int a = sc.nextInt();
		
		boolean result = f(a);
		System.out.println("Este Número é primo?");
		System.out.println(result);
		
	
	}
}

