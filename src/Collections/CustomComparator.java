package Collections;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1); // Reverses the Natural Ordering
    }
}
