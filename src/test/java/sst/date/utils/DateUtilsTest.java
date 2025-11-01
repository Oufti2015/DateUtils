package sst.date.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.List;

public class DateUtilsTest {

    public static final LocalDate MAY_10_2023 = LocalDate.of(2023, 5, 10);
    public static final LocalDate JUNE_15_2023 = LocalDate.of(2023, 6, 15);
    public static final LocalDate JULY_20_2023 = LocalDate.of(2023, 7, 20);
    public static final LocalDate JUNE_1_2023 = LocalDate.of(2023, 6, 1);
    public static final LocalDate JUNE_1_2025 = LocalDate.of(2025, 6, 1);

    @Test
    public void testFindClosestDate() {
        // Implémentation des tests unitaires pour la méthode findClosestDate
        List<LocalDate> dates = List.of(
                MAY_10_2023,
                JUNE_15_2023,
                JULY_20_2023
        );

        assertEquals(JUNE_15_2023, DateUtils.findClosestDate(dates, JUNE_1_2023));
        assertEquals(JULY_20_2023, DateUtils.findClosestDate(dates, JUNE_1_2025));
    }
}
