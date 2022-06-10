import java.util.Scanner;
public class Main
{
    public static double equacao(double a, double b, double c){
        double resultado=0;
        double delta = Math.pow(b, 2)-4*a*c;
        double deltaf = Math.sqrt(delta);
        
        if(delta>=0){
            double x1 = (-b + deltaf)/(2*a);
            double x2 = (-b - deltaf)/(2*a);
            
            if(x1>x2){
            System.out.println("A maior é raiz x1\n"+ x1);
            resultado = x2;
        }
            else{
            System.out.println("A maior raiz é x2\n"+ x2);
            resultado = x1;
        }
        }
          else if(delta<0){
              System.out.println("-1");
              System.out.println("A raiz é negativa");
          }
          return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor de a: ");
		double a = sc.nextInt();
		System.out.println("Digite o Valor de b: ");
		double b = sc.nextInt();
		System.out.println("Digite o Valor de c: ");
		double c = sc.nextInt();
        
	System.out.println(equacao(a,b,c));
	}
}
