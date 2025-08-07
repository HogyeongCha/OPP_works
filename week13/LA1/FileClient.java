package week13.LA1;

import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file name to download: ");
        String filename = reader.readLine();

        dos.writeUTF(filename);

        long fileSize = dis.readLong();

        if (fileSize == -1) {
            System.out.println("File not found on server.");
        } else {
            System.out.println("Downloading file: " + filename + " (Size: " + fileSize + " bytes)");

            FileOutputStream fos = new FileOutputStream("downloaded_" + filename);
            byte[] buffer = new byte[4096];
            int bytesRead;
            long totalRead = 0;

            while (totalRead < fileSize && (bytesRead = dis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalRead += bytesRead;
            }
            fos.close();

            System.out.println("File downloaded successfully.");
            System.out.println("Total bytes received: " + totalRead);

            File downloadedFile = new File("downloaded_" + filename);
            if (downloadedFile.length() == fileSize) {
                System.out.println("File integrity verified: Size matches (" + fileSize + " bytes)");
            } else {
                System.out.println("Warning: File size mismatch! Expected: " + fileSize + ", Actual: " + downloadedFile.length());
            }
        }

        dis.close();
        dos.close();
        socket.close();
        System.out.println("Connection closed");
    }
}