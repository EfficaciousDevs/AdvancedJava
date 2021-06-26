
import java.util.Set;
import java.util.TreeSet;

class employee implements Comparable<employee>{
    int id;
    String Name;

    employee(int x, String str){
        this.id = x;
        this.Name = str;
    }

    @Override
    public int compareTo(employee obj) {
        int id1 = this.id;
        int id2 = obj.id;
        if(id1 < id2)
            return -1;
        else if(id1 > id2)
            return 1;
        else
            return 0;
    }
}
public class details{
    public static void main(String[] args) {
        Set<employee> list = new TreeSet<>(new employeeComparator());

        list.add(new employee(100,"Akshay"));
        list.add(new employee(105,"Prashant"));
        list.add(new employee(109,"Ayushi"));

        for(employee itr:list)
            System.out.println(itr);

    }
}
