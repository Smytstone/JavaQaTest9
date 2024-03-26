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
    
}

