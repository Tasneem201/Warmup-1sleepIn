public class StringE {

    // Method to check if the number of 'e' chars is between 1 and 3
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        return count >= 1 && count <= 3;
    }

    // Main method for testing
    public static void main(String[] args) {
        StringE se = new StringE();

        System.out.println(se.stringE("Hello"));    // true (1 'e')
        System.out.println(se.stringE("Heelle"));   // true (2 'e's)
        System.out.println(se.stringE("Heelele"));  // false (4 'e's)
        System.out.println(se.stringE("World"));    // false (0 'e's)
    }
}

