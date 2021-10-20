package edu.nwmissouri.zoo04lab;

/**
 * This document is color of car
 * @author Sai Kaushik Beeram (S545124)
 */
enum colorsOfcar{
    RED,
    YELLOW,
    BLUE,
    VOILET,
    GREEN,
}
/**
 * This class defines the nature of the Puma animal
 * @author Sai Kaushik Beeram (S545124)
 */
public class Puma extends Animal {
    
    //Declaration of string name
    
    public Puma(String name){
        super(name);
        
    }
    /**
     * Determines the animal speak
     */
    @Override
    public void speak(){
        System.out.printf("I'm %s. I'm an Puma!", this.name);
    }
    /**
     * Determines the animal move
     */
    @Override
    public void move(){
        System.out.println("Puma movement");
    }
    /**
     * This method will initialize the values and calls the sum method
     */
    public void calculation() {
        double a = 2.5;
        int b = 2;
        double c = getPumaAddition(a, b);
        System.out.printf("I know PumaAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
    /**
   * This method will calculate the sum of two numbers
   * @param valueOne double value which is passed from sumOfTwo() 
   * @param valueTwo int value which is passed from sumOfTwo()
   * @return it returns the sum of two numbers
   */
    public double getPumaAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    /**
 * The application's entry point
 * This is the main method which makes use of sumOfTwo,speak,move method.
 * @param args an array of command-line arguments for the application
 */
    public static void main(String [] args){
        var a = new Puma("Hello");
        a.speak();
        a.move();
        a.calculation();
        System.out.println("My favorite car color :"+colorsOfcar.BLUE);
    }

    double getPumacalculation(double first, int second) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 }
