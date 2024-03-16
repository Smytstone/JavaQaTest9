package ru.netology.javaqa;
public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
        return;
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
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
