import java.util.Scanner;

public class Example7 {
    public static void main(String[] argv) {
        float nauticalmile;
        float meters;

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        System.out.println("Insert nautical mile");
        nauticalmile = inputValue.nextFloat();
        meters = nauticalmile * 1852;
        System.out.println(meters);
    }
}
