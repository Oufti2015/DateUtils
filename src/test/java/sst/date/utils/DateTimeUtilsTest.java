package sst.date.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeUtilsTest {

    public static final LocalDateTime OCTOBER_01_2025_14_30 = LocalDateTime.of(2025, 10, 1, 14, 30);
    public static final LocalDateTime OCTOBER_01_2025_16_45 = LocalDateTime.of(2025, 10, 1, 16, 45);
    public static final LocalDateTime OCTOBER_02_2025_09_00 = LocalDateTime.of(2025, 10, 2, 9, 0);
    public static final LocalDateTime OCTOBER_01_2025_15_00 = LocalDateTime.of(2025, 10, 1, 15, 0);
    public static final LocalDateTime OCTOBER_02_2025_08_00 = LocalDateTime.of(2025, 10, 2, 8, 0);

    @Test
    public void testFindClosestTimestamp() {
        List<LocalDateTime> timestamps = List.of(
                OCTOBER_01_2025_14_30,
                OCTOBER_01_2025_16_45,
                OCTOBER_02_2025_09_00
        );

        assertEquals(OCTOBER_01_2025_14_30, DateTimeUtils.findClosestTimestamp(timestamps, OCTOBER_01_2025_15_00));
        assertEquals(OCTOBER_02_2025_09_00, DateTimeUtils.findClosestTimestamp(timestamps, OCTOBER_02_2025_08_00));
    }
}
