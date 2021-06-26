package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {
    public static List<String> Looping(int number){
        List<String> aList = new ArrayList<>();
        for(int i = 1;i<=number;i++){
            if((i%3 == 0) && (i%5 == 0))
                aList.add("FizzBuzz");
            else if(i%3 == 0)
                aList.add("Fizz");
            else if(i%5 == 0)
                aList.add("Buzz");
            else
                aList.add(Integer.toString(i));
        }
        return aList;
    }
    public static void main(String[] args) {
        List<String> res = Looping(16);

        for(String s:res)
            System.out.println(s);
    }
}
