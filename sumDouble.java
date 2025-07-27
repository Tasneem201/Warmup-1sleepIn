public class SumDouble {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        SumDouble s = new SumDouble();
        System.out.println("sumDouble(1, 2): " + s.sumDouble(1, 2)); // 3
        System.out.println("sumDouble(3, 2): " + s.sumDouble(3, 2)); // 5
        System.out.println("sumDouble(2, 2): " + s.sumDouble(2, 2)); // 8
    }
}

