package ru.netology.javaqa;
public class Radio {
    private int numberOfStations = 10;
    private int minStation = 0;
    private int currentRadioStationNumber = minStation;

    public Radio() {
        this.numberOfStations = numberOfStations;
    }

    public Radio(int size) {
        numberOfStations = minStation + size;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == numberOfStations - 1) {
            currentRadioStationNumber = minStation;
        } else {
            currentRadioStationNumber++;
        }
        return;
    }

    public void prev() {
        if (currentRadioStationNumber == minStation) {
            currentRadioStationNumber = numberOfStations - 1;
        } else {
            currentRadioStationNumber--;
        }
        return;
    }

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }
        if (newRadioStationNumber < 0) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    private int currentSoundVolume;

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = currentSoundVolume;
        }
    }

    public void reducingVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = currentSoundVolume;
        }
    }

}
