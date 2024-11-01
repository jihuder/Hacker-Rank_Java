import java.util.Arrays;

public class MetodoBurbuja {

    public static void main(String[] args) {

        int[] numeros = {1, 9, 23, 4, 55, 100, 1, 1, 23};

        System.out.println("Antes del método de la burbuja: " +
                Arrays.toString(numeros));

        burbuja(numeros);// Llamado a la clase burbuja

        System.out.println("Después del método de la burbuja: " +
                Arrays.toString(numeros));

    }
}