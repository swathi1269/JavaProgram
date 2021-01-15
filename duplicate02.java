package com.company;

import java.util.*;

public class duplicate02 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the total number  :");
        int total=in.nextInt();
        ArrayList<Integer> AL=new ArrayList<Integer>();
        System.out.println("Enter the Array Elements :");

        for(int i=1;i<total;i++)
        {

            AL.add(in.nextInt());
        }

        System.out.println("The list with duplicates: " +AL);
        System.out.println("The processed set without duplicates is : "+uniqSet(AL));
    }

    public static Set<Integer> uniqSet(List<Integer> setwithputDup)
    {
       final Set<Integer> resultSet=new HashSet<Integer>();
       final Set<Integer> temSet=new HashSet<Integer>();
       for( int a:setwithputDup)
       {
         if(!temSet.add(a))
         {
            resultSet.add(a);
         }
       }
       return resultSet;
    }
}
