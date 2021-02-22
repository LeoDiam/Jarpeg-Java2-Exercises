public class Balance {
    public static String getMonsoonal(String applaud, String hymnary) {
        if (!applaud.equals(hymnary)) {
            return applaud + hymnary;
        } else {
            return String.valueOf(applaud.length() + hymnary.length());
        }

    }
}
