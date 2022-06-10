import java.util.Scanner;
public class Main
{
    public static int pot(int x, int z){
        int resultado = 1;
        for(int i = z; i>=1; i--){
            resultado = resultado * x;
        }
       return resultado;
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor de x: ");
            int x = sc.nextInt();
            System.out.println("Digite o valor de z: ");
            int z = sc.nextInt();
            
            System.out.println("O resultado é da potência é :");
            System.out.println(pot(x,z));
            
}
}

