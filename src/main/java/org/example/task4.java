package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if input is a valid RGB color
        System.out.println("Enter an RGB color value:");
        String rgbValue = scanner.nextLine();
        boolean isRgb = rgbValue.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
        System.out.println("Is RGB color: " + isRgb);

        // Check if input is a valid date in the format dd/mm/yyyy
        System.out.println("Enter a date in the format dd/mm/yyyy:");
        String dateValue = scanner.nextLine();
        boolean isDate = dateValue.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}$");
        System.out.println("Is date format valid: " + isDate);

        // Check if input is a valid email address
        System.out.println("Enter an email address:");
        String emailValue = scanner.nextLine();
        boolean isEmail = emailValue.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        System.out.println("Is email address valid: " + isEmail);

        //// Check if input is a valid IP address
        System.out.println("Enter an IP address:");
        String ipAddress = scanner.nextLine();
        boolean isIpAddress = ipAddress.matches("^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])$");
        System.out.println("Is IP address valid: " + isIpAddress);
    }
}