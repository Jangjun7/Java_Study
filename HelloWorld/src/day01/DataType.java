package day01;

public class DataType {
    public static void main(String[] args) {
        System.out.println(6); // Number
        System.out.println("six"); // String

        System.out.println("6"); // String 6

        System.out.println(6+6); // 12
        System.out.println("6"+"6"); // 66

        System.out.println(6*6); // 36
        //System.out.println("6"*"6"); 문자열은 *를 지원하지 않는다.

        System.out.println("1111".length()); // 4
        //System.out.println(1111.length()); 정수형은 length()를 지원하지 않는다.

        System.out.println("Hello World"); // String 문자열
        System.out.println('H'); // Char 문자
        System.out.println("H");
    }
}
