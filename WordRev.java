package com.company;

public class WordRev {
    public static void main(String[] args)
    {
        System.out.println(revWord("My name is swathi"));
    }

    public static String revWord(String str)
    {
        String words[]=str.split("\\s");
        String revWord="";
        for(String w: words)
        {
            StringBuffer sb=new StringBuffer(w);
          sb.reverse();
          revWord=revWord+sb+ " ";
        }
        return revWord;
    }
}
