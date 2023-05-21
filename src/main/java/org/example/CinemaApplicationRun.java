package org.example;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("A",20,5));
        viewers.add(new Viewer("B",25,6));
        viewers.add(new Viewer("C",30,7));
        viewers.add(new Viewer("D",35,8));
        viewers.add(new Viewer("E",40,9));
        int averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println(averageAge);
    }
}
