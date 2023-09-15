public class arreglo {
    public static void main(String[]args){
        int suma=0;
        float promedio=0;
        int[] numeros={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i:numeros){
            suma+=i;
        }
        promedio=suma/numeros.length;
        System.out.println("el promedio de los numeros es: "+promedio);
    }
    }


