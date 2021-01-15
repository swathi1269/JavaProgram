package com.company;

import java.util.*;

public class Duplicates03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> AL=new ArrayList<Integer>();
        System.out.println("Enter the total number of array lost elements: ");
        int total=in.nextInt();

        System.out.println("Enter the array lements :");

            for(int i=1;i<=total;i++)
            {
                AL.add(in.nextInt());
            }
        System.out.println("The list entered by user is : "+AL );
            System.out.println("The processed list is : "+processedList(AL));
    }

    public static Set<Integer> processedList(List<Integer> unprocessedList)
    {
        final Set<Integer> resultset=new HashSet<Integer>();
        final Set<Integer> tempset=new HashSet<Integer>();

        for(int a: unprocessedList)
        {
            if(!tempset.add(a))
            {
                resultset.add(a);
            }
        }
        return resultset;
    }
}
