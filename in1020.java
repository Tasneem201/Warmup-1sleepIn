public class In1020 {

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public static void main(String[] args) {
        In1020 obj = new In1020();

        System.out.println(obj.in1020(12, 99));  // true
        System.out.println(obj.in1020(21, 12));  // true
        System.out.println(obj.in1020(8, 99));   // false
    }
}

