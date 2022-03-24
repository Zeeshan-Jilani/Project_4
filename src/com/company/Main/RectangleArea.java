package com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rectangle_Calculator{
    double l, b, area;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void getData() throws IOException {
        System.out.println("Enter Length: ");
        l = Double.parseDouble(br.readLine());
        System.out.println("Enter Breadth: ");
        b = Double.parseDouble(br.readLine());
    }

    void computeField(){
        area = l * b;
    }

    void fieldDisplay(){
        System.out.println("Length = " + l);
        System.out.println("Breadth = " + b);
        System.out.println("The area of the rectangle is: " + String.format("%.2f", area));
    }
}

public class RectangleArea {
    public static void main(String[] args) throws IOException {
        Rectangle_Calculator rc = new Rectangle_Calculator();
        rc.getData();
        rc.computeField();
        rc.fieldDisplay();
    }
}


