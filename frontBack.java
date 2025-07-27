public String frontBack(String str) {
    if (str.length() <= 1) {
        return str;
    }
    
    String mid = str.substring(1, str.length() - 1);
    return str.charAt(str.length() - 1) + mid + str.charAt(0);
}
public static void main(String[] args) {
        FrontBack fb = new FrontBack();
        System.out.println(fb.frontBack("code")); // eodc
        System.out.println(fb.frontBack("a"));    // a
        System.out.println(fb.frontBack("ab"));   // ba
    }
}
