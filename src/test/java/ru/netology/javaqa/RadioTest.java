package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNumberTestCase1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberTestCase2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-43);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberTestCase3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(60);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberNext() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberPrev() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(3);
        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberLessThanMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationVolume() {
        Radio radio = new Radio();

        radio.getCurrentSoundVolume();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseRadioStationVolumeAboveMax() {
        Radio radio = new Radio();

        radio.getCurrentSoundVolume();
        for (int i = 0; i < 103; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationVolume() {
        Radio radio = new Radio();

        radio.getCurrentSoundVolume();
        radio.increaseVolume();
        radio.reducingVolume();


        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceRadioStationVolumeLessThanMin() {
        Radio radio = new Radio();

        radio.getCurrentSoundVolume();
        radio.reducingVolume();


        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
