import java.util.Scanner;
public class Sumadedigitos {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int numero,sumDig=0;
        System.out.print("ingresa un numero");
        numero=lector.nextInt();
        int aux=numero;
        while (numero !=0){
            sumDig=sumDig+(numero % 10);
            numero=numero/10;
        }
        System.out.print("la suma de los digitos de "+aux+"es: "+sumDig);
    }
}