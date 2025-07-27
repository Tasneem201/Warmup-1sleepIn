public class IntMax {

    // Method to return the largest of three integers
    public int intMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // Main method to test the function
    public static void main(String[] args) {
        IntMax im = new IntMax();

        System.out.println(im.intMax(1, 2, 3));   // 3
        System.out.println(im.intMax(1, 3, 2));   // 3
        System.out.println(im.intMax(3, 2, 1));   // 3
        System.out.println(im.intMax(7, 7, 7));   // 7
        System.out.println(im.intMax(-5, -1, -10)); // -1
    }
}

