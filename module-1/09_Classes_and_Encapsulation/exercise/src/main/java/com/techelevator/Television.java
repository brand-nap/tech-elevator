package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return this.isOn;
    }
    public int getCurrentChannel() {
        return this.currentChannel;
    }
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
    }
    public void changeChannel(int channel){
        this.currentChannel = (this.isOn) ? channel : this.currentChannel;
    }
    public void channelUp(){
        this.currentChannel+= (this.isOn) ? (this.currentChannel<18) ? 1 : -15 : 0;
    }
    public void channelDown(){
        this.currentChannel-= (this.isOn) ? (this.currentChannel>3) ? 1 : -15 : 0;
    }
    public void raiseVolume() {
        this.currentVolume+= (this.isOn&& this.currentVolume<10) ? 1 : 0;
    }
    public void lowerVolume(){
        this.currentVolume-= (this.isOn&& this.currentVolume>0) ? 1 : 0;
    }

}
