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
        System.out.print("Maximum Integer Is: "+max);
    }
    public static void floatMax(Float a, Float b, Float c){
        Float max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.print("Maximum Float Is: "+max);
    }

    public static void main(String[] args) {
	System.out.println("Welcome To OOP Generic Problems");
        intergerMax(8,9,6);
        System.out.println();
        floatMax(1.2F,4.5F,6.8F);
    }
}
