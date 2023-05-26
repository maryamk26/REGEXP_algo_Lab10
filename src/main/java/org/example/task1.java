package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String userInput = sc.nextLine();

        String patternString = "abcd\\d{10}";  // match "abcd" followed by 10 digits

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(userInput);

        if (matcher.matches()) {
            String result = userInput.replaceAll("\\d{4}", "****");
            System.out.println("Result: " + result);
        } else {
            System.out.println("The input does not match the pattern.");
        }
    }
}