import java.util.Scanner;
public class numentero {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.print("ingrese el numero: ");
        int n=leer.nextInt();
        int d=Integer.toString(n).length();
        int t=0;
        for (int i=0;i<d; i++){
            String num=String.valueOf(Integer.toString(n).charAt(i));
            t+=Integer.parseInt(num);
        }
        System.out.print("la suma es: "+t);
    }
}
