/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author halae
 */
public class Mammal extends Animal {
    public Mammal(String name, int avgSleepTime, int lifespan, String food, String diet, String fact) {
        super(name, avgSleepTime, lifespan, food, diet, fact);
        javax.swing.JOptionPane.showMessageDialog(null, "You've selected a Mammal");
    }
}
