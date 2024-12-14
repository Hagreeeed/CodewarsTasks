
//Task Check three and two
//link https://www.codewars.com/kata/5a9e86705ee396d6be000091/train/java

public class Main {
    public boolean checkThreeAndTwo(char[] chars) {
        int countA = 0, countB = 0, countC = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                countA++;
            } else if (chars[i] == 'b') {
                countB++;
            } else if (chars[i] == 'c') {
                countC++;
            }
        }

        return (countA == 3 && countB == 2) ||
                (countA == 3 && countC == 2) ||
                (countB == 3 && countA == 2) ||
                (countB == 3 && countC == 2) ||
                (countC == 3 && countA == 2) ||
                (countC == 3 && countB == 2);
    }
}