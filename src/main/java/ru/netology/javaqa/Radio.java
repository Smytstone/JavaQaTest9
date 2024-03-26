package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberOfStations = 10;
    private int minStation = 0;
    private int currentRadioStationNumber = minStation;
    private int currentSoundVolume;

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > 100) {
            return;
        }
        if (currentSoundVolume < 0) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void next() {
        if (currentRadioStationNumber == numberOfStations - 1) {
            currentRadioStationNumber = minStation;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == minStation) {
            currentRadioStationNumber = numberOfStations - 1;
        } else {
            currentRadioStationNumber--;
        }
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 0;
        }
    }

    public void reducingVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 100;
        }
    }
}

