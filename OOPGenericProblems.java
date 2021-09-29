package com.BridgeLabz;

import java.util.Arrays;

public class OOPGenericProblems <E extends Comparable<E>> {
    E[] element;
    E result;
    /*
     * constructor point to the a, b ,c
     * constructor take parameter any type of data
     */

    public OOPGenericProblems(E[] element) {
        this.element = element;
    }
    //Here we used Generic Method to Compare all the Data types at the same time
    public static <E extends Comparable<E>> E compare(E[] element){
        Arrays.sort(element);
        int length = element.length;
        E max = element[length -1];
        System.out.println("Maximum Data Type Is: " +max);
        return max;
    }
    public static void main(String[] args) {
	System.out.println("Welcome To OOP Generic Problems");
    Integer[] intMax = { 8, 9, 6, 7, 10 };
    compare(intMax);
    Float[] floatMax = { 1.2f, 4.5f, 6.8f, 4.6f };
    compare(floatMax);
    String[] stringMax = { "Apple", "Peach", "Banana", "Orange"};
    compare(stringMax);
    }
}
