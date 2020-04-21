package com.example.magnusson;

public class Engine {
    private String engineName;
    private String engineConfiguration;
    private String numOfCylinders;
    private String forModel;
    private String fuelType;


    public Engine(String engineName, String engineConfiguration, String numOfCylinders, String forModel, String fuelType) {
        this.engineName = engineName;
        this.engineConfiguration = engineConfiguration;
        this.numOfCylinders = numOfCylinders;
        this.forModel = forModel;
        this.fuelType = fuelType;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public String getNumOfCylinders() {
        return numOfCylinders;
    }

    public String getForModel() {
        return forModel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getEngineName() {
        return engineName;
    }

    @Override
    public String toString() {
        return "\n" + "Engine name: " + getEngineName() + "\n" +
                "Engine configuration: " + getEngineConfiguration() + "\n" +
                "Cylinders: " + getNumOfCylinders() + "\n" +
                "Engine for car model: " + getForModel() + "\n" +
                "Fuel type: " + getFuelType();
    }
}
