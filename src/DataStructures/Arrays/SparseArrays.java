package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SparseArrays {
    public static List<Integer> QueryFrequency(List<String> strings, List<String> queries){
        List<Integer> result = new ArrayList<>();

        for(String q: queries){
            int flag = 0;
            for(String s:strings){
                if(s.equals(q))
                { flag++; }
            }
            result.add(flag);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> collection = QueryFrequency(Arrays.asList("def","de","fgh"),Arrays.asList("de","lmn","fgh"));

//        System.out.println("Enter the size of Strings List:");
//        int s = sc.nextInt();
//        List<String> strings = new ArrayList<>(s);
//
//        System.out.println("Enter the size of Queries List:");
//        int q = sc.nextInt();
//        List<String> queries = new ArrayList<>(q);

        for(Integer x:collection)
            System.out.print(x + " ");


    }
}
