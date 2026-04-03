import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Write a method that takes a list of strings and returns a list
// containing all the ones that start with letter A
public class Problem03 {
    public static List<String> returnListStartingWithChar(List<String> stringList, char startingChar) {
        List<String> outputStrings = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).charAt(0) == startingChar ||
                    stringList.get(i).charAt(0) == getTheOtherCase(startingChar)) {
                outputStrings.add(stringList.get(i));
            }
        }
        return outputStrings;
    }

    private static char getTheOtherCase(char theChar) {
        if (theChar >= 'A' && theChar <= 'Z') {
            return (char) (theChar - 'A' + 'a');
        } else if (theChar >= 'a' && theChar <= 'z') {
            return (char) (theChar - 'a' + 'A');
        } else return theChar;
    }

//    A method that takes a list of strings and a string and
//    returns all strings that start with a character in the second string

    public static List<String> returnListStartingWithChars(List<String> strings, String startingChars) {
        List<String> outputStrings = new ArrayList<>();
        Set<Character> chars = new HashSet<>();
        if (startingChars != null) {
            for (int i = 0; i < startingChars.length(); i++) {
                chars.add(startingChars.charAt(i));
            }
            for (int i = 0; i < strings.size(); i++) {
                if (chars.contains((strings.get(i).charAt(0)))) {
                    outputStrings.add(strings.get(i));
                }
            }
        }
        return outputStrings;
    }

    //A method that gets a list of strings and returns a list of first words of the strings
//A word is delineated by spaces
    public static List<String> returnFirstWords(List<String> strings) {
        List<String> output = new ArrayList<>();
        if (!strings.isEmpty()) {
            for (int i = 0; i < strings.size(); i++) {
                output.add(returnFirstWord(strings.get(i).strip()));
            }
        }
        return output;
    }

    private static String returnFirstWord(String s) {
        int spaceIndex = s.indexOf(' ');
        String output;
        if (spaceIndex > 0) {
            output = s.substring(0, spaceIndex);
        } else {
            output = s;
        }
        return output;
    }

    // Take a list of strings and concatenate them with a space in between
    public static String joinWordsV1(List<String> strings) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            if (i != 0) {
                output.append(" ");
            }
            output.append(strings.get(i));
        }
        return output.toString();
    }

    public static String joinWordsV2(List<String> strings) {
        return String.join(" ", strings);
    }

    public static String joinWordsV3(List<String> strings) {
        return strings.stream().reduce((s, s2) -> s + " " + s2).orElse("");
    }

    public static String joinWordsV4(List<String> strings) {
        return strings.stream().collect(Collectors.joining(" "));
    }

    public static String joinWords(List<String> strings) {
        StringBuilder output = new StringBuilder();
        if (!strings.isEmpty()) {
            output.append(strings.get(0));
        }
        for (int i = 1; i < strings.size(); i++) {
            output.append(" ");
            output.append(strings.get(i));
        }
        return output.toString();
    }

}

