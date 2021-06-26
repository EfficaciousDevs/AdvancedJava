package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotate {
    public static List<Integer> RotateLeftN(List<Integer> array,int d){
        for(int i = 0;i<d;i++)
            RotateLeftOne(array);
        return array;
    }

    public static void RotateLeftOne(List<Integer> array){
        int i, temp;
        temp = array.get(0);
        for (i = 0; i < array.size() - 1; i++)
            array.set(i,array.get(i+1));
        array.set(array.size()-1,temp);
    }

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>(RotateLeftN(Arrays.asList(1,2,3,4,5),2));
        for(Integer x:result)
            System.out.print(x + " ");
    }
}
