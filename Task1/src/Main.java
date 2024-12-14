// Task - Inspiring Strings
//Link: https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java


public class Main {
    public static String longestWord(String wordString) {

        String maxSizeWord = "";
        String[] symbols = wordString.split(" ");

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].length() >= maxSizeWord.length()) {
                maxSizeWord = symbols[i];
            }
        }

        return maxSizeWord;
    }
}
