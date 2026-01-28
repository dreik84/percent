public class Main {
    public static void main(String[] args) {
        System.out.println(Percentage.getPercentOfNum(25, 10));
        System.out.println(Percentage.getPercentNumOfNum(5, 20));
        System.out.println(Percentage.getPercentOfDiff(50, 20));
        System.out.println(Percentage.getOriginalFromPart(20, 50));
        System.out.println(Percentage.getOriginalFromPartWithDiff(100, -10));
        System.out.println(Percentage.getPercentOfPercent(50, 40));
        System.out.println(Percentage.getSimpleBankPercent(100_000, 5, 2));
        System.out.println(Percentage.getBankPercentWithCapitalization(100_000, 5, 2));
        System.out.println(Percentage.getBankPercentAnnuityPayment(100_000, 18, 5));

        Ratio.printRatio(3, 4, 5, 6);
        System.out.println(Ratio.getPercentageRatio(3, 4));
        System.out.println(Ratio.getUnknownByRatio(3, 4, 6));
    }
}
