public class Fibonacci {
    public static void main(String[] args){
        int i=0, a=0,b=1,c=0;
        System.out.println("serie con fibonacci: ");
        for(i=0; i<10; i++){
            if (i<9){
                System.out.println(a + ",");
                c=a+b;
                a=b;
                b=c;
            } else{
                System.out.println(a);
            }
        }
        System.out.println("");
        i=0;
        b=1;
        a=0;
        c=0;

    }
}
