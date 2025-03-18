public class Burbuja {

    public static void burbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int y = 0; y < arreglo.length - i - 1; y++) {
                if (arreglo[y] > arreglo[y + 1]) {
                    int temp = arreglo[y];
                    arreglo[y] = arreglo[y + 1];
                    arreglo[y + 1] = temp;
                }
            }
        }
    }
}