public class BackAround {
    
    // Method to add last char to front and back
    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    // Main method to test the function
    public static void main(String[] args) {
        BackAround ba = new BackAround();
        
        System.out.println(ba.backAround("cat"));    // → tcatt
        System.out.println(ba.backAround("Hello"));  // → oHelloo
        System.out.println(ba.backAround("a"));      // → aaa
    }
}

