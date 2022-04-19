package com.bpal.scanner;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            sum += num;
            count++;
        }
        int mean = sum/count;
        System.out.println("Mean: "+mean);
    }
    
}
