# La solución 

La solución solo plantea en sí el algoritmo sin necesidad de hacer los demás aspectos de la ejecución como tal.

### Primer Bucle (Recorrido del Arreglo)


     for (int x = 0; x < arreglo.length - 1; x++) {

Descripción:

Inicia un bucle que itera desde 0 hasta arreglo.length - 1. La variable x controla cuántas pasadas se han realizado sobre el arreglo.

### Segundo Bucle (Comparación de Elementos)

            for (int y = 0; y < arreglo.length - x - 1; y++) {

Descripción: 

Inicia un segundo bucle anidado que itera desde 0 hasta arreglo.length - x - 1. Esto asegura que en cada pasada se ignoren los elementos ya ordenados al final del arreglo.
