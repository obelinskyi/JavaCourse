package basiс5.list;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ListImplTest {
    ListImpl<String> testList;
    int LIST_SIZE;

    @BeforeAll
    public void setupList() {
        testList = new ListImpl<>();
        testList.add("Z");
        testList.add("A");
        testList.add("D");
        testList.add("C");
        testList.add("B");
        testList.add("Z");

        LIST_SIZE = 6;
    }

    @Test
    void testOrder() {
        String[] strings = {"A", "B", "C", "D", "Z", "Z"};
        for (int i = 0; i < testList.size(); i++) {
            assertEquals(strings[i], testList.get(i), "Wrong element at position " + i);
        }
    }

    @Test
    void testSize() {
        assertEquals(LIST_SIZE, testList.size(), "Wrong list size");
    }

    @Test
    void testContains() {
        assertTrue(testList.contains("A"));
        assertTrue(testList.contains("B"));
        assertTrue(testList.contains("Z"));
        assertFalse(testList.contains("Y"));
        assertFalse(testList.contains("P"));
    }





    public static void main(String[] args) {
        ListImpl<String> integers = new ListImpl<>();
        System.out.println(integers.isEmpty());
        integers.add("A");
        integers.add("B");
        integers.add("E");
        integers.add("C");
        System.out.println(integers);
        System.out.println(integers.isEmpty());
//        System.out.println(integers.size());

//        for (Integer node : integers) {
//            System.out.println(node);
//        }

//        System.out.println(Arrays.toString(integers.toArray()));
//        System.out.println(integers.contains(4));
        System.out.println(integers.remove("E"));
        System.out.println(integers);
        System.out.println(integers.size());
        integers.remove("E");
        System.out.println(integers);
        System.out.println(integers.size());
        integers.remove("A");
        System.out.println(integers);
        System.out.println(integers.size());
        ListImpl<String> list = new ListImpl<>();
        list.add("B");
        list.add("C");
        list.add("E");
        System.out.println(integers.containsAll(list));
        System.out.println(integers.addAll(list));
        System.out.println(integers);
        integers.add("A");
        System.out.println(integers.removeAll(list));
        System.out.println(integers);
        System.out.println(list);
        integers.add("E");
        System.out.println(integers.retainAll(list));
        System.out.println(integers);
        integers.add("Z");
        integers.add("X");
        System.out.println(integers);
        System.out.println(integers.get(1));
        System.out.println(integers.remove(1));
        System.out.println(integers);
        System.out.println(integers.indexOf("Z"));
        System.out.println(integers.indexOf("A"));
        integers.add("A");
        integers.add("A");
        integers.add("A");
        System.out.println(integers);
        System.out.println(integers.lastIndexOf("A"));
        System.out.println(integers.lastIndexOf("Z"));
        System.out.println(integers.subList(2, 6));
    }

}
