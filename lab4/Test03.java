

import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
        Scanner scanner2 = new Scanner();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of assignment: ");
        int len=scanner.nextInt();
        int[] earned=  new int[len];
        int[] scores=  new int[len];
        int[] percentage=  new int[len];
        System.out.println("Please enter the "+len+" earned score");
        System.out.println("=======================================");
        System.out.println("=======================================");
        for(int i=0;i<len;i++){
            System.out.println("Please enter "+len+" earned score "+ (i+1));
            earned[i]=scanner.nextInt();
        }
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Please enter the "+len+" total score");
        for(int i=0;i<len;i++){
            System.out.println("Please enter total score "+ (i+1));
            scores[i]=scanner.nextInt();
        }
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Please enter the "+len+" percentage");
        for(int i=0;i<len;i++){
            System.out.println("Please enter percentage "+ (i+1));
            percentage[i]=scanner.nextInt();
        }

        WeightedGrade3 weightedGrade= new WeightedGrade3(earned,scores,percentage);
        String result= weightedGrade.getScore();
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Your final letter grade is:");
        System.out.println(result);
    }
}
