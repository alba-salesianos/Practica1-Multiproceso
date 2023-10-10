import net.salesianos.processes.ProcessLauncher;
import net.salesianos.utils.Utils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] vowelArray = {"a","e", "i", "o", "u"};
        ArrayList<Process> allProcesses = new ArrayList<>();

        String text = Utils.getText("src/loremipsum.txt").toLowerCase();

        Integer arrayCounter = 0;
        System.out.println(text);

        for (String vowel : vowelArray) {
            String outputFileName = "outputVowel_" + vowelArray[arrayCounter] + ".txt";
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












    }
}