public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
               (b >= 13 && b <= 19) ||
               (c >= 13 && c <= 19);
    }

    public static void main(String[] args) {
        HasTeen ht = new HasTeen();
        System.out.println(ht.hasTeen(13, 20, 10));  // true
        System.out.println(ht.hasTeen(20, 19, 10));  // true
        System.out.println(ht.hasTeen(20, 10, 13));  // true
        System.out.println(ht.hasTeen(20, 10, 12));  // false
    }
}

