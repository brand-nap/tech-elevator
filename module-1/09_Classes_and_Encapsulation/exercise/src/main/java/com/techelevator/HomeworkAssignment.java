package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    //setters
    public void setEarnedMarks(int setEarnedMarks){
        this.earnedMarks = setEarnedMarks;
        this.letterGrade = (setEarnedMarks/(double)possibleMarks >= .9 ? "A" : setEarnedMarks/(double)possibleMarks >= .8 ? "B" : setEarnedMarks/(double)possibleMarks >= .7 ? "C" : setEarnedMarks/(double)possibleMarks >= .6 ? "D" : "F");


    }

    //getters
    public int getEarnedMarks(){
        return this.earnedMarks;
    }
    public int getPossibleMarks(){
        return  this.possibleMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }
    public String getLetterGrade() {
        return letterGrade;
    }

    public HomeworkAssignment(int setPossibleMarks, String setSubmitterName){
        this.possibleMarks = setPossibleMarks;
        this.submitterName = setSubmitterName;
    }
}
