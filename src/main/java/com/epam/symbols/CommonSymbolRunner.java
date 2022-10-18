package main.java.com.epam.symbols;

public class CommonSymbolRunner {
    public static void main(String[] args) {
        String string = "aaaawwwwwzzzdddgggghhhheeeeeeerrrrrrrrrr"; // string with value
        char[] array = string.toCharArray(); // converting string into char array
        char ch = '0'; // var for placing the most repeated symbol
        int counter = 0; // counter
        for (char c : array) { // for each run through array // converting char array into chat var
            for (int j = 0; j < array.length - 1; j++) { // run through each element
                if (c == array[j]) { // if converted char equals to array[i]
                    counter++; // increment counter
                    if (counter > array.length) { // counter bigger than array.length
                        ch = array[j]; // assign  array[j] to the ch var
                    }
                }
            }
        }
        System.out.println("character " + ch + " is the most popular");
    }
}
