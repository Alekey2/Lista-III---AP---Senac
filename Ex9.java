import java.util.Scanner;
public class Main
{
    static int anv (int anos, int meses, int dias){
        int soma = (anos*365)+(meses*30)+(dias);
       return soma;
        
        
    }
	public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
        System.out.println("Digite quantos anos você tem: ");
        int anos = sc.nextInt();
        System.out.println("Digite quantos meses você tem: ");
        int meses = sc.nextInt();
        System.out.println("Digite quantos dias você tem: ");
        int dias = sc.nextInt();
        
        int al = anv(anos,meses,dias);
        System.out.println("Você ja viveu aproximadamente "+ al + " dias!!");
	}
}
