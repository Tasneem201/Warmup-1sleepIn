public class Max1020 {

    // Method to return the larger value in the 10..20 range
    public int max1020(int a, int b) {
        boolean inRangeA = (a >= 10 && a <= 20);
        boolean inRangeB = (b >= 10 && b <= 20);

        if (inRangeA && inRangeB) {
            return Math.max(a, b);
        } else if (inRangeA) {
            return a;
        } else if (inRangeB) {
            return b;
        } else {
            return 0;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Max1020 obj = new Max1020();

        System.out.println(obj.max1020(11, 19)); // 19
        System.out.println(obj.max1020(19, 11)); // 19
        System.out.println(obj.max1020(11, 9));  // 11
        System.out.println(obj.max1020(9, 21));  // 0
        System.out.println(obj.max1020(10, 20)); // 20
    }
}

