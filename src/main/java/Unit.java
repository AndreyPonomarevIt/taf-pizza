import java.util.concurrent.TimeUnit;

public class Unit {
        public static void waitTimeFor(int seconds) {
            try {
                TimeUnit.SECONDS.sleep(seconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

