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
    public void shouldSetCurrentRadioStationVolumeTestCase1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(22);

        Assertions.assertEquals(22, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentRadioStationVolumeTestCase2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(120);

        Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentRadioStationVolumeTestCase3() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-20);

        Assertions.assertEquals(0, radio.getCurrentSoundVolume());
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

    @Test
    public void shouldGetNextRadioStationTestCase1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldGetNextRadioStationTestCase2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        radio.next();

        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldGetPrevRadioStationTestCase1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldGetPrevRadioStationTestCase2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }
    @Test
    public void shouldIncreaseRadioStationVolumeTestCase1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(90);
        radio.increaseVolume();

        Assertions.assertEquals(91, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseRadioStationVolumeTestCase2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldReduceRadioStationVolumeTestCase1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(90);
        radio.reducingVolume();

        Assertions.assertEquals(89, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldReduceRadioStationVolumeTestCase2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.reducingVolume();

        Assertions.assertEquals(100, radio.getCurrentSoundVolume());
    }
}
