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
    private Lifespan lifespan;
    private String food;
    private Diet diet;
    private Fact fact;
    //private Sound sound;

    public Animal(String name, int avgSleepTime, int lifespan, String food, String diet, String fact) {
        this.name = name;
        this.avgSleepTime = avgSleepTime;
        this.lifespan = new Lifespan(lifespan);
        this.food = food;
        this.diet = new Diet(diet);
        this.fact = new Fact(fact);
    }
    
    public class Fact {
        private String fact;
        
        public Fact(String fact) {
            this.fact = fact;
        }
        
        public String getFact() {
            return fact;
        }
    }
    
    public String getFunFact() {
        return fact.getFact();
    }
    
    public class Diet {
        private String type;
        
        public Diet(String type) {
            this.type = type;
        }
        
        public String getType() {
            return type;
        }
    }
    
    public String getFoodType() {
        return diet.getType();
    }
    
    public int getAverageLifespan() {
        return lifespan.getAverageLifespan();
    }
    
    public class Lifespan {
        private int averageLifespan;
        
        public Lifespan(int averageLifespan) {
            this.averageLifespan = averageLifespan;
        }
        
        public int getAverageLifespan() {
            return averageLifespan;
        }
    }
    
    public String getInfo() { //goes into animal.java
        
        return "NAME: " + name + "\nAVERAGE SLEEP TIME: " + avgSleepTime + " hours" + "\nDIET: " + getFoodType() + "\nEATS: " + food + "\nAVERAGE LIFESPAN: " + getAverageLifespan() + " years" + "\n\n\nFUN FACT: " + getFunFact();
    }
}

