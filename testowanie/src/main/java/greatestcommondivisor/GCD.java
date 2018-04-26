package greatestcommondivisor;

public class GCD {

    public static int compute(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("both numbers are zero");
        }
        if (b == 0) {
            return a;
        }
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        int c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
