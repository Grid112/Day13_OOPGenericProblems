package com.BridgeLabz;

public class OOPGenericProblems {
    //This method is used to find maximum Integer
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
    //This method is used to find Maximum Float
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
    //This method is used to find Maximum String
    public static void stringMax(String a, String b, String c){
        String max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum String Is: "+max);
    }

    public static void main(String[] args) {
	System.out.println("Welcome To OOP Generic Problems");
        intergerMax(8,9,6);
        System.out.println();
        floatMax(1.2F,4.5F,6.8F);
        System.out.println();
        stringMax("Apple","Peach","Banana");
    }
}
