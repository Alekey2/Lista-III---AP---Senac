import java.util.Scanner;
public class Main
{
    static int nadador (int anos){
        if(anos>4 && anos <=7){
            System.out.println("Categoria Infatil A");
        }
        else if (anos >7 && anos<=10){
            System.out.println("Categoria Infatil B");
        }
        else if (anos >10 && anos<=13){
            System.out.println("Categoria Juvenil A");
        }
          else if (anos >13 && anos<=17){
            System.out.println("Categoria Juvenil B");
        }
          else if (anos >17 ){
            System.out.println("Categoria Adulto");
        }
        else
        System.out.println("Idade incorreta, Tente novamente");
        return anos;
    }
	public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
        System.out.println("Digite quantos anos você tem: ");
        int anos = sc.nextInt();
        nadador(anos);
        
	}
}