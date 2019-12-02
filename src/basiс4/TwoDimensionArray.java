package basiс4;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionArray {
    static Random rd = new Random();

    public static void main(String[] args) {
        int[][] ints = new int[10][10];
        for(int i = 0; i < ints.length; i++) {
            for(int j = 0; j < ints[i].length; j++) {
                ints[i][j] = rd.nextInt(1000);
            }
        }
        for(int[] arr: ints) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
