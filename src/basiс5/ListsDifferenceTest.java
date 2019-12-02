package basiс5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListsDifferenceTest {

    @Test
    public void testStrings() {
        List<String> list1 = Arrays.asList("ab", "bc", "cd", "ab");
        List<String> list2 = Arrays.asList("bc", "cd", "dc");
        List<String>[] actualResult = ListsDifference.listsDifference(list1, list2);

        assertEquals(Arrays.asList("ab", "ab"), actualResult[0]);
        assertEquals(Arrays.asList("dc"), actualResult[1]);
    }

    @Test
    public void testInts() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 5, 10);
        List<Integer>[] actualResult = ListsDifference.listsDifference(list1, list2);

        assertEquals(Arrays.asList(1, 2, 4), actualResult[0]);
        assertEquals(Arrays.asList(5, 10), actualResult[1]);
    }

    @Test
    public void testObjects() {
        Employee oleksandr = new Employee(2016, "Oleksandr");
        Employee andriy = new Employee(2016, "Andriy");
        Employee andriy1 = new Employee(2015, "Andriy");
        Employee pavlo = new Employee(2017, "Pavlo");
        Employee serhiy = new Employee(2015, "Serhiy");

        List<Employee> list1 = Arrays.asList(oleksandr, andriy, pavlo);
        List<Employee> list2 = Arrays.asList(andriy1, pavlo, serhiy);
        List<Employee>[] actualResult = ListsDifference.listsDifference(list1, list2);

        assertEquals(Arrays.asList(oleksandr, andriy), actualResult[0]);
        assertEquals(Arrays.asList(andriy1, serhiy), actualResult[1]);
    }

}
