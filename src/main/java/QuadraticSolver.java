public class QuadraticSolver {
    public static void main(String[] args) {
        solve(2, -10, -250);
    }

    public static void solve(double a, double b, double c) {
        if (a == 0) throw new IllegalArgumentException("The first term cannot be zero");

        if (b == 0) {
            if (c == 0) {
                System.out.println("The equation has one root: x = 0");
            } else if (c > 0) {
                System.out.println("The equation has no roots");
            } else {
                double x1 = -Math.sqrt(-c / a);
                double x2 = Math.sqrt(-c / a);
                System.out.println("The equation has two roots: x1 = " + x1 + ", x2 = " + x2);
            }
        } else if (c == 0) {
            double x1 = 0;
            double x2 = -(b / a);
            System.out.println("The equation has two roots: x1 = " + x1 + ", x2 = " + x2);
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                System.out.println("The equation has no roots");
            } else if (discriminant == 0) {
                double x = -(b / 2 * a);
                System.out.println("The equation has one root: x =" + x);
            } else {
                double x1 = (-b - Math.sqrt(discriminant)) / 2 * a;
                double x2 = (-b + Math.sqrt(discriminant)) / 2 * a;
                System.out.println("The equation has two roots: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
