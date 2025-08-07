package week13.LA1;

import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("File server started on port 9999");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());

        String filename = dis.readUTF();
        System.out.println("Client requested file: " + filename);

        File file = new File(filename);
        if (!file.exists()) {
            dos.writeLong(-1);
            System.out.println("File not found: " + filename);
        } else {
            dos.writeLong(file.length());
            System.out.println("Sending file: " + filename + " (Size: " + file.length() + " bytes)");

            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[4096];
            int bytes;
            long totalSent = 0;

            while ((bytes = fis.read(buffer)) > 0) {
                dos.write(buffer, 0, bytes);
                totalSent += bytes;
            }
            fis.close();
            System.out.println("File transfer completed. Total bytes sent: " + totalSent);
        }

        dis.close();
        dos.close();
        clientSocket.close();
        serverSocket.close();
        System.out.println("Server closed");
    }
}