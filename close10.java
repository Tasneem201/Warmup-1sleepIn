public class Close10 {

    // Method to return the number closest to 10
    public int close10(int a, int b) {
        int diffA = Math.abs(10 - a);
        int diffB = Math.abs(10 - b);

        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        } else {
            return 0;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Close10 c = new Close10();

        System.out.println(c.close10(8, 13));  // 8
        System.out.println(c.close10(13, 8));  // 8
        System.out.println(c.close10(13, 7));  // 0
        System.out.println(c.close10(9, 11));  // 9
        System.out.println(c.close10(10, 10)); // 0
    }
}

