package com.company;

public class Reverse {
    public static void main(String[] args) {
        String S="Swathi";
  String given=S.toLowerCase();

  for(int i=given.length()-1;i>=0;i--)
  {
      System.out.println(given.charAt(i));
  }
    }
}
