package com.company;

public class StringTest {
    public static void main(String[] args) {
        String s="Swathi";
        String s2="Swathi";
        String s3=new String("Swathi");
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
