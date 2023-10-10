import net.salesianos.utils.Utils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] vowelArray = {"a","e", "i", "o", "u"};
        ArrayList<Process> allProcesses = new ArrayList<>();

        String text = Utils.getText("src/loremipsum.txt").toLowerCase();

        System.out.println(text);








    }
}