package org.example;

public class Reverse_string {
    public int getStringLength(String str) {
        int getLength = 0;
        for (char ch : str.toCharArray()) {
            getLength++;
        }
        return getLength;
    }

    public String reverseString(String str) {


        int getLength = getStringLength(str);
        String reversed = "";
        for (int index = getLength - 1; index >= 0; index--) {
            reversed = reversed.concat(String.valueOf(str.charAt(index)));

        }
        return reversed;

    }
}
