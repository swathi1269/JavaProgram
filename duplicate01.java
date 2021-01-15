package com.company;

import java.time.Instant;
import java.util.*;

public class duplicate01 {

    public static void main(String[] args) {

        ArrayList <Integer> al=new ArrayList<Integer>() ;
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the total number of array Elements :");
            int tot=in.nextInt();
            System.out.println("Enter the array Elements:");
            for(int i=1;i<tot;i++)
            {

                al.add(in.nextInt());
            }

            System.out.println("Input List is : " +al);
            System.out.println("Filtered set is : "+processList(al));
        }


    }

    public static Set<Integer> processList(List<Integer> listContainingDuplicates) {

        final Set<Integer> resultSet = new HashSet<Integer>();
        final Set<Integer> tempSet = new HashSet<Integer>();

        for (Integer  yourInt : listContainingDuplicates) {
            if (!tempSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }
}
