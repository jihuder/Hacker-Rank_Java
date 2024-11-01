# Estructuras de Datos

## 1. Introducción

Hoy vas a ver las estructuras de datos más importantes, explicado de la manera más sencilla que me sea posible, comenzando desde la más fácil hasta la más difícil.

### 1.1 ¿Para qué sirven las estructuras de datos?

Estarás preguntando, bueno, básicamente para todo:
- Desde entrevistas técnicas a la hora de que te postules a un trabajo.
- Desde trabajos, proyectos, ejercicios, lo que sea en la universidad.
- Y por último, para hacer proyectos personales.

Las estructuras de datos se utilizan en prácticamente todo dentro de la programación. Así que bueno, sin más dilación, te la voy a hacer corta. Vamos directamente a la primera estructura de datos.

---

## 2. Arreglos (Arrays)

### 2.1 Definición

Los arreglos son una colección ordenada de datos.

### 2.2 ¿Qué significa "colección ordenada"?

- Que un dato esta consiguiente(al lado de otro).
- Puede ser un tipo de dato tipo texto o tipo String.
- Puede ser un tipo de dato numérico o integer.
- Puede ser un tipo de dato de valor booleano, es decir, true or false (verdadero o falso).

### 2.3 Acceso a Elementos

La búsqueda para acceder a cada elemento se hace por indexación o índice.

#### Ejemplo

Imagínate un libro. En un libro, vos tenés el índice que te dice, por ejemplo, "página 34: algoritmos y estructuras de datos". Así sabes que si te vas a la página 34 vas a encontrar exactamente ese contenido que estás buscando.

- Estos numeritos son la posición en la cual se encuentra cada elemento.
- Si queremos obtener el elemento, simplemente tenemos que llamar al arreglo y pasarle la posición a la cual queremos acceder.

### 2.4 Indexación Basada en Cero

Hay algo particular en los arreglos que es donde la mayoría de gente se confunde: **Zero based**.

- La indexación está basada en cero.
- Comienza a contar a partir del número cero.
- La primer casilla cuenta como cero.
- Si tenemos cinco elementos, contamos hasta cuatro porque el cero cuenta como uno.

#### Ejemplo

Si querés obtener el elemento número uno (es decir, este exactamente), vas a tener que llamar al cero, no al uno. Porque el uno te va a llevar al segundo elemento.

### ¿ Qué operaciones puede tener?

Podemos obtener, agregar y borrar elementos de un arreglo.

- El problema es que no está bien optimizado en términos de memoria para agregar y borrar elementos.

### 2.6 Limitaciones

Los arreglos son útiles principalmente para obtener elementos por índice.

## MEMORIA FISICA

Imagina que este arreglo guarda diferentes elementos (por ejemplo, los grados de temperatura del día: lunes, martes, miércoles, etc.).

12, 26,42,20,28,50

1. Este es un arreglo reflejado en la memoria:
    - Diferentes slots ocupan una fracción de tu memoria.
    - Cada slots es ocupado por un dato de temparatura del día.


2. Si quieres agregar un elemento (por ejemplo, 12 grados) entre 20 y 28:
    - Tendrías que mover los elementos y crear una copia del arreglo si el slot ya está ocupado.


Es decir, tendría que copiar todo el arreglo en un espacio de memoria diferente, por cada dato en cada Slot y con el nuevo dato ponerlo continuo con el dato correspondiente, ya que el Slot está ocupado. Entonces se crea una copia en un espacio suficiente de memoria con la modificación que le hicimos.

Por lo cual, es muy ineficiente hacerlo, ya que ocupamos más memoria en vez de usar otra estructura de datos que son más eficaces a nivel memoria.

### 2.7 Resumen

Un arreglo es:
- Una colección ordenada de datos.
- Puede guardar diferentes tipos de datos (String, numérico o booleano).
- Ideal para obtener o leer elementos dentro del arreglo.
- Para agregar o eliminar datos no son  lo suficientemente eficientes.


# Cómo crear un array en Java

### Declaración
Se declara un array especificando su tipo y nombre. Por ejemplo:

`int[] numeros;`

### Inicialización
Se inicializa el array utilizando el operador `new`, especificando el tipo y el tamaño del array. Por ejemplo, para un array de 5 elementos:

`numeros = new int[5];`

### Declaración e inicialización en una línea
También se puede combinar ambos pasos:

`int[] numeros = new int[5];`

### Inicialización con valores
Es posible crear un array y asignarle valores iniciales en el mismo paso:


`int[] numeros = {23, 46, 520, 8, 17};`

### Acceso a elementos
Los elementos del array se acceden mediante índices, comenzando desde 0 hasta el tamaño del array menos uno. Por ejemplo, para acceder al primer elemento:  

`int primerNumero = numeros[0];` // Accede al primer elemento

---


# Cómo recorrer un array en Java

Para recorrer un array en Java, se puede usar un bucle `for` o un bucle `for-each`. Ambos métodos permiten acceder a cada elemento del array desde el primero hasta el último.

## Usando un bucle `for`

El bucle `for` permite recorrer el array utilizando un índice para acceder a cada elemento. Este enfoque es útil cuando se necesita acceder a la posición específica de cada elemento.

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

En este ejemplo, `i` comienza en `0` y se incrementa hasta alcanzar el tamaño del array `(numeros.length)`. Esto garantiza que todos los elementos se impriman en orden.

### Usando un bucle for-each

El bucle for-each es una alternativa más sencilla y limpia cuando no es necesario usar el índice del array. En este caso, el bucle recorre directamente cada elemento.
```
for (int numero : numeros) {
    System.out.println(numero);
}

```


En este ejemplo, cada elemento del array (numero) se imprime directamente, simplificando el código.