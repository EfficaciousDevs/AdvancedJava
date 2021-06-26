package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static long maxElement(List<List<Integer>> queries, int N) {
        long max = Integer.MIN_VALUE;
        long[] tempArray = new long[N + 1];

        for (List<Integer> q : queries) {
            int a = q.get(0);
            int b = q.get(1);
            int k = q.get(2);

            tempArray[a-1] += k;
            tempArray[b] -= k;
        }
        for (int i = 1; i < N; i++) {
            tempArray[i] = tempArray[i] + tempArray[i-1];
            if (tempArray[i] > max)
                max = tempArray[i];
            }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,5,3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(4,8,7));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(6,9,1));
//            List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,100));
//            List<Integer> l2 = new ArrayList<>(Arrays.asList(2,5,100));
//            List<Integer> l3 = new ArrayList<>(Arrays.asList(3,4,100));

            List<List<Integer>> queryList = new ArrayList<>();
            queryList.add(l1);
            queryList.add(l2);
            queryList.add(l3);

            long answer = maxElement(queryList,10);
            System.out.println(answer);
    }

}
