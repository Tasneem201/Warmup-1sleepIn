public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = a >= 13 && a <= 19;
        boolean bTeen = b >= 13 && b <= 19;
        return aTeen ^ bTeen;
    }

    public static void main(String[] args) {
        LoneTeen lt = new LoneTeen();
        System.out.println(lt.loneTeen(13, 99));  // true
        System.out.println(lt.loneTeen(21, 19));  // true
        System.out.println(lt.loneTeen(13, 13));  // false
    }
}

