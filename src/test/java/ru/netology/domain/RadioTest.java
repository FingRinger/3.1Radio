package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void volumeMoreThen10 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(10,radio.getCurrentVolume());

    }
    @Test
    public void volumeLessThen0() {
        Radio radio =new Radio();
        radio.setCurrentVolume(-3);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void StationMoreThen9() {
        Radio radio =new Radio();
        radio.setCurrentStation(10);
        assertEquals(0,radio.getCurrentStation());
      }
    @Test
    public void StationLessThen9() {
        Radio radio =new Radio();
        radio.setCurrentStation(-1);
        assertEquals(9,radio.getCurrentStation());
    }
}
