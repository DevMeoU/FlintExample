
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                count++;
                System.out.println("Tick #" + count);
            }
        }, 1000, 500);
    }
}
