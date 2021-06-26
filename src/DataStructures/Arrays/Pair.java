package DataStructures.Arrays;

import java.util.*;

public class Pair {
    public static List<Integer> PairSum(List<Integer> arr, int sum){                // O(N) Optimized Approach
        List<Integer> res = new ArrayList<>();
        Set<Integer> val = new HashSet<>();
        for(int i = 0;i< arr.size();i++){
            int x = sum- arr.get(i);
            if(val.contains(x))
            {
                res.add(arr.get(i));
                res.add(x);
                //break;  if only required 1 pair
            }
            val.add(arr.get(i));
        }
        return res;
    }
    public static List<Integer> PairSum2(List<Integer> arr, int sum){            // O(N^2) Approach Brute-Force
        List<Integer> res = new ArrayList<>(arr);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<res.size();i++){
            for(int j = 1;j< res.size();j++)
            {
                if(res.get(i) + res.get(j) == sum)
                {
                    ans.add(res.get(i));
                    ans.add(res.get(j));
                    return ans;
                }
            }
        }
        return ans;

    }
        public static void main(String[] args) {

        List<Integer> ans = PairSum2(new ArrayList<Integer>(Arrays.asList(5,10,-1,12,3,-6,9,11)),4);
        for (Integer x:ans)
            System.out.print(x + " ");
    }

}
