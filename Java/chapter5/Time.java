public class Time{
public static void main(String[] args) {
long totalMillSeconds = System.currentTimeMillis();

long totalSeconds = totalMillSeconds / 60;

long currentSeconds = totalMillSeconds % 60;
long totalMinutes = totalSeconds / 60;
long currentMinutes = totalMinutes % 60;
long totalHour = totalMinutes / 60;
long currentHour = totalMinutes % 24;

System.out.print("The current time is " + currentHour + ": " + currentMinutes + ":" + currentSeconds + " GMT");

}
}