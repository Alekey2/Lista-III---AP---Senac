import java.util.Scanner;
public class Main
{
    public static double raiz (double R){
        double volume = 4*Math.PI*Math.pow(R,3)/3;
        System.out.println("O Valor do Volume é: "+volume);
        return volume;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor do raio: ");
        double R = sc.nextDouble();
        
        raiz(R);
		
	}
}
