package pl.radekcholuj.post;

import java.util.*;

public class PackageComparator implements Comparator<Package> {

    @Override
    public int compare(Package p1, Package p2) {
        int p1Priority = p1.getPriority().ordinal();
        int p2Priority = p2.getPriority().ordinal();

        if (p1Priority >= p2Priority) {
            return 1;
        } else {
            return -1;
        }
    }
}

