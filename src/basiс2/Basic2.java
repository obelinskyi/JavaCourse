package basiс2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Random;

public class Basic2 {
    final static int LOWER_BOUND = -1000;
    final static int HIGHER_BOUND = 1000;
    final static Random random = new Random();

    static int nextRandomInt() {
        return random.nextInt(((HIGHER_BOUND + 1) - LOWER_BOUND) + LOWER_BOUND);
    }

    static int arraySum(int arrayLength) {
        if (arrayLength < 5 || arrayLength > 20) {
            throw new IllegalArgumentException(
                    "Passed invalid length of array. Please, choose number between 5 and 20(Inclusive).");
        }
//        System.out
        int[] array = new int[arrayLength];
        int sum = 0;
        int randomNumber;
        for (int i = 0; i < arrayLength; i++) {
            randomNumber = nextRandomInt();
            sum += randomNumber;
            array[i] = randomNumber;
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum is: " + sum);
        return sum;
    }

}
