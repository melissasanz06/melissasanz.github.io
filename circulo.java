import java.util.Scanner;
public class circulo {
    public static void main(String[] args){
       int radio;
System.out.println("ingresa el radio del circulo");
Scanner teclado=new Scanner(System.in);
radio=teclado.nextInt();
double Area = Math.PI * Math.pow(radio, 2) ;
System.out.println("El area del circulo es: "+Area);





    }
}
