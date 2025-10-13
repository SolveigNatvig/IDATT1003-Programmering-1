package Oving6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class TextAnalysis{
    private String myText;

    public TextAnalysis(String myText){
        this.myText = myText;
    }

    // Transforms letters into numbers
    public int charToNumber(char ch){
        ch = Character.toLowerCase(ch);

        if (ch == 'æ'){
            return 26;
        }
        else if (ch == 'ø'){
            return 27;
        }
        else if (ch == 'å'){
            return 28;
        }
        else if (Character.isLetter(ch)){
            return (ch - 'a');
        }
        else{
            return 29;
        }  
    }

    // Translates from numbers to Characters
    public char numberToChar(int number){
        if (number == 26){
            return 'æ';
        }
        else if (number == 27){
            return 'ø';
        }
        else if (number == 28){
            return 'å';
        }
        else if (number == 29){
            return '?';
        }
        else{
            char letter = (char) ('a' + number);
            return letter;
        }
    }

    // Returns the amount of symbols in the text
    public int getLength() {
        return myText.length();
    }

    // Returns the text
    public String getText() {
        return myText;
    }

    // Returns a list with the ammount of each Character
    public ArrayList<Integer> getCharList(){
        ArrayList<Integer> countList = new ArrayList<>(Collections.nCopies(30, 0));

        for (int i = 0; i < this.getLength(); i++){
            char ch = this.getText().charAt(i);
            int index = this.charToNumber(ch);
            countList.set(index, countList.get(index) + 1);
        }
        return countList;  
    }

    // Prints out the list in a table format
    public void listToTable(){
        ArrayList<Integer> countList = this.getCharList();
        int number = 0;
        for (int i: countList){
            char letter = this.numberToChar(number);
            System.out.println(letter + " : " + i);
            number ++;
        }
    }

    // Returns the total number of letters in the text
    public int totalCharNumber(){ 
        ArrayList<Integer> countList = this.getCharList();
        int letterCounter = 0;
        for(int i = 0; i < (countList.size() - 1); i++){
            letterCounter = letterCounter + countList.get(i);
        }
        return letterCounter;
    }

    // Returns the amount of a given Character
    public int amountChar(char ch){
        ArrayList<Integer> countList = this.getCharList();
        return countList.get(charToNumber(ch));
    }

    // Returns the most common Characters
    public ArrayList<Character> mostCommonCharList(){ 
        ArrayList<Integer> countList = this.getCharList();
        ArrayList<Character> mostCommon = new ArrayList<>();
        
        for (int i = 0; i < (countList.size() - 1); i++){
            if (countList.get(i) == this.amountMostCommonChar()){
                mostCommon.add(numberToChar(i));
            }
        }
        return mostCommon;
    }

    // Prints the characters from the ArrayList of the most common characters
    public void mostCommonChar(){ 
        ArrayList<Character> mostCommon = this.mostCommonCharList();
        for (int i = 0; i < mostCommon.size(); i++){
            System.out.println(mostCommonCharList().get(i));
        }
    }

    // Returns how many there is of the most common Character
    public int amountMostCommonChar(){ 
        ArrayList<Integer> countList = this.getCharList();
        int letterCounter = 0;
        for(int i = 0; i < (countList.size()); i++){
            if (letterCounter < countList.get(i)){
                letterCounter = countList.get(i);
            }
        }
        return letterCounter;
    }

    // Returns the amount of unique characters
    public int amountUniqueChar(){
        ArrayList<Integer> countList = this.getCharList();
        countList.removeLast(); // Removes the last element of the list because we aren't interested in non-char
        int number = 0;

        // for-loop that goes through each element of the list
        for (int i: countList){
            if (i != 0){
                number += 1;
            }
        }
        return number;
    }

    // Returns the persentage of non characters in the text
    public double persentageNonChar(){ 

        double persentageSymbol = (this.getCharList().get(29)/(double)this.getLength())*100;
        return persentageSymbol;
    }

    public void mainRunning(char ch){ 
        System.out.println("Number of unique characters: " + this.amountUniqueChar());
        System.out.println("Total number of characters: " + this.totalCharNumber());
        System.out.println("Percentage non-caracters: " + this.persentageNonChar() + "%");
        System.out.println("Amount of the character " + ch + ": " + this.amountChar(ch));
        System.out.println("The most common character(s) is/are listed below: ");
        this.mostCommonChar();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true){

            System.out.println("Write a text: ");
            String text = scan.nextLine();


            if (text.equals("stop")){
                break;
            }

            System.out.println("Type a character to see how many times it occurs in the text: ");
            char character = scan.nextLine().charAt(0);

            TextAnalysis text1 = new TextAnalysis(text);
            text1.mainRunning(character);
        }

        scan.close();
    }
}