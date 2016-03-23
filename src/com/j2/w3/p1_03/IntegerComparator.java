package com.j2.w3.p1_03;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

class IntegerComparator implements Comparator {
    public IntegerComparator() {}
    public int compare(Object o1, Object o2) {
        return (Integer)o1 - (Integer)o2;
    }
}