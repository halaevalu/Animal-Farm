/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author halae
 */
// Animal.java - superclass
public class Animal {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the avgSleepTime
     */
    public int getAvgSleepTime() {
        return avgSleepTime;
    }

    /**
     * @param avgSleepTime the avgSleepTime to set
     */
    public void setAvgSleepTime(int avgSleepTime) {
        this.avgSleepTime = avgSleepTime;
    }

    /**
     * @return the lifespan
     */
    public int getLifespan() {
        return lifespan;
    }

    /**
     * @param lifespan the lifespan to set
     */
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }
// properties shared by all animals
    private String name;
    private int avgSleepTime;
    private int lifespan;
    private String food;

    public Animal(String name, int avgSleepTime, int lifespan, String food) {
        this.name = name;
        this.avgSleepTime = avgSleepTime;
        this.lifespan = lifespan;
        this.food = food;
    }

    /*public void eat() {
        System.out.println(getName() + " is eating.");
    }*/
    
    public String getInfo() { //goes into animal.java
        return "Name: " + name + ", Average Sleep Time: " + avgSleepTime + ", Food: " + food + ", Lifespan: " + lifespan;
    }


    /*public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }*/
    
}

