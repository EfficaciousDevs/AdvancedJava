package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();

        int[] array = new int[10];

        int j = 0;
        for(int i= 20;i > 0;i-=2 )
            array[j++] = i;

        for(int i = 200;i>0;i -= 23)
            aList.add(i);

        System.out.println(aList);
        Collections.sort(aList);
        System.out.println(aList);

        System.out.println("Array before Sorting");
        for(int itr : array)
            System.out.println(itr);

        Arrays.sort(array);

        System.out.println("Array after Sorting");
        for(int e : array)
            System.out.println(e);


        String[] sArray = {"A","K","S","H","A","Y"};

        Arrays.sort(sArray);
        System.out.println("Normal Sorting of String Array : ");
        for(String e : sArray) {
            System.out.println(e);
        }

        Arrays.sort(sArray,new CustomComparator());

        System.out.println("Custom Sorting of String Array : ");
        for(String e : sArray)
            System.out.println(e);

        System.out.println("Program Completed.");

    }
}
