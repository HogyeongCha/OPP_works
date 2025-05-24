package week10.LA5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ComparePi {
    public static void comparePi() {
        String file1 = "PurifyPi.txt";
        String file2 = "DeliciousPie.txt";

        try {
            // get file contents as string
            // use Files.readAllBytes
            String content1 = new String(Files.readAllBytes(Paths.get(file1)));
            String content2 = new String(Files.readAllBytes(Paths.get(file2)));

            if (content1.equals(content2)) {
                System.out.println("identical");
            } else {
                System.out.println("not identical");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

