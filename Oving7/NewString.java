package Oving7;

import java.util.ArrayList;
import java.util.Arrays;

class NewString {
    private final String text;
    private String shortenedText;
    private String changedText;
    private ArrayList<String> wordList;

    public NewString(String text) {
        this.text = text;
        this.shortenedText = "";
        this.changedText = "";
        this.wordList = new ArrayList<>(Arrays.asList(text.split(" ")));
    }

    public ArrayList<String> getWordList(){
        return this.wordList;
    }

    public String getShortenedText() {
        return this.shortenedText;
    }

    public String getChangedText() {
        return this.changedText;
    }

    public String shorten() {
        this.shortenedText = "";
        for (String word : this.wordList) {
            this.shortenedText += word.charAt(0);
        }
        this.shortenedText = this.shortenedText.toUpperCase();
        return this.shortenedText;
    }

    public String removeSymbols(char ch) {
        this.changedText = "";
        String character = String.valueOf(ch);

        for (String word : this.wordList) {
            if (word.contains(character)) {
                // Remove all occurrences of the character
                word = word.replace(character, "");
            }
            this.changedText += word + " ";
        }

        return this.changedText.trim(); // remove trailing space
    }


    public static void main(String[] args) {
        String text = "Dette er en test tekst.";
        NewString t = new NewString(text);
        System.out.println("Hei");
        System.out.println(t.getWordList());
        t.getShortenedText();
        t.removeSymbols('e');
        t.getShortenedText();
        System.out.println(t.getChangedText());
    }
}
