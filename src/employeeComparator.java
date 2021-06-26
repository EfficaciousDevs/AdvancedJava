

import java.util.Comparator;

class employeeComparator implements Comparator<employee>{

    @Override
    public int compare(employee o1, employee o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}