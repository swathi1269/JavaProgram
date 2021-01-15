package com.company;

public class ReverseWordInSentense {
    public static void main(String[] args)
    {
        System.out.println(reverseword("I love Girish"));
    }

    public static String reverseword(String str)
    {
        String revword="";
        String[] words =str.split("\\s");
        for(String w: words)
        {
            StringBuffer sb=new StringBuffer(w);
            sb.reverse();
            revword=revword+sb+" ";
        }
        return revword;
    }
}
