package DataStructures;

import java.util.List;

public class DivisibleSumPairs {
    public static int CountPairs(int N, int K, List<Integer> A){
        int count = 0;
        for(int i = 0;i<N;i++){
            for(int j = i+1;j<N;j++){
                if((A.get(i) + A.get(j))%K == 0)
                    count++;
            }
        }
        return count;
    }
}
