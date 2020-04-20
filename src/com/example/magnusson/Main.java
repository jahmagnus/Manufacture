package com.example.magnusson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {



    Factory factory = new Factory();

    factory.populateMap();

//    factory.printMap();

    factory.printMapValue("luton");



    }
}



//    Engine engine1 = new Engine("v-config", 4, "Lemon", "petrol");
//    Engine engine2 = new Engine("boxer", 6, "Boon", "Electric");
//
//    Set<String> sunderlandengines = new HashSet<String>();
//        sunderlandengines.add(engine1.toString());
//                sunderlandengines.add(engine2.toString());
//
//                Set<String> lutonEngines = new HashSet<String>();
//        lutonEngines.add(engine1.toString());
//        lutonEngines.add(engine2.toString());
//
//
//        Map<String, Set<String>> components = new HashMap<String, Set<String>>();
//
//        components.put("Sunderland", sunderlandengines);
//        components.put("luton", lutonEngines);
//
//        for(String plant : components.keySet()){
//        System.out.println(components.get(plant));
//        }