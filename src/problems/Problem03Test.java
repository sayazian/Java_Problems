package problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem03Test {

    @Test
    void returnListStartingWithChar() {
        List<String> strings = Arrays.asList("apple", "banana", "Apricot", ";");
        List<String> expected = Arrays.asList("apple", "Apricot");
        assertEquals(expected, Problem03.returnListStartingWithChar(strings, 'A'));
        assertEquals(expected, Problem03.returnListStartingWithChar(strings, 'a'));

        List<String> strings2 = Arrays.asList("a");
        List<String> expected2 = Arrays.asList("a");
        assertEquals(expected2, Problem03.returnListStartingWithChar(strings2, 'A'));
        assertEquals(expected2, Problem03.returnListStartingWithChar(strings2, 'a'));
        assertEquals(List.of(), Problem03.returnListStartingWithChar(strings2, 'c'));
    }

    @Test
    void returnListStartingWithChars() {
        List<String> strings = Arrays.asList("apple", "banana", "Apricot", ";");
        String startingChars = "abba";
        List<String> expected = Arrays.asList("apple", "banana");
        assertEquals(expected, Problem03.returnListStartingWithChars(strings, startingChars));

        List<String> strings2 = Arrays.asList("a");
        String startingChars2 = "abba";
        List<String> expected2 = Arrays.asList("a");
        assertEquals(expected2, Problem03.returnListStartingWithChars(strings2, startingChars2));
        assertEquals(List.of(), Problem03.returnListStartingWithChars(strings2, "cc"));

        assertEquals(List.of(), Problem03.returnListStartingWithChars(List.of(), null));
        assertEquals(List.of(), Problem03.returnListStartingWithChars(List.of(), ""));
        assertEquals(List.of(), Problem03.returnListStartingWithChars(List.of("asdf", "qwerty"), ""));

        assertEquals(
                List.of("asdf", "ka"),
                Problem03.returnListStartingWithChars(List.of("asdf", "qwerty", "jkl;", "ka"), "kaa"));
    }

    @Test
    void returnFirstWords() {
        assertEquals(
                List.of("asdf", "qwerty", "jk", "k", "Sahar"),
                Problem03.returnFirstWords(List.of("asdf", "   qwerty", "jk l;", " k a", "Sahar ")));

        assertEquals(
                List.of("a"),
                Problem03.returnFirstWords(List.of("a")));

        assertEquals(
                List.of(),
                Problem03.returnFirstWords(List.of()));

        assertEquals(
                List.of("", ""),
                Problem03.returnFirstWords(List.of(" ", "  ")));

        assertEquals(
                List.of("asdf", "qwer", "jk", "k", "Sahar"),
                Problem03.returnFirstWords(List.of("asdf", "   qwer   ty   ", "jk l;", " k a", "Sahar ")));


    }

    @Test
    void joinWords() {
        assertEquals(
                "asdf qwer jk k Sahar",
                Problem03.joinWords(List.of("asdf", "qwer", "jk", "k", "Sahar")));

        assertEquals(
                "asdf    k ;",
                Problem03.joinWords(List.of("asdf", " ", "", "k", ";")));

        assertEquals(
                "",
                Problem03.joinWords(List.of()));

        assertEquals(
                "a",
                Problem03.joinWords(List.of("a")));

    }
}
