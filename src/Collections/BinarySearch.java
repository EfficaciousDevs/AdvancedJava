package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();

        for(int i = 0;i<20;i += 3)
            aList.add(i);

        System.out.println(aList);
        int index = Collections.binarySearch(aList,15);
        int NotIndex = Collections.binarySearch(aList,19);
        System.out.println(index); // it will give the exact index where the searched element exists
        System.out.println(NotIndex);// it will return the -index where the element actually tend to exist
    }
}
