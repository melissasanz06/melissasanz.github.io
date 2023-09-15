import java.util.Scanner;
public class mcm {
    public static void main(String[] args){
        int numA, numB, numC, numMax, i;

        Scanner hols = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        numA = Integer.parseInt(hols.nextLine());
        System.out.println("Introduce el segundo número: ");
        numB = Integer.parseInt(hols.nextLine());
        System.out.println("Introduce el tercer número: ");
        numC = Integer.parseInt(hols.nextLine());

        numMax = numA;
        if ( numB > numMax )
            numMax = numB;

        if ( numC > numMax )
            numMax = numC;
        i = numMax;
        while ((i % numA != 0) || (i % numB != 0) || (i % numC != 0))
            i++;

        System.out.println("El MCM es " + i );





    }
}
