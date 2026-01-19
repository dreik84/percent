public class Main {
    public static void main(String[] args) {
        System.out.println(Percentage.getPercentOfNum(25, 10));
        System.out.println(Percentage.getPercentNumOfNum(5, 20));
        System.out.println(Percentage.getPercentOfDiff(50, 20));
        System.out.println(Percentage.getOriginalFromPart(20, 50));
        System.out.println(Percentage.getOriginalFromPartWithDiff(100, -10));
        System.out.println(Percentage.getPercentOfPercent(50, 40));
        System.out.println(Percentage.getSimpleBankPercent(100_000, 5, 2));
    }
}
