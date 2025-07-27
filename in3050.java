public class In3050 {

    // Method to check if both numbers are in 30..40 or both in 40..50
    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
               ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    // Main method for testing
    public static void main(String[] args) {
        In3050 checker = new In3050();

        System.out.println(checker.in3050(30, 31)); // true
        System.out.println(checker.in3050(30, 41)); // false
        System.out.println(checker.in3050(40, 50)); // true
        System.out.println(checker.in3050(35, 39)); // true
        System.out.println(checker.in3050(45, 49)); // true
        System.out.println(checker.in3050(31, 45)); // false
    }
}

