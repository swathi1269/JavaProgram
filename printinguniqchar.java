package com.company;

public class printinguniqchar {
    public static void main(String[] args)
    {
        String a="abaanneerr";
        uniq(a);
    }

    public static void uniq(String text) {
        String tem="";
        for(int i=0;i<text.length()-1;i++)
        {
            if (tem.indexOf(text.charAt(i))==-1)
            {
                tem=tem+text.charAt(i);
            }

        }
        System.out.println(tem + " ");
    }
}


