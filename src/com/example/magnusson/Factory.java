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
        Engine engine1 = new Engine("Harris-engine","v-config", "4", "lemon", "petrol");
        Engine engine2 = new Engine("Carter-engine","boxer", "4", "lemon", "Petrol");
        Engine engine3 = new Engine("Dimmock-engine","v-config", "8", "Lemon", "diesel");
        Engine engine4 = new Engine("Anstey-engine","v-config", "4", "clunker", "petrol");
        Engine engine5 = new Engine("Plunkett-engine","boxer", "4", "clunker", "Petrol");
        Engine engine6 = new Engine("Ludlam-engine","v-config", "8", "clunker", "electric");

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

    /**
     * This method will print out the keys of the map and their associated values.
     */
    public void printMap(){
        for(String factoryKey : factories.keySet()){
            System.out.println("Key: " + factoryKey + "\n" + factories.get(factoryKey));
        }
    }

    /**
     * This method will take a key to search for and print out the associated value. If the key does
     * not exist in the Map then there will be a message to say so.
     * @param keySearch
     */
    public void printMapValue(String keySearch){
        if (factories.containsKey(keySearch)){
            System.out.println(factories.get(keySearch));
        } else {
            System.out.println(keySearch + " is not present in map");
        }
    }

    /**
     * this method will add a new entry to the map; A key value which will be a String that is the name of a factory
     * for example; manchester; liverpool etc.
     * A value that is a set is the second argument
     * The set will need to created in the OU workspace along with new engine objects and added to the set.
     *
     * for example: Engine engine7 = new Engine("Guile-engine","straight", 6, "lemon", "petrol");
     *              Set<Engine>manchesterFactory = new HashSet<>();
     *              manchesterFactory.add(engine7);
     *              factory.addMapEntry("manchester", manchesterFactory);
     * @param keyValue
     * @param engineSet
     */
    public void addMapEntry(String keyValue, Set<Engine> engineSet){
        factories.put(keyValue, engineSet);
    }


    /**
     * This method will take an argument that is a key to delete from the map
     * if the key exists within the map then the entry will be deleted and boolean true returned
     * otherwise false will be returned.
     * @param keyToDelete
     * @return
     */
    public boolean deleteEntry(String keyToDelete){
        if (factories.containsKey(keyToDelete)){
            factories.remove(keyToDelete);
            System.out.println(keyToDelete + " deleted");
            return true;
        } else {
            System.out.println(keyToDelete + " not found");
            return false;
        }
    }

    /**
     * This method will return a set of keys values(factories) that are currently producing
     * the type of engine entered as the method argument, if no factory produces the engine in
     * the argument a null value is returned.
     * @param engineName
     * @return
     */
    public Set selectKeys(String engineName) {
        Set<String> producingFactories = new HashSet<>();
        Set<Engine> engineSet;


        for (String keyElement : factories.keySet()) {
            engineSet = factories.get(keyElement);
            for (Engine engine : engineSet) {
                if (engine.getEngineName().equals(engineName)) {
                    producingFactories.add(keyElement);
                }
            }
        }
        if (producingFactories.isEmpty()) {
            System.out.println("No factories currently producing this engine");
            return null;
        } else {
            System.out.println("Factories currently producing " + engineName + " type: " +
                    "\n" + producingFactories);
            return producingFactories;
        }
    }
}
