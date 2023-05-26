package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text containing integers: ");
        String userInput = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d+"); // match one or more digits
        Matcher matcher = pattern.matcher(userInput);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group()).append(","); // append the matched integer to the result
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1); // remove the extra comma at the end
        }

        System.out.println("Extracted integers: " + result.toString());
    }
}