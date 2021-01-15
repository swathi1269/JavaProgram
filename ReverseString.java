package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the string to be tested :  ");
        String s=in.nextLine();
        String given=s.toLowerCase();
        StringBuffer sb=new StringBuffer(given);
        System.out.println(sb.reverse());

    }
}
