package string.stringBuffer.multithreadLoggingSystem;

public class ThreadSafeLogger {
    private StringBuffer logBuffer = new StringBuffer();
    public synchronized void log(String message) {
        logBuffer.append(message).append("\n");
    }
    public synchronized String getLog() {
        return logBuffer.toString();
    }

    public static void main(String[] args) {
        ThreadSafeLogger logger = new ThreadSafeLogger();
        Thread thread1 = new Thread(()->{
            for (int i = 0; i<10; i++) {
                logger.log("Thread1  - log " + i);
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i<10; i++) {
                logger.log("Thread2 - log " + i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(logger.getLog());
    }
}
