package com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}

public class NumberSystemConverter {
    public static void main(String[] args) throws IOException {

        int base = 0, conversion;
        long num;
        String choose;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main cnv = new Main();

        System.out.println("Choose the operation to be performed:-");
        System.out.println("A. Convert from any system to decimal system");
        System.out.println("B. Convert from decimal system to any system");
        System.out.println("C. Summing up numbers from different systems");
        System.out.println("D. Subtracting numbers from different systems");
        System.out.println("E. Multiplying numbers from different systems");
        System.out.println("F. Dividing numbers from different systems");
        System.out.println("\nG. Exit the program");

        System.out.println("Choose: ");
        choose = br.readLine();

        if (choose.equals("A")) {
            System.out.println("Enter the base(2,8,10,16) of your desired system: ");
            base = Integer.parseInt(br.readLine());

            if (base == 2) {
                System.out.println("Enter number for conversion: ");
                num = Long.getLong(br.readLine());
                cnv.convertBinaryToDecimal;
            }
        }
    }
}
