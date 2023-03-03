package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to start the stopwatch");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println("Press any key to stop the stopwatch");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
        System.out.println("Converting millisec to seconds: "+(elapsedTime/1000)+" sec");
    }
}
