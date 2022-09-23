package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats = 0;
    private int availableFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats = 0;
    private int availableCoachSeats;

    //getters
    public String getPlaneNumber() {
        return planeNumber;
    }
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }
    public int getAvailableFirstClassSeats(){
        return availableFirstClassSeats;
    }
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }
    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getAvailableCoachSeats() {
        return availableCoachSeats;
    }


    public Airplane(String setPlaneNumber, int setTotalFirstClassSeats, int setTotalCoachSeats){
        this.planeNumber = setPlaneNumber;
        this.totalCoachSeats = setTotalCoachSeats;
        this.totalFirstClassSeats = setTotalFirstClassSeats;
        this.availableCoachSeats = setTotalCoachSeats;
        this.availableFirstClassSeats = setTotalFirstClassSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        if(forFirstClass && totalNumberOfSeats <= availableFirstClassSeats){
            this.bookedFirstClassSeats += totalNumberOfSeats;
            this.availableFirstClassSeats -= totalNumberOfSeats;
            return true;
        }else if(!forFirstClass && totalNumberOfSeats <= availableCoachSeats) {
            this.bookedCoachSeats += totalNumberOfSeats;
            this.availableCoachSeats -= totalNumberOfSeats;
            return true;
        }
        return false;
    }



}
