package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void Helper(List<Integer> array,int d){
        Collections.sort(array);
        int N = array.size();
        long minSum = 0,maxSum = 0;
        for(int i = 0;i<d;i++)
            minSum += array.get(i);

        for(int i = N-d;i<N;i++)
            maxSum += array.get(i);

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5,1,9,3,7));
        Helper(arrayList,4);
    }
}
