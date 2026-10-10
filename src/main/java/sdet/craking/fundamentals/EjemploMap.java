package sdet.craking.fundamentals;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de uso de la Collection Map
 * See: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
 * EjemploMap
 */
public class EjemploMap {

    public static void main(String[] args) {
       Map<String, Integer> edades = new HashMap<>();
       edades.put("Alice", 25);
       edades.put("Bob", 30);
       edades.put("Charlie", 35);
       edades.put("María",38);
       edades.put("Juan",42);
       edades.put("Ana",28);
       edades.put("Luis",33);
       edades.put("Pedro",45);
       edades.put("Laura",29);
       edades.put("Carlos",41);
       edades.put("Sofía",37);
       edades.put("Diego",39);
       edades.put("Isabel",34);
       edades.put("Javier",40);
       edades.put("Carmen",36);
       edades.put("Miguel",43);

       System.out.println("Edades: " + edades);
       System.out.println("Llaves y Valores: " + edades.entrySet());
       System.out.println("La edad de María es: " + edades.get("María"));
       System.out.println("Valores: " + edades.values());
       System.out.println("Llaves: " + edades.keySet());
       System.out.println("Tamaño del Map: " + edades.size());
       System.out.println("Contiene a Carmen? " + edades.containsKey("Carmen"));

       if(edades.containsKey("Jacinto")) {
           System.out.println("La edad de Jacinto es: " + edades.get("Jacinto"));
       } else {
           System.out.println("Jacinto no está en el mapa");
       }

       for (Map.Entry<String, Integer> entry : edades.entrySet()) {
           System.out.println(entry.getKey() + " tiene " + entry.getValue() + " años");
       }

    }

}
