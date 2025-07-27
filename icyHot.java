public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public static void main(String[] args) {
        IcyHot ih = new IcyHot();
        System.out.println(ih.icyHot(120, -1));  // true
        System.out.println(ih.icyHot(-1, 120));  // true
        System.out.println(ih.icyHot(2, 120));   // false
    }
}

