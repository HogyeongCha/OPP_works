package week12.LA1;

public class DownloadManager {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadFile("file1.zip", 2000));
        Thread t2 = new Thread(new DownloadFile("file2.zip", 4000));

        t1.start();
        t2.start();
    }
}