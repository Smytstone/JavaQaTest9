package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCreateTestCase1() {
        Radio radio = new Radio(10, 0, 0, 0);

        Assertions.assertEquals(10, radio.getNumberOfStations());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
        Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentRadioStationVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(88);

        Assertions.assertEquals(88, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldGetCurrentRadioStationVolume() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldGetRadioStationNumbers() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberOfStations());
    }

    @Test
    public void shouldGetMinRadioStationNumber() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldGetCurrentRadioStationNumber() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetNumberOfStations() {
        Radio radio = new Radio();

        radio.setNumberOfStations(55);

        Assertions.assertEquals(55, radio.getNumberOfStations());

    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();

        radio.setMinStation(15);

        Assertions.assertEquals(15, radio.getMinStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        Assertions.assertEquals(8, radio.getCurrentRadioStationNumber());
    }
}
