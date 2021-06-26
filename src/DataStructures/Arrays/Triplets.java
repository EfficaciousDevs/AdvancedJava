package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triplets {
    public static List<ArrayList<Integer>> TargetSumTriplets(List<Integer> array,int sum){    // O(N + NLogN) ~ O(N^2) if Array is not sorted
        List<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0;i<= array.size()-3;i++) {
            int j = i + 1;
            int k = array.size() - 1;
            while (j < k) {
                int currentSum = array.get(i);
                currentSum += array.get(j);
                currentSum += array.get(k);

                if (currentSum == sum) {
                    ArrayList<Integer> ans =  new ArrayList<>(Arrays.asList(array.get(i), array.get(j), array.get(k)));
                    result.add(ans);
                    j++;
                    k--;
                }
                else if (currentSum > sum)
                    k--;
                else
                    j++;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,15));

        //Collections.sort(aList);

        List<ArrayList<Integer>> ans = TargetSumTriplets(aList,18);
        for(List<Integer> x:ans)
            System.out.println(x);
    }
}
