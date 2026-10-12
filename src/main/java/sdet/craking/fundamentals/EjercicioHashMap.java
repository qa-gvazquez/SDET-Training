package sdet.craking.fundamentals;

import java.util.HashMap;
import java.util.Map;

/**
 * Contar palabras dentro de un String.
 * EjercicioHashMap
 * 
 * @see <a href="https://www.youtube.com/watch?v=wRYoig7CKYM">Saber la
 *      cuentaPalabras de palabras en un array,
 *      usando Map y HashMap, en JAVA.</a>
 */
public class EjercicioHashMap{

    public static void main(String[] args) {
        // Variable tipo TEXTO (String), que contiene las palabras a contar.
        String cadenaTexto = "Cada día voy a esforzarme para aprender "
        + "a programar en Java. Porque programar es "
        + "muy divertido. Así que cada día voy a superarme. "
        + "Come tunas y nopales. Yo me voy a dormir temprano.";

        /*
        Creamos un arreglo unidimensional vacío con elementos tipo TEXTO donde pondremos las palabras 
        de la 'cadenaTexto', separadas por el caracter espacio en blanco " ".
        */
        String [] palabrasCortadas = cadenaTexto.split(" "); // OJO: Para imprimir, son TRES espacios

        /*
        Usando un bucle FOR EACH, creamos una variable temporal "pato" que va a
        imprimir el arreglo unidimensional con las palabras almacenadas de manera individual.
        OJO: El statement '.split' TRES espacios en blanco, por que con UNO al imprimir el
        arreglo salen todos los elementos pegados en la consola. Con DOS tambien funciona.
         */
       for (String pato : palabrasCortadas) {
        System.out.print(pato);
       }

       /*
       OJO: Esta parte es confusa, primero creamos el HashMap y luego lo usamos.

       Sabiendo que un HashMap es un arreglo con pares <Clave, Valor>
       y que NO admite Claves duplicadas, podemos usar dichas características
       para hacer un MAPA del 'palabrasCortadas' con cada elemento, y las veces aparece.

       Recordando la documentación oficial:
       Collections > Interfaces > MAP > HashMap

       Creamos un mapa VACÍO tipo HashMAp con <Clave, Valor> de tipo <Texto, Número>
       para convertir esos DATOS en INFORMACIÓN.
       */
       Map<String, Integer> cuentaPalabras = new HashMap<>();


       /*
        * Ya que vamos a recorrer CADA elemento (palabra por palabra almacenada en
        * 'palabrasCortadas'), lo mas sencillo es volver a usar un FOR EACH.
        * 
        * Usando un bucle FOR EACH, creamos la variable temporal "palabra" tipo TEXTO (mismo que la CLAVE) que va
        * a recorrer el arreglo unidimensional con las palabras almacenadas de manera
        * individual.
        * 
        * Vamos a CONTAR cuantas veces se encuentra esa palabra.
        * 
        * Y vamos a guardar esa información en nuestro querido HashMap
        * 'cuentaPalabras'.
        * ¿Cómo?
        * Recordemos que nuestra MouseHerramienta HashMap está vacía.
        * 
        * Entonces.
        * 0.- Recorrer una por una, las palabras de manera individual (FOR EACH), de
        * 'palabrasCortadas'.
        * 1.- Buscar la 'palabra' en el HashMap 'palabrasCortadas' (containsKey) vacío.
        * 2.- Si es la primera vez que se encuentra esta palabra (o sea, que NO existe
        * esa CLAVE en el arreglo)
        * pues obviamente, la agrega. (put).
        * En caso de que YA EXISTA, le suma '+1' al VALOR de esa CLAVE ya encontrada.
        * 
        * Para esto, usamos e
        */
      for (String palabra : palabrasCortadas) { // For Each, variable temporal 'palabra'
        if (!cuentaPalabras.containsKey(palabra)) { // Si NO encuentra 'palabra' en 'cuentaPalabras'
            cuentaPalabras.put(palabra, 1); // La agrega al HashMap con un Valor '1'
        }else{
            cuentaPalabras.put(palabra, cuentaPalabras.get(palabra)+1); // Si la encuentra, suma '1' al valor que ya tenía guardado.
        }
        
      }

      /*
       * Ahora que llenamos el HashMap con CLAVES y VALORES (Palabras y su Frecuencia)
       * pues estaría genial imprimirlo.
       * Como queremos cada REGISTRO de este HashMap llamado 'cuentaPalabras', pues
       * volvemos a usar un FOR EACH.
       * 
       * OJO: En el FOR EACH anterior la variable temporal 'palabra' era tipo TEXTO,
       * por que ese es el mismo que la CLAVE.
       * Aquí, queremos LEER e IMPRIMIR todo junto, CLAVE y VALOR del HashMAP
       * 'cuentaPalabras'.
       * Este TIPO DE VARIABLE se llama ENTRY, entrada, o REGISTRO en la lengua de
       * Cervantes.
       * Y necesita los mismos pares de TIPO DE VARIABLE que el registro a LEER.
       */

      for (Map.Entry<String,Integer> registroEntry : cuentaPalabras.entrySet()) { // Recorre cada registro CLAVE,VALOR
        System.out.println("La palabra \"" + registroEntry.getKey() + "\"" + " aparece: " + registroEntry.getValue());
      }



    }

}
