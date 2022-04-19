package com.bpal.scanner;

import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char gender = scanner.next().charAt(0);
        int age = scanner.nextInt();
        long number = scanner.nextLong();
        double cgpa = scanner.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Ph. No.: "+number);
        System.out.println("CGPA: "+cgpa);
    }
    
}
