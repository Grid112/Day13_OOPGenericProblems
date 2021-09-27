package com.BridgeLabz;

public class OOPGenericProblems {
    public static void intergerMax(Integer a,Integer b,Integer c){
        int max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.print("max"+max);
    }

    public static void main(String[] args) {
	System.out.println("Welcome To OOP Generic Problems");
        intergerMax(8,9,6);
    }
}
