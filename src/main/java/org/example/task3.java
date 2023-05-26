package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String inputString = scanner.nextLine();

        List<Double> numbers = extractDecimalNumbers(inputString);
        System.out.println("The extracted decimal numbers are: " + numbers);

        double sum = calculateSumOfNumbers(numbers);
        double maxNumber = findMaxNumber(numbers);
        int maxNumberIndex = numbers.indexOf(maxNumber);

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Index of maximum number: " + (maxNumberIndex + 1));

        String replacedString = replaceDecimalNumbers(inputString);
        System.out.println("Replaced string: " + replacedString);
    }

    private static List<Double> extractDecimalNumbers(String text) {
        List<Double> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("[+-]?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String numString = matcher.group().replace(",", ".");
            double num = Double.parseDouble(numString);
            numbers.add(num);
        }
        return numbers;
    }

    private static double calculateSumOfNumbers(List<Double> numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static double findMaxNumber(List<Double> numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static String replaceDecimalNumbers(String text) {
        Pattern pattern = Pattern.compile("[+-]?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll("decimal");
    }
}