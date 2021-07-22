package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;


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

    //ниже реализация пункта 1
    public int getCurrentVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }
    //ниже реализация пунктов 2 и 3
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }

        this.currentVolume = currentVolume;
    }


    }



