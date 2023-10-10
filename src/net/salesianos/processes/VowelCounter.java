package net.salesianos.processes;

public class VowelCounter {
    public static void main(String[] args) {
        String text = args[0];
        String vowel = args[1];


        int repetitionOfVowel = 0;

        for (int i = 0; i < text.length(); i++) {
            String c = String.valueOf(text.charAt(i));

            if (c.equals(vowel)) {
                repetitionOfVowel++;
            }
        }

        System.out.println(repetitionOfVowel);

    }
}
