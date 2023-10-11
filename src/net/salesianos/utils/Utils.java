package net.salesianos.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    public static String getText(String fileRoute) {
        String text = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRoute));

            String ls = System.getProperty("line.separator");

            while ((text = bufferedReader.readLine()) != null) {
                stringBuilder.append(text);
                stringBuilder.append(ls);
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static Integer getTotalOfVowels(String fileRoute) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRoute));
            String firsLine = bufferedReader.readLine();
            bufferedReader.close();
            return Integer.parseInt(firsLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
