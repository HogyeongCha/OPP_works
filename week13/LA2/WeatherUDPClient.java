package week13.LA2;

import java.io.*;
import java.net.*;

public class WeatherUDPClient {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8888;

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("enter city name (to terminate, exit): ");
            String cityName = reader.readLine();

            if ("exit".equalsIgnoreCase(cityName.trim())) {
                break;
            }

            try {
                byte[] sendData = cityName.getBytes();
                InetAddress serverAddress = InetAddress.getByName(SERVER_HOST);
                DatagramPacket sendPacket = new DatagramPacket(
                        sendData,
                        sendData.length,
                        serverAddress,
                        SERVER_PORT
                );
                socket.send(sendPacket);

                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket);

                String weatherInfo = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("result: " + weatherInfo);

            } catch (IOException e) {
                System.err.println("Error communicating with server: " + e.getMessage());
            }
        }

        socket.close();
        reader.close();
    }
}