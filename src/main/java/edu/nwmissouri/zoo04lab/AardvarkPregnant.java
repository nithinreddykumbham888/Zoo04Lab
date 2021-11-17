package edu.nwmissouri.zoo04lab;

public class AardvarkPregnant extends Aardvark {

    // private attributes
    private boolean isTwinPregnancy = false;
    private int monthsAlong = 0; // up to 7

    // constructors
    public AardvarkPregnant(String name, boolean isTwins, int numMonths) {
        super(name);
        this.isTwinPregnancy = isTwins;
        this.monthsAlong = numMonths;
    }

    // getters
    public boolean getIsTwinPregnancy() {
        return this.isTwinPregnancy;
    }

    public int getMonthsAlong() {
        return this.monthsAlong;
    }

}
