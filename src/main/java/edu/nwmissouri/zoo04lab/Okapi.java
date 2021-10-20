/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * 
 * This document is color of leafs
 * @author Pranay Bhargav Reddy Bakaram(s545147)
 */
enum ColorsOfLeafs{
    YELLOW,
    PINK,
    ORANGE,
    GREEN,
   
}
/**
 * This class defines the nature of the Okapi animal.
 * @author Pranay bhargav reddy bakaram(s545147)
 */
public class Okapi extends Animal {

    

    public Okapi(String name) {
        super(name);
    }
/*
    overiding speak() from Animal class.
    */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Okapi!", this.name);
    }
/*
    overiding move() from Animal Class.
    */
    @Override
    public void move() {
        System.out.println("hop hop hop");
    }
    
    public void eat(){
        System.out.println("I eat plants");
    }
    /*
    This method will initialize the values and calls the addition method.
    */
    public void addition() {
        double a = 2.5;
        int b = 2;
        double c = getOkapiAddition(a, b);
        System.out.printf("I know OkapiAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
    /**
   * This method will calculate the sum of two numbers
   * @param x double value which is passed from addition() 
   * @param y int value which is passed from addition()
   * @return it returns the sum of two numbers
   */
    public double getOkapiAddition(double x, int y) {
        return x + y;
    }

    public static void main(String[] args)
    {
    /**
     * The application's entry point
     * This is the main method which makes use of addition,speak,move method and enumerated types.
     * @param args an array of command-line arguments for the application
    */

        var a=new Okapi("Pranay Bhargav Reddy Bakaram");
        a.speak();
        a.move();
        a.eat();
        a.addition();
        System.out.println("The Colors of Leafs :"+ColorsOfLeafs.GREEN);
    }
}
