package com.yao;

public class WeightedGrade3 {

    int[] earned;
    int[] scores;
    int[] percentage;
    int length;
    public WeightedGrade3(){

    }

    public WeightedGrade3(int[] earned, int[] scores, int[] percentage) {
        this.earned = earned;
        this.scores = scores;
        this.percentage = percentage;
    }

    public int[] getEarned() {
        return earned;
    }

    public void setEarned(int[] earned) {
        this.earned = earned;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int[] getPercentage() {
        return percentage;
    }

    public void setPercentage(int[] percentage) {
        this.percentage = percentage;
    }

    public String getScore(){
        int n= earned.length;
        double weightedScore=0;
        for(int i=0;i<n;i++){
            weightedScore+=(double)earned[i]/scores[i]*percentage[i];
        }
        //weightedScore/=100;
        System.out.println(weightedScore);
        if(weightedScore>=90 && weightedScore<=100){
            return "A";
        }else if(weightedScore>=80 && weightedScore<90){
            return "B";
        }else if(weightedScore>=70 && weightedScore<80){
            return "C";
        }else if(weightedScore>=60 && weightedScore<70){
            return "D";
        }else{
            return "F";
        }

    }
}
