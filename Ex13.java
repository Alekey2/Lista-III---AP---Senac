import java.util.Scanner;
public class Main
{
    public static int divisores(int a){
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    System.out.println("Os números divisores são: "+i);
                }
            }
        
        return a;
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor de a: ");
            int a = sc.nextInt();
            
            divisores(a);
            
}
}