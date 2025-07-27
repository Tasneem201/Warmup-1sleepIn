public class EndUp {

    // Method to make the last 3 characters uppercase
    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String front = str.substring(0, str.length() - 3);
            String end = str.substring(str.length() - 3).toUpperCase();
            return front + end;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        EndUp e = new EndUp();

        System.out.println(e.endUp("Hello"));     // HeLLO
        System.out.println(e.endUp("hi there"));  // hi thERE
        System.out.println(e.endUp("hi"));        // HI
        System.out.println(e.endUp("cat"));       // CAT
        System.out.println(e.endUp("Java"));      // JAvA
    }
}

