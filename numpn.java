import java.util.Scanner;
public class numpn {
    public static void main(String[] args){
        Scanner escaner=new Scanner(System.in);
        System.out.println("escribe un numero");
        double numero=escaner.nextDouble();
        if (numero==0){
            System.out.println("el numero es neutro");
        }else if (numero<0){
            System.out.println("el numero es negativo");
        }else{
            System.out.println("el numero es positivo");
        }


    }
}
