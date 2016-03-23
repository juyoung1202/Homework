package com.j2.w3.p1_03;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}