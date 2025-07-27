public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static void main(String[] args) {
        MonkeyTrouble m = new MonkeyTrouble();
        System.out.println("monkeyTrouble(true, true): " + m.monkeyTrouble(true, true));   // true
        System.out.println("monkeyTrouble(false, false): " + m.monkeyTrouble(false, false)); // true
        System.out.println("monkeyTrouble(true, false): " + m.monkeyTrouble(true, false));   // false
    }
}

