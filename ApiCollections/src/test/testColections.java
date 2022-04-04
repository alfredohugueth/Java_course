package test;

import java.util.*;


public class testColections {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(); // Puede crecer dinamicamente

        myList.add("Lunes");
        myList.add("Martes");
        myList.add("Miercoles");
        myList.add("Jueves");
        myList.add("Viernes");


        Set<String> mySet = new HashSet<>();
        mySet.add("Primer");
        mySet.add("Segundo");
        mySet.add("Tercero");
        mySet.add("Cuarto");

        imprimir(mySet);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("value_1", "Juan");
        myMap.put("value_2", "Alfredo");
        myMap.put("value_3", "Rosalia");

        String element = myMap.get("value_1");
        System.out.println("element = " + element);

        Set<String> keySet = myMap.keySet();
        imprimir(keySet);

        imprimir(myMap.values());
    }

    public static void imprimir(Collection<String> collection) {
        collection.forEach(element -> System.out.println("element = " + element));
    }
}
