package DataStructures;

import java.util.Arrays;
import java.util.List;

public class BetweenSets {

    private static int getTotalX(int N,int M,List<Integer> A, List<Integer> B) {
        int count = 0, x = 0, y = 0;
        for (int i = A.get(N - 1); i <= B.get(0); i++) {
            for (int j = 0; j < N; j++) {
                if (i % A.get(j) == 0)
                    x++;
            }
            if (x == N) {
                for (int j = 0; j < M; j++) {
                    if (B.get(j) % i == 0)
                        y++;
                }
            }
            if (y == M)
                count++;

            x = 0;
            y = 0;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(getTotalX(2,3, Arrays.asList(2,4),Arrays.asList(16,32,96)));
    }
}
