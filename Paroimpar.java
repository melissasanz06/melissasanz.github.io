import java.util.Scanner;
public class Paroimpar {
    public static void main(String[] args) {
        int number;
        System.out.println("escribe un numero");
        Scanner teclado = new Scanner(System.in);
        number = teclado.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " es par");
        }else {
            System.out.println(number+" es impar");


        }
    }
}