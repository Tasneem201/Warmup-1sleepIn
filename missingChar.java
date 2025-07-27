public class MissingChar {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {
        MissingChar mc = new MissingChar();
        System.out.println(mc.missingChar("kitten", 1)); // ktten
        System.out.println(mc.missingChar("kitten", 0)); // itten
        System.out.println(mc.missingChar("kitten", 4)); // kittn
    }
}
public String missingChar(String str, int n) {
    return str.substring(0, n) + str.substring(n + 1);
}

