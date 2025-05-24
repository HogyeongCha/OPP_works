package week10.LA5;

import java.io.*;
import java.util.regex.*;

public class PurifyPi {
    public static void prufiyPi() {
        String inputFile = "StargazyPie.txt";
        String outputFile = "PurifyPi.txt";

        try {
            // read inputfile and purify
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            Pattern pattern = Pattern.compile("\\d");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.write(matcher.group());
                }
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
