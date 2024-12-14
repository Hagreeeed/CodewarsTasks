//Task Odder Than the Rest
//Link https://www.codewars.com/kata/5983cba828b2f1fd55000114/train/java


public class Main {
    public static int oddOne(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return index = i;
            }
        }
        return -1;
    }
}