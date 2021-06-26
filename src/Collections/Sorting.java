package Collections;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        List<String> sList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 200;i>0;i -= 35){
            //int val = sc.nextInt();
            aList.add(i);
        }

        System.out.println("Enter the Strings..");
        for(int i = 0;i<5;i++){
            String str = sc.next();
            sList.add(str);
        }
        sc.close();


        System.out.println("Integer List Before Sorting --" + aList);
        Collections.sort(aList);
        System.out.println("Integer List After Sorting --" + aList);


        System.out.println("String LinkedList Before Sorting --" + sList);
        Collections.sort(sList);
        System.out.println("String LinkedList After Normal Sorting --" + sList);
        sList.sort(new CustomComparator());
        System.out.println("String LinkedList After Custom Sorting --" + sList);

        System.out.println("Program Complete.");
    }
}
