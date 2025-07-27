public String front22(String str) {
    String front = str.length() < 2 ? str : str.substring(0, 2);
    return front + str + front;
}

  public static void main(String[] args) {
        Front22 f = new Front22();
        System.out.println(f.front22("kitten")); // kikittenki
        System.out.println(f.front22("Ha"));     // HaHaHa
        System.out.println(f.front22("abc"));    // ababcab
        System.out.println(f.front22("x"));      // xxx
    }
}
