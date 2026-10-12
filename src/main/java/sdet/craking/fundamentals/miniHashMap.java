package sdet.craking.fundamentals;

import java.util.HashMap;
import java.util.Map;

/**
 * Comandos básicos de la Interfaz MAP > HashMap
 * Este código se puede analizar en J
 *
 * @see <a href="https://pythontutor.com/java.html#mode=edit">pythontutor.com</a>
 */
public class miniHashMap {

    public static void main(String[] args) {

        String cadenaTexto = "pato pato caballo pato perro caballo";

        String[] cortadas = cadenaTexto.split(" "); // OJO: Para imprimir, son TRES espacios

        Map<String, Integer> cuentaPalabras = new HashMap<>();

        for (String palabra : cortadas) { // For Each, variable temporal 'palabra'
            if (!cuentaPalabras.containsKey(palabra)) { // Si NO encuentra 'palabra' en 'cuentaPalabras'
                cuentaPalabras.put(palabra, 1); // La agrega al HashMap con un Valor '1'
            } else {
                cuentaPalabras.put(palabra, cuentaPalabras.get(palabra) + 1); // Si la encuentra, suma '1' al valor que ya tenía guardado.
            }

        }

        for (Map.Entry<String, Integer> registroEntry : cuentaPalabras.entrySet()) { // Recorre cada registro CLAVE,VALOR
            System.out.println("La palabra \"" + registroEntry.getKey() + "\"" + " aparece: " + registroEntry.getValue());
        }
    }

}

