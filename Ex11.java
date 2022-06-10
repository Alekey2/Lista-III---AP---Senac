import java.util.Scanner;
public class Main
{
    static float mediaf (float nota){
        if(nota>0.0 && nota <5.0){
            System.out.println("Conceito D");
        }
        else if (nota >4.9 && nota<7.0){
            System.out.println("Conceito C");
        }
        else if (nota >6.9 && nota<9.0){
            System.out.println("Conceito B");
        }
          else if (nota >8.9 && nota<=10.0){
            System.out.println("Conceito A");
        }
         
        else
        System.out.println("Nota Incorreta, Tente novamente");
        return nota;
    }
	public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
        System.out.println("Digite a nota: ");
        float nota = sc.nextFloat();
        mediaf(nota);
        
	}
}