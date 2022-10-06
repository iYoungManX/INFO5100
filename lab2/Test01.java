package com.yao;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // Get the input from the user
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the total point: ");
        int totalPoint=scanner.nextInt();
        System.out.println("Please enter the earned point: ");
        int earnedPoints=scanner.nextInt();
        System.out.println("Please enter the percentage (%): ");
        double assignmentPercentage=(double) scanner.nextInt()/100;
        // initialize the object
        WeightedGrade weightedGrade= new
                WeightedGrade(totalPoint,earnedPoints,assignmentPercentage);
        // print the final results
        System.out.println(assignmentPercentage);
        System.out.println("The weighted grade is: ");
        System.out.println(String.format("%.3f", weightedGrade.getTotalWeightedGrade()));

    }
}
