package org.example;

import java.util.List;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> viewers) {
        int sum = 0;
        for (Viewer viewer : viewers) {
            sum += viewer.getAge();
        }
        return sum / viewers.size();
    }
}
