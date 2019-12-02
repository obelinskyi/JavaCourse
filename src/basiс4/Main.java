package basiс4;

public class Main {

    public static void dummyMethod(String str) throws InvalidArgLengthException {
        if (str.length() == 3) {
            throw new InvalidArgLengthException("The 'str' arg cannot have length 3");
        }
    }

    public static void main(String[] args) throws InvalidArgLengthException {
        dummyMethod("1234");
        dummyMethod("12345");
        dummyMethod("123");

    }

}
