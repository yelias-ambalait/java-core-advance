package string.stringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Initial");

        Runnable task = ()->{
            for (int i = 0; i< 1000; i++) {
                buffer.append("a");
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Buffer length: "+buffer.length());
    }
}
