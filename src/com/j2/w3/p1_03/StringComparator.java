package com.j2.w3.p1_03;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return s1.compareTo(s2);
    }
}