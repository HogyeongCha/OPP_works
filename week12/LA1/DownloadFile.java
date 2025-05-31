package week12.LA1;

public class DownloadFile implements Runnable {
    private String fileName;
    private int size;

    public DownloadFile(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName);
        try {
            Thread.sleep(size);
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
            Thread.currentThread().interrupt();
        }
        System.out.println("Download completed: " + fileName);
    }
}