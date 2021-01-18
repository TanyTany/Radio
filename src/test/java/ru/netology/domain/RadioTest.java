package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    /// проверочные тесты
    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(6);
        assertEquals(6, radio.getCurrentVolume());

    }
 /// вызов метода должен приводить к переключению на одну радиостанцию
    @Test
    public void shouldNextStationWithLastStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.changeNextStation();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldNextStationWithFirstStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(1);
        int expected = 2;
        int actual = radio.changeNextStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStationWithLastStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        int expected = 9;
        int actual = radio.changePrevStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStationWithFirstStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        int expected = 10;
        int actual = radio.changePrevStation();
        assertEquals(expected, actual);

    }

    ///Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука

    @Test
    public void shouldNextVolumeWithLastStation() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.changeNextVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextVolumeWithFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.changeNextVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevVolumeWithLastStation() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 99;
        int actual = radio.changePrevVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevVolumeWithFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.changePrevVolume();
        assertEquals(expected, actual);

    }


}

