# Contador de vocales
Este programa cuenta las vocales de un archivo de texto. 

## Partes del programa
### VowelCounter
Este es el proceso principal que se encargará de contar una vocal
específica. Recibirá por parámetros dos valores: el texto a analizar 
y la vocal a contar. Posteriormente, mostrará por consola el número
de repeticiones de dicha vocal.

### ProcessLauncher
Esta clase agrupa el código que ejecutará el proceso VowelCounter, y 
cuenta con un método estático que aceptará tres parámetros: el texto a
analizar, la vocal que se va a contar y el nombre del archivo donde
se guardará el número de vocales que el programa encuentre en el texto,
devolviendo al final del método un proceso.

### Utils
Esta clase cuenta con dos métodos estáticos: <br>
- getText: este método se encarga de leer el texto del archivo, y al 
final devuelve una cadena con todo el texto.
- getTotalOfVowels: este método leerá el archivo que se cree en la 
carpeta "outputs" con el total de ocurrencias de una vocal específica, 
y lo devolverá como número de tipo Integer.

### Ejecutable principal
En la parte principal del programa encontramos dos listas: un array con
todas las vocales y otra lista donde se almacenarán los procesos
que se llevarán a cabo.

El programa cuenta con un bucle For que usará el array de las vocales
para crear un proceso por vocal, guardando el número de ocurrencias 
de cada vocal en un archivo en la carpeta "outputs". 

Por último, el programa leerá cada archivo y mostrará por consola:

- El texto entero.
- Cuántas ocurrencias de cada una de las 5 vocales tiene el texto.
- El número total de las 5 vocales que tiene el texto.

Y finalmente, los archivos almacenados en la carpeta outputs serán borrados.
