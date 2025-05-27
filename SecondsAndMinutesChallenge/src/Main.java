//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Seconds is negative";
        }
        int hrs = seconds / 3600;
        int mins = (seconds % 3600) / 60;
        int secs = (seconds % 3600) % 60;
        return hrs + "h " + mins + "m " + secs + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid minutes or seconds";
        } else {
           int totalSecs = (minutes * 60) + seconds;
            int hrs = totalSecs / 3600;
            int mins = (totalSecs % 3600) / 60;
            int secs = (totalSecs % 3600) % 60;
            return hrs + "h " + mins + "m " + secs + "s";
        }
    }

}