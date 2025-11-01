package sst.date.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    public static final LocalTime TIME_09_30 = LocalTime.of(9, 30);
    public static final LocalTime TIME_12_45 = LocalTime.of(12, 45);
    public static final LocalTime TIME_15_00 = LocalTime.of(15, 0);
    public static final LocalTime TIME_13_00 = LocalTime.of(13, 0);

    @Test
    public void testFindClosestTime() {
        // Implémentation des tests unitaires pour la méthode findClosestTime
        List<LocalTime> times = List.of(
                TIME_09_30,
                TIME_12_45,
                TIME_15_00
        );

        assertEquals(TIME_12_45, TimeUtils.findClosestTime(times, TIME_13_00));
        assertEquals(TIME_09_30, TimeUtils.findClosestTime(times, TIME_09_30));
    }
}
