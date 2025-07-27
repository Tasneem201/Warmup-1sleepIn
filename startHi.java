public class StartHi {
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static void main(String[] args) {
        StartHi s = new StartHi();
        System.out.println(s.startHi("hi there"));   // true
        System.out.println(s.startHi("hi"));         // true
        System.out.println(s.startHi("hello hi"));   // false
    }
}

