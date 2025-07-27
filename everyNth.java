public class EveryNth {

    // Method to return every Nth character starting from index 0
    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        EveryNth e = new EveryNth();

        System.out.println(e.everyNth("Miracle", 2));   // Mrce
        System.out.println(e.everyNth("abcdefg", 2));   // aceg
        System.out.println(e.everyNth("abcdefg", 3));   // adg
        System.out.println(e.everyNth("a", 1));         // a
        System.out.println(e.everyNth("abcdefg", 1));   // abcdefg
    }
}

