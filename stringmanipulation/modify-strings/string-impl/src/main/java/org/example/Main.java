package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Reverse_string object = new Reverse_string();
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(object.getStringLength(s));
        System.out.println(object.reverseString(s));
    }
}

