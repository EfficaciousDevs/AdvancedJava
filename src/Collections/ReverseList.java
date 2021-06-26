package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();

        for(int i = 0;i<200;i += 13)
            aList.add(i);

        System.out.println("ArrayList before Reversing :" + aList);
        Collections.reverse(aList);
        System.out.println("ArrayList after Reversing :" + aList);
    }
}
