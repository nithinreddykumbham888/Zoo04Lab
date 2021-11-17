package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

public class FunWithArrayLists {

    public static void main(String args[]) {      
        var cities = new ArrayList<String>();
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Hydrabad");
        cities.add("New York");
        cities.remove("London");
        System.out.println(cities.size());
    }
}
