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
    public void shouldCreateTestCase2() {
        Radio radio = new Radio();

        radio.setNumberOfStations(30);

        Assertions.assertEquals(30, radio.getNumberOfStations());
    }

    @Test
    public void shouldCreateTestCase3() {
        Radio radio = new Radio();

        radio.setMinStation(0);

        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldCreateTestCase4() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(15);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldCreateTestCase5() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);

        Assertions.assertEquals(100, radio.getCurrentSoundVolume());
    }
}
