package _22y._02m._03d_42;
// 1.
// Textovým editorem vytvořte soubor pismena.txt, ve kterém bude
// několik řádek složených z malých a velkých písmen a mezer.
// Napište program, který tento soubor přečte a opíše na obrazovku.
// Současně do souboru velky.txt zapisuje obsah čteného souboru,
// ale malá písmena převádí na velká
// 2.
// Napište program, který přečte soubor pismena.txt po řádcích. Každou
// řádku přesně opíše do souboru kolik.txt a v něm na další řádce uvede,
// kolik malých písmen na ní bylo

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class DomaciUkol {
    public static Path letters = Paths.get("./resources/_42/letters.txt");
    public static Path upCase = Paths.get("./resources/_42/upCaseLetters.txt");
    public static Path howMany = Paths.get("./resources/_42/howMany.txt");

    public static List<String> lines;
    public static ArrayList<String> charKeys = new ArrayList<String>(){{
        add("characters");      // 0
        add("lowerCase");       // 1
        add("upperCase");       // 2
        add("vowel");           // 3
        add("consonant");       // 4
        add("space");           // 5
        add("lineBreak");       // 6
        add("other");           // 7
    }};

    public static void main(String[] args) {
        try {
            Files.writeString(upCase, "");
            Files.writeString(howMany, "");
            if (!Files.exists(letters)) {
                throw new NoSuchFileException("File letters.txt does not exist");
            }
            lines = Files.readAllLines(letters);

//            printFile();
            toUpperCaseFile();
            howManyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printFile() throws IOException {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void toUpperCaseFile() throws IOException {
        for (int i = 0; i < lines.size(); i++) {
            Files.writeString(upCase,
                    lines.get(i).toUpperCase(Locale.ROOT) + (i == lines.size() - 1 ? "": "\n"),
                    StandardOpenOption.APPEND);
        }
    }

    public static void howManyFile() throws IOException {
        HashMap<String, Integer> values = new HashMap<String, Integer>();
        HashMap<String, Integer> valuesPerRow = new HashMap<String, Integer>();

        StringBuilder temp = new StringBuilder("%s:\n");
        for (String charKey : charKeys) {
            temp.append(String.format("\t%-15s%s\n", charKey + ":", "%d"));
        }

        for (int i = 0; i < lines.size(); i++) {
            for (char c : lines.get(i).toCharArray()) {
                checkChar(values, c);
                checkChar(valuesPerRow, c);
            }
            Files.writeString(howMany, formatString(valuesPerRow, temp.toString(), "" + i, false),
                    StandardOpenOption.APPEND);
            valuesPerRow = new HashMap<String, Integer>();

            if (i == lines.size() - 1) {
                break;
            }
            addToHM(values, 6);
        }
        Files.writeString(howMany, formatString(values, temp.toString(), "File"),
                        StandardOpenOption.APPEND);
    }

    private static String formatString(HashMap<String, Integer> values, String temp, String name) {
        return formatString(values, temp, name, true);
    }

    private static String formatString(HashMap<String, Integer> values, String temp, String name, boolean lines) {
        String[] finalHowMany = temp.split("\n");
        finalHowMany[0] = String.format(finalHowMany[0], name) + '\n';
        int tempInfo;
        for (int i = 1; i < finalHowMany.length; i++) {
            if (!lines && charKeys.get(i - 1).equals("lineBreak")) {
                finalHowMany[i] = "";
                continue;
            }
            tempInfo = values.get(charKeys.get(i - 1)) == null ? 0 :
                    values.get(charKeys.get(i - 1));
            finalHowMany[i] = String.format(finalHowMany[i], tempInfo) + '\n';
        }
        return String.join("", finalHowMany);
    }

    private static void checkChar(HashMap<String, Integer> values, Character c) {
        boolean something = false;

        addToHM(values, 0);
        if (Character.isLowerCase(c)){
            something = addToHM(values, 1);
        }
        if (Character.isUpperCase(c)) {
            something = addToHM(values, 2);
        }
        c = Character.toLowerCase(c);
        if ("aeiouy".contains("" + c)) {
            something = addToHM(values, 3);
        }
        if ("bcdfghjklmnpqrstvwxz".contains("" + c)) {
            something = addToHM(values, 4);
        }
        if (c == ' ') {
            something = addToHM(values, 5);
        }
        if (c == '\n') {
            something = addToHM(values, 6);
        }

        if (!something) {
            addToHM(values);
        }
    }

    private static void addToHM(HashMap<String, Integer> values) {
        addToHM(values, charKeys.size());
    }

    private static boolean addToHM(HashMap<String, Integer> values, int keyIndex) {
        String key = charKeys.get(keyIndex);
        values.put(key, values.merge(key, 1, Integer::sum));
        return true;
    }
}
