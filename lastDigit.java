public class LastDigit {

    // Method to check if two numbers have the same last digit
    public boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    // Main method for testing
    public static void main(String[] args) {
        LastDigit ld = new LastDigit();

        System.out.println(ld.lastDigit(7, 17));    // true
        System.out.println(ld.lastDigit(6, 17));    // false
        System.out.println(ld.lastDigit(3, 113));   // true
        System.out.println(ld.lastDigit(0, 10));    // true
        System.out.println(ld.lastDigit(21, 1));    // true
    }
}

