public class In1020 {

    // Method to check if either a or b is in the range 10 to 20 inclusive
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    // Main method to test the function
    public static void main(String[] args) {
        In1020 obj = new In1020();

        System.out.println(obj.in1020(12, 99));  // true
        System.out.println(obj.in1020(21, 12));  // true
        System.out.println(obj.in1020(8, 99));   // false
        System.out.println(obj.in1020(10, 20));  // true
        System.out.println(obj.in1020(9, 21));   // false
    }
}

