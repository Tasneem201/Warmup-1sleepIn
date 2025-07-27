public boolean or35(int n) {
    return n % 3 == 0 || n % 5 == 0;
}
 public static void main(String[] args) {
        Or35 o = new Or35();
        System.out.println(o.or35(3));   // true
        System.out.println(o.or35(10));  // true
        System.out.println(o.or35(8));   // false
        System.out.println(o.or35(0));   // true
    }
}
