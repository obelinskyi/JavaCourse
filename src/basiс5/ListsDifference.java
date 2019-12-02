package basiс5;

import java.util.ArrayList;
import java.util.List;

public class ListsDifference {

    static <T> List<T>[] listsDifference(List<T> a, List<T> b) {
        List<T> uniqueInA = new ArrayList<>(a);
        List<T> uniqueInB = new ArrayList<>(b);
        uniqueInA.removeAll(b);
        uniqueInB.removeAll(a);

        return new List[]{uniqueInA, uniqueInB};
    }
}
