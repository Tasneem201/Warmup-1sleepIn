public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn s = new SleepIn();
        System.out.println("sleepIn(false, false): " + s.sleepIn(false, false)); // true
        System.out.println("sleepIn(true, false): " + s.sleepIn(true, false));   // false
        System.out.println("sleepIn(false, true): " + s.sleepIn(false, true));   // true
    }
}

