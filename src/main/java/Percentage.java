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

    /**
     * Простой процент
     *
     * @param sum    - сумма кредита
     * @param rate   - процентная ставка
     * @param period - количество лет, месяцев или дней
     * @return конечная сумма по истечении срока
     */
    public static double getSimpleBankPercent(double sum, double rate, double period) {
        int periodType = 1; // years - 1, months - 12, weeks - 52, days - 365 (366)
        return sum * (1 + (period * rate) / (periodType * 100));
//        return sum + sum * (rate / 100) * (period / periodType);
//        return sum * (1 + (period / periodType) * (rate / 100));
    }

    /**
     * Сложный процент с капитализацией
     *
     * @param sum    - сумма кредита
     * @param rate   - процентная ставка
     * @param period - количество лет, месяцев или дней
     * @return конечная сумма по истечении срока
     */
    public static double getBankPercentWithCapitalization(double sum, double rate, double period) {
        int periodType = 1; // years - 1, months - 12, weeks - 52, days - 365 (366)
        return sum * Math.pow(1 + rate / 100 * periodType, period);
    }

    /**
     * Аннуитетный платёж
     *
     * @param sum    - сумма кредита
     * @param rate   - процентная ставка
     * @param period - количество месяцев
     * @return сумма ежемесячной выплаты
     */
    public static double getBankPercentAnnuityPayment(double sum, double rate, double period) {
        int periodType = 12; // years - 1, months - 12, weeks - 52, days - 365 (366)
        double k = rate / (100 * periodType); // доля ежемесячной процентной ставки
        return sum * (k + k / (Math.pow(k + 1, period) - 1));
    }
}
