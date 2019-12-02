import java.util.HashMap;
import java.util.Map;

public class LessonTrain {

    public static void main(String[] args) {
        Map<Integer, String> numStringRepresentation = new HashMap<>();
        numStringRepresentation.put(0, "Zero");
        numStringRepresentation.put(1, "One");
        numStringRepresentation.put(2, "Two");

        System.out.println(numStringRepresentation);
        System.out.println(numStringRepresentation.get(1));

    }

}
