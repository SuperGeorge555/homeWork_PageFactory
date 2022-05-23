package udm.kor.example.utils;

public class WaitUtil {
    private WaitUtil() {
    }

    public static void waitSecond(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
