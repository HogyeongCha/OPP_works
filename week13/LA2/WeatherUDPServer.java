package week13.LA2;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class WeatherUDPServer {
    private static final int PORT = 8888;
    private static Map<String, String> weatherData = new HashMap<>();

    static {
        weatherData.put("seoul", "Sunny, 25°C");
        weatherData.put("busan", "Cloudy, 18°C");
        weatherData.put("daegu", "Rainy, 12°C");
        weatherData.put("incheon", "Cloudy, 14°C");
        weatherData.put("gwangju", "Rainy, 16°C");
        weatherData.put("daejeon", "Cloudy, 13°C");
        weatherData.put("ulsan", "Cloudy, 17°C");
    }

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT);

        byte[] buffer = new byte[1024];

        while (true) {
            try {
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);

                String cityName = new String(receivePacket.getData(), 0, receivePacket.getLength()).trim().toLowerCase();
                System.out.println("Received request for city: " + cityName);

                String weatherInfo = weatherData.get(cityName);
                if (weatherInfo == null) {
                    weatherInfo = "Cannot find City info";
                }

                byte[] responseData = weatherInfo.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(
                        responseData,
                        responseData.length,
                        receivePacket.getAddress(),
                        receivePacket.getPort()
                );

                socket.send(sendPacket);
                System.out.println("Sent weather info: " + weatherInfo);

            } catch (IOException e) {
                System.err.println("Error handling client request: " + e.getMessage());
            }
        }
    }
}