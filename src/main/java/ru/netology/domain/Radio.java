package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;
    private int increaseVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }

        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

        this.currentVolume = currentVolume;
    }

}



