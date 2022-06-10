import java.util.Scanner;
public class Main
{
    public static double peso(double altura,String sexo){
        double p =0;
        if("M".equals(sexo) || "m".equals(sexo)){
            p = 72.7*altura-58;
        }
        else if("F".equals(sexo) || "f".equals(sexo)){
            p = 62.1*altura-44.7;
        }
        return p;
    }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu sexo: M ou F");
            String sexo = sc.nextLine();
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
             System.out.println("O valor do seu imc é de: ");
            System.out.println(peso(altura,sexo));
            
}
}
