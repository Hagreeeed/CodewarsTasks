//task Find the index of the second occurrence of a letter in a string
//Link https://www.codewars.com/kata/63f96036b15a210058300ca9/train/java


public class Main {
    public static int secondSymbol(String str, char c) {
        int index = -1;
        index = str.indexOf(c);
        if(index == -1){
            return -1;
        }
        int secondIndex = str.indexOf(c, index+1);
        return secondIndex;
    }
}