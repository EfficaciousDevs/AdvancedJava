import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Queues {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //Fill your code here
        System.out.println("Enter all roll numbers seperated by coma");
        String name = sc.nextLine();
        Stream<String> s = getRollNumbers(name);
        System.out.println("Enter the department name acronym");
        String dept = sc.next();
        int c = getCount(s,dept);
        if(c==0)
            System.out.println("Number of students from " + dept);
        else
            System.out.println("Number of students in me is " + c);
    }

    public static Stream<String> getRollNumbers(String rollNumbers) {
        //Fill your code here
        String x[] = rollNumbers.split(",");
        Stream<String> roll = Arrays.stream(x);
        return roll;

    }

    public static int getCount(Stream<String> rollNumberStream, String dept) {
        //Fill your code here
        ArrayList<Integer> list = new ArrayList<>();
        rollNumberStream.forEach(a->{
            if(a.toLowerCase().contains(dept.toLowerCase()))
                list.add(1);
        });
        return list.size();


    }

}
