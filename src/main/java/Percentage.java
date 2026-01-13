public class Percentage {

    public static double getPercentOfNum(double num, double percent) {
        return percent * num / 100;
    }

    public static double getPercentNumOfNum(double num1, double num2) {
        return num1 / num2 * 100;
    }

    public static double getPercentOfDiff(double num, double diff) {
        return num * (100 + diff) / 100;
    }

    public static double getOriginalFromPart(double part, double percent) {
        return part / percent * 100;
    }

    public static double getOriginalFromPartWithDiff(double part, double diff) {
        return part * 100 / (100 + diff);
    }

    public static double getPercentOfPercent(double percent1, double percent2) {
        return (percent1 / 100) * (percent2 / 100) * 100;
    }
}
