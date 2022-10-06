package com.yao;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] earned=  new int[8];
        int[] scores=  new int[8];;
        int[] percentage=  new int[8];;
        System.out.println("Please enter the 8 earned score");
        System.out.println("=======================================");
        System.out.println("=======================================");
        for(int i=0;i<8;i++){
            System.out.println("Please enter 8 earned score "+ (i+1));
            earned[i]=scanner.nextInt();
        }
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Please enter the 8 total score");
        for(int i=0;i<8;i++){
            System.out.println("Please enter total score "+ (i+1));
            scores[i]=scanner.nextInt();
        }
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Please enter the 8 percentage");
        for(int i=0;i<8;i++){
            System.out.println("Please enter percentage "+ (i+1));
            percentage[i]=scanner.nextInt();
        }

        WeightedGrade2 weightedGrade= new WeightedGrade2(earned,scores,percentage);
        String result= weightedGrade.getScore();
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Your final letter grade is:");
        System.out.println(result);
    }
}
