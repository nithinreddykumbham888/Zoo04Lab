/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Rohan Kondaveeti
 */
public class Goat extends Animal {

    public Goat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm an Goat. I'm a pet of %s. \n", this.name);
    }

    @Override
    public void move() {
        System.out.println("I can walk with four legs.");
    }

    public void eat() {
        System.out.println("I eat like Yumm yumm yumm!!");
    }

    public void child() {
        System.out.println("I can give birth to one child at once.");
    }

    public void color() {
        System.out.println("I can be in black, brown and white color.");
    }
    
    /**
     ** custom confess function
     *
     * @param valueOne 
     * @param valueTwo 
     * 
     */
    public void confess() {
        double a = 2.5;
        int b = 2;
        double c = getGoatAddition(a, b);
        System.out.printf("I know GoatAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * custom getGoatAddtion function 
     *
     * @param valueOne 
     * @param valueTwo 
     * @return double - sum
     */
    public double getGoatAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
    /**
     * enum function with gender values
     * 
     */
    public enum Gender {
        Male,
        Female,
        Other,
    }

    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        Goat goat = new Goat("Rohan");
        goat.speak();
        goat.move();
        goat.eat();
        goat.child();
        goat.color();
        goat.confess();
        for (Gender gender : Gender.values()) {
            System.out.println(gender);
        }
    }
}
