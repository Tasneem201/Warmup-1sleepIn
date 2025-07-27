public String front3(String str) {
    String front = str.length() < 3 ? str : str.substring(0, 3);
    return front + front + front;
}
 public static void main(String[] args) {
        Front3 f = new Front3();
        System.out.println(f.front3("Java"));      // JavJavJav
        System.out.println(f.front3("Chocolate")); // ChoChoCho
        System.out.println(f.front3("abc"));       // abcabcabc
        System.out.println(f.front3("a"));         // aaa
    }
}
