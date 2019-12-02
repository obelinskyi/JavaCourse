package basiс1;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set 'a':");
        String a = scanner.next();
        System.out.println("Set 'b':");
        String b = scanner.next();
        System.out.println("Set 'c':");
        String c = scanner.next();

        String concatenatedInput = a + b + c;

        calculateAndPrintParametrics(concatenatedInput, a, 0);
        calculateAndPrintParametrics(concatenatedInput, b, a.length());
        calculateAndPrintParametrics(concatenatedInput, c, a.length() + b.length());

    }

    static void calculateAndPrintParametrics(String concatenatedString, String input, int startingIndex) {
        System.out.println(String.format("%s, %.1f, %.1f, %.1f",
                input,
                concatenatedString.indexOf(input, startingIndex) / (float)concatenatedString.length(),
                (concatenatedString.indexOf(input, startingIndex) + input.length()) / (float)concatenatedString.length(),
                input.length() / (float)concatenatedString.length()));
    }
}
