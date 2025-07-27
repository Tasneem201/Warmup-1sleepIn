public class StartOz {
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += 'o';
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += 'z';
        }

        return result;
    }

    public static void main(String[] args) {
        StartOz so = new StartOz();
        System.out.println(so.startOz("ozymandias")); // oz
        System.out.println(so.startOz("bzoo"));       // z
        System.out.println(so.startOz("oxx"));        // o
        System.out.println(so.startOz("abc"));        // ""
    }
}
