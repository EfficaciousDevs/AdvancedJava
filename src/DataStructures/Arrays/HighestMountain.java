package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighestMountain {
    public static int MountainFinder(List<Integer> aList){
        int peak = 0;
        int N = aList.size();

        for(int i = 1;i <= N-2;){

            // checks if aList[i] is a peak
            if(aList.get(i) > aList.get(i-1) && aList.get(i) > aList.get(i+1)){
                int count = 1;
                int j = i;

                // Counts backwards(Left)
                while(j>=1 && aList.get(j)>aList.get(j-1)){
                    j--;
                    count++;
                }
                // Counts Forwards(Right)
                while(i <= N-2 && aList.get(i)>aList.get(i+1)){
                    i++;
                    count++;
                }
                peak = Math.max(peak,count);
            }
            else{
                i++;
            }
        }
        return peak;
    }
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4));
        int result = MountainFinder(array);

        System.out.println("Highest Peak: " + result);
    }
}
