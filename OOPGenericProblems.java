package com.BridgeLabz;

public class OOPGenericProblems {
    //Here we used Generic Method to Compare all the Data types at the same time
    public static <E extends Comparable<E>> E compare(E a, E b, E c){
        E max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;

    }
    public static void main(String[] args) {
	System.out.println("Welcome To OOP Generic Problems");
        System.out.println("Maximum Integer Is: " +compare(8,9,6));
        System.out.println("Maximum Float Is: " +compare(1.2f,4.2f,6.8f));
        System.out.println("Maximum String Is: " +compare("Apple","Peach","Banana"));
    }
}
