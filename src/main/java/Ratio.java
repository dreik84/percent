import java.util.StringJoiner;

public class Ratio {

    public static void printRatio(int... nums) {
        StringJoiner sj = new StringJoiner(" : ");

        for (int num : nums) {
            sj.add(String.valueOf(num));
        }

        System.out.println(sj);
    }

    public static double getPercentageRatio(double a, double b) {
        return a / b * 100;
    }

    public static double getUnknownByRatio(double a, double b, double part) {
        return part / a * b;
    }

    public static void divideNumInRatio(double a, double b, double num) {
        double sum = a + b;
        double num1 = num * a / sum;
        double num2 = num * b / sum;

        System.out.println(num1 + " " + num2);
    }
}
