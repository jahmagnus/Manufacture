package com.example.magnusson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Factory {
    private Map<String, Set<Engine>> factories;


    public Factory() {
        factories = new HashMap<>();
    }

    /**
     * This method will populate the map with test data.
     */
    public void populateMap(){
        Engine engine1 = new Engine("Harris-engine","v-config", 4, "lemon", "petrol");
        Engine engine2 = new Engine("Carter-engine","boxer", 4, "lemon", "Petrol");
        Engine engine3 = new Engine("Dimmock-engine","v-config", 8, "Lemon", "diesel");
        Engine engine4 = new Engine("Anstey-engine","v-config", 4, "clunker", "petrol");
        Engine engine5 = new Engine("Plunkett-engine","boxer", 4, "clunker", "Petrol");
        Engine engine6 = new Engine("Ludlam-engine","v-config", 8, "clunker", "electric");

        Set<Engine>sunderlandFactory = new HashSet<>();
        Set<Engine>lutonFactory = new HashSet<>();
        Set<Engine>birminghamFactory = new HashSet<>();

        sunderlandFactory.add(engine1);
        sunderlandFactory.add(engine2);
        sunderlandFactory.add(engine6);
        lutonFactory.add(engine1);
        lutonFactory.add(engine2);
        lutonFactory.add(engine3);
        birminghamFactory.add(engine1);
        birminghamFactory.add(engine5);
        birminghamFactory.add(engine4);
        birminghamFactory.add(engine6);

        factories.put("sunderland", sunderlandFactory);
        factories.put("luton", lutonFactory);
        factories.put("birmingham", birminghamFactory);
    }

    public void printMap(){
        for(String factoryKey : factories.keySet()){
            System.out.println("Key: " + factoryKey + "\n" + factories.get(factoryKey));
        }
    }

    public void printMapValue(String keySearch){
        if (factories.containsKey(keySearch)){
            System.out.println(factories.get(keySearch));
        } else {
            System.out.println(keySearch + " is not present in map");
        }
    }
}
