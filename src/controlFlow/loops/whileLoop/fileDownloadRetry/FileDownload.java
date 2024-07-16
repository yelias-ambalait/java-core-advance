package controlFlow.loops.whileLoop.fileDownloadRetry;

import java.util.Random;

public class FileDownload {

    private static final int MAX_RETRIES = 5;
    public static void main(String[] args) {
        boolean downloadSuccessful = false;
        int attempts = 0;

        while (!downloadSuccessful && attempts < MAX_RETRIES) {
            attempts++;
            System.out.println("Attempt #" + attempts + ": Downloading file...");

            downloadSuccessful = new Random().nextBoolean();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (downloadSuccessful) {
                System.out.println("Download successful.");
            } else {
                System.out.println("Download failed. Retrying...");
            }
        }

        if (!downloadSuccessful) {
            System.out.println("Maximum retries reached. Download failed.");
        }
    }
}
