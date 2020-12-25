package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    /// проверочный тест
    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(20);
        assertEquals(20, radio.getCurrentStation());

    }
 /// вызов метода должен приводить к переключению на одну радиостанцию
    @Test
    public void shouldChangeStation2() {
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.changeStation();
        assertEquals(expected, actual);


    }
}

