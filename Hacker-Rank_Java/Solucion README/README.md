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

#### Rol de x en el Algoritmo de Ordenamiento

1. ### Posición de los Elementos Ordenados


   A medida que avanzas en las pasadas del bucle externo (donde incrementas x), el algoritmo coloca el elemento más grande en su posición correcta al final del arreglo.
   Por lo tanto, después de cada pasada del bucle externo, puedes considerar que al menos uno más de los elementos ya está ordenado y no necesita ser comparado en las siguientes iteraciones.

2. ### Reducción del Rango de Comparación
   
Primera Pasada (x = 0):


   En la primera iteración, comparas todos los elementos. El bucle interno se ejecuta hasta arreglo.length - 1, lo que significa que comparas todos los pares de elementos.
   
   Segunda Pasada (x = 1):

   Después de la primera pasada, el elemento más grande se ha movido a la última posición. Ahora, en la segunda pasada, puedes ignorar ese último elemento, por lo que el bucle interno se ejecuta hasta arreglo.length - 2.
   
   Tercera Pasada (x = 2): 
   
   Después de la segunda pasada, los dos elementos más grandes están en sus posiciones finales. Por lo tanto, en la tercera pasada, solo necesitas comparar hasta arreglo.length - 3, y así sucesivamente.

3. ### Elementos en Posición Correcta

Al final de cada iteración del bucle externo:

El elemento más grande de la parte no ordenada del arreglo se coloca en su posición correcta 
al final de esa sección.

Por lo tanto, después de la primera pasada (x = 0), el mayor elemento está en la última 
posición.

Después de la segunda pasada (x = 1), el segundo mayor elemento está en la penúltima 
posición, y así sucesivamente.


## Significado de -1 en el Contexto de Arreglos

   Longitud del Arreglo

   Cuando trabajas con arreglos en Java (y en muchos otros lenguajes de programación), 
   la propiedad length te da el número total de elementos en el arreglo. Por ejemplo, 
   si tienes un arreglo definido como:


   int[] arreglo = {5, 3, 4, 1, 2}; // longitud = 5

Aquí, arreglo.length es 5, lo que significa que hay cinco elementos en el arreglo.
Los índices válidos para acceder a los elementos son 0, 1, 2, 3 y 4. El último 
índice es siempre length - 1.

## El uso de -1 tiene dos propósitos:

#### a. Evitar el Acceso Fuera de Límites

La condición y < arreglo.length - x - 1 asegura que cuando accedes a y + 1, no te 
salgas del rango del arreglo. Si el bucle interno se ejecutara hasta arreglo.length - x,
al intentar acceder a arreglo[y + 1] en la última iteración podrías intentar acceder a 
un índice que no existe (por ejemplo, si y es igual a arreglo.length - x - 1, 
entonces y + 1 sería igual a arreglo.length - x, lo que está fuera del rango).

#### b. Reducir la Comparación con Elementos Ya Ordenados

A medida que incrementas x, estás ignorando los últimos elementos que ya están ordenados.

Por ejemplo:

En la primera pasada (x = 0), comparas hasta el índice 3 (que es 5 - 0 - 1), lo que permite
acceder al último elemento sin problemas.

En la segunda pasada (x = 1), comparas hasta el índice 2 (que es 5 - 1 - 1), lo que significa 
que ahora puedes ignorar el último elemento (ya ordenado)