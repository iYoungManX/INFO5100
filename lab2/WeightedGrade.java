package com.yao;

public class WeightedGrade {
    // initialize the field for the weighted grade
    private int totalPoint;
    private int earnedPoints;
    private double assignmentPercentage;
    private double totalWeightedGrade;
    // constructor for initializing the object
    public WeightedGrade(int totalPoint, int earnedPoints, double assignmentPercentage) {
        this.totalPoint = totalPoint;
        this.earnedPoints = earnedPoints;
        this.assignmentPercentage = assignmentPercentage;
    }
    // Getter and Setting for the fields
    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public int getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(int earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public double getAssignmentPercentage() {
        return assignmentPercentage;
    }

    public void setAssignmentPercentage(double assignmentPercentage) {
        this.assignmentPercentage = assignmentPercentage;
    }
    // calculated the weighted grade
    public double getTotalWeightedGrade() {
        totalWeightedGrade= (double) earnedPoints/totalPoint*assignmentPercentage*100; ;
        return totalWeightedGrade;
    }




}
