public class MixStart {
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }

    public static void main(String[] args) {
        MixStart ms = new MixStart();
        System.out.println(ms.mixStart("mix snacks")); // true
        System.out.println(ms.mixStart("pix snacks")); // true
        System.out.println(ms.mixStart("piz snacks")); // false
    }
}

