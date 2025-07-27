public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    public static void main(String[] args) {
        PosNeg p = new PosNeg();
        System.out.println(p.posNeg(1, -1, false));  // true
        System.out.println(p.posNeg(-1, 1, false));  // true
        System.out.println(p.posNeg(-4, -5, true));  // true
    }
}

