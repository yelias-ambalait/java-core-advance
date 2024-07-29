package string.stringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
         StringBuilder builder = new StringBuilder("Initial");

        Runnable task = ()->{
            for (int i = 0; i<1000; i++) {
                builder.append("a");
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("String builder length: " + builder.length());
    }
}
