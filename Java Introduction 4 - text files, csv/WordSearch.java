/**
 * Autor: Marta Skowron
 * Źródła: https://www.geeksforgeeks.org/collections-sort-java-examples/
 * https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Class WordSearch
 */
public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path:");
        String path = sc.nextLine();

        System.out.println("Enter the first letter of the search words:");
        String letterChecker = sc.nextLine();

        if (letterChecker.length() > 1) {
            System.out.println("More than one character was specified. Please enter only one letter.");
        } else if (letterChecker.length() == 0) {
            System.out.println("No letter entered.");
        } else {
            try {
                if (FindWordsBeginningWithLetter(CreateWordList(path), letterChecker.charAt(0)).size() != 0) {
                    SaveToFile(FindWordsBeginningWithLetter(CreateWordList(path), letterChecker.charAt(0)));
                }
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Method creates list of all words included in txt file
     * @param file file in txt format
     * @return list od all words included in txt file without punctuations
     * @throws IOException if the file is empty
     */
    public static List<String> CreateWordList(String file) {
        List<String> words = new ArrayList<>();
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);
            int data = fis.read();
            if (data == -1) {
                throw new IOException("File is empty.");
            }

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',' ||
                        word.charAt(word.length() - 1) == ':' || word.charAt(word.length() - 1) == ';' ||
                        word.charAt(word.length() - 1) == '"' || word.charAt(word.length() - 1) == '!' ||
                        word.charAt(word.length() - 1) == '?' || word.charAt(word.length() - 1) == '}' ||
                        word.charAt(word.length() - 1) == ']' || word.charAt(word.length() - 1) == ')') {
                    words.add(word.substring(0, word.length() - 1).toLowerCase());
                } else if (word.charAt(0) == '"' || word.charAt(0) == '{' || word.charAt(0) == '[' ||
                        word.charAt(0) == '(') {
                    words.add(word.substring(1).toLowerCase());
                } else {
                    words.add(word.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist.");
        } catch (IOException e) {
            System.out.println("There was a problem while reading your file. Make sure the file exists, " +
                    "the file path has been entered correctly, is not empty or too large.");

        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
        return words;
    }

    /**
     * Method select words from list which are beginning with given letter and puts them into new list
     * @param wordList initial word list
     * @param letter the first letter of searching words
     * @return list of words beginning with the given letter
     * @throws IllegalArgumentException if the given character is not a letter
     */
    public static List<String> FindWordsBeginningWithLetter (List<String> wordList, char letter) {
        List<String> filteredWords = new ArrayList<>();
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("The character entered is not a letter.");
        }
        for (String word : wordList) {
            if (word.charAt(0) == Character.toLowerCase(letter)) {
                filteredWords.add(word);
            }
        }
        Collections.sort(filteredWords);
        return filteredWords;
    }

    /**
     * Method save given list of strings as file and each of these strings are in separate lines
     * @param listOfWords list of words (strings) that are meant to be saved in file
     */
    public static void SaveToFile (List<String> listOfWords) {
        String fileName = "SelectedWordsLetter_" + listOfWords.get(0).charAt(0);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (String word : listOfWords) {
                writer.write(word);
                writer.newLine();
            }
            writer.close();
            System.out.println("Successfully saved to file: " + fileName + '.');
        } catch (IOException e) {
            System.out.println("An error occurred. File not saved.");
        }
    }
}