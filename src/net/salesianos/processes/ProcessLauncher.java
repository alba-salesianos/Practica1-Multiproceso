package net.salesianos.processes;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private final static String OUTPUT_ROUTE = "./src/net/salesianos/outputs/";

    public static Process initVowelCounterProcess(String text, String vowel, String fileName) {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "./src/net/salesianos/processes/VowelCounter.java", text, vowel
        );

        Process javaProcess = null;

        try {
            File outputFile = new File(OUTPUT_ROUTE + fileName);
            processBuilder.redirectOutput(outputFile);
            javaProcess = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return javaProcess;
    }
}
