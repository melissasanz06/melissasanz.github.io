public class MaximoComundivisor {
    public static void main(String[] args) {
        int[] valores = {10, 20, 5, 1, 7, 30, 4};
        int mayor = maximoRec(valores, 0);
        System.out.println("El número mayor es el " + mayor);
        int menor = minimoRec(valores, 0);
        System.out.println("El número menor es el " + menor);
    }
    public static int minimoRec(int[] numeros, int indice) {
        if (indice == numeros.length - 1) {
            return numeros[indice];
        } else {
            return Math.min(numeros[indice], minimoRec(numeros, indice + 1));
        }
    }
    public static int maximoRec(int[] numeros, int indice) {
        if (indice == numeros.length - 1) {
            return numeros[indice];
        } else {
            return Math.max(numeros[indice], maximoRec(numeros, indice + 1));

        }

    }


}