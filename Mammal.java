/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author halae
 */
public class Mammal extends Animal {
    public Mammal(String name, int avgSleepTime, int lifespan, String food) {
        super(name, avgSleepTime, lifespan, food);
    }
    
    public static void main(String[] args) {
        Mammal elephant = new Mammal("Elephant", 8, 60, "Grass");
        System.out.println("The lifespan of an " + elephant.getName() + " is " + elephant.getLifespan() + " years.");
    }
}
