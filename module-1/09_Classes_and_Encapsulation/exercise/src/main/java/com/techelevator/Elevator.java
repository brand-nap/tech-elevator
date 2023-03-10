package com.techelevator;

public class Elevator {
    private int currentFloor =1;
    private int numberOfFloors;
    private boolean doorOpen = false;

    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isDoorOpen() {
        return doorOpen;
    }

    public Elevator(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){
        this.currentFloor = (desiredFloor>this.currentFloor &&desiredFloor<=this.numberOfFloors && !this.doorOpen) ? desiredFloor : this.currentFloor;
    }
    public void goDown(int desiredFloor){
        this.currentFloor = (desiredFloor<this.currentFloor &&desiredFloor>=1&& !this.doorOpen) ? desiredFloor : this.currentFloor;
    }

}
