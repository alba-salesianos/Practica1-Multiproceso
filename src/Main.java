import net.salesianos.processes.ProcessLauncher;
import net.salesianos.utils.Utils;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] vowelArray = {"a","e", "i", "o", "u"};
        ArrayList<Process> allProcesses = new ArrayList<>();

        String text = Utils.getText("src/loremipsum.txt").toLowerCase();

        Integer fileCounter = 0;
        Integer arrayCounter = 0;
        System.out.println(text);

        for (String vowel : vowelArray) {
            fileCounter++;
            String outputFileName = "outputVowel" + fileCounter + ".txt";
            Process javaProcess = ProcessLauncher.initVowelCounterProcess(text,vowelArray[arrayCounter], outputFileName);
            allProcesses.add(javaProcess);
            arrayCounter++;
        }

        for (Process process : allProcesses) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i < fileCounter+1; i++) {
            String outputFileName = "outputVowel" + i + ".txt";
            String outputFileRoute = "./src/net/salesianos/outputs/" + outputFileName;
            Integer vowelsFromFile = Utils.getTotalOfVowels(outputFileRoute);

            System.out.println("La vocal " + vowelArray[i-1] + " aparece " + vowelsFromFile + " veces.");

            File outputFile = new File(outputFileRoute);
            outputFile.delete();



        }












    }
}