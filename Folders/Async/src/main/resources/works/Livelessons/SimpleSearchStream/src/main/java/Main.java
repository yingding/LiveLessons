import search.WordSearcher;
import utils.TestDataFactory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
 * This program searches seqentially for the occurrence of words in a
 * string containing the contents of a file.  It demonstrates the use
 * of basic Java 8 functional programming features (such as lambda
 * expressions and method references) in conjunction with Java 8
 * sequential streams and a spliterator.
 */
public class Main {
    /*
     * Input files.
     */

    /**
     * The lyrics to the "Do-Re-Mi" song from the Sound of Music
     * musical.
     */
    private static final String sINPUT_FILE =
        "do-re-mi.txt";

    /**
     * A list of words to search for the input file.
     */
    private static final String sWORD_LIST_FILE =
        "wordList.txt";

    /**
     * This is the main entry point into the program.
     */
    static public void main(String[] args) {
        System.out.println("Starting SimpleSearchStream");

        // Create an input string containing the lyrics to the
        // do-re-mi song.
        String input = 
            TestDataFactory.getInput(sINPUT_FILE, "@").get(0);

        // Get the list of words to find.
        List<String> wordsToFind = 
            TestDataFactory.getWordList(sWORD_LIST_FILE);

        // Create an object that can be used to search for words in
        // the input.
        WordSearcher wordSearcher =
            new WordSearcher(input);
                                                             
        // Print all matching words.
        wordSearcher.findAndPrintWords(wordsToFind);

        System.out.println("Ending SimpleSearchStream");
    }
}

