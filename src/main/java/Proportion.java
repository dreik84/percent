import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Proportion {
    private final Ratio ratio1;
    private final Ratio ratio2;

    public Proportion(Ratio ratio1, Ratio ratio2) {
        if (!check(ratio1, ratio2)) throw new IllegalArgumentException("The ratios is not proportional");
        this.ratio1 = ratio1;
        this.ratio2 = ratio2;
    }

    public static boolean check(Ratio ratio1, Ratio ratio2) {
        return ratio1.getA() / ratio1.getB() == ratio2.getA() / ratio2.getB();
    }
}
