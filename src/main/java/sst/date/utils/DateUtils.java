package sst.date.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;

public class DateUtils {
    public static LocalDate findClosestDate(List<LocalDate> dates, LocalDate targetDate) {
        return dates.stream()
                .min(Comparator.comparingLong(d -> Math.abs(ChronoUnit.DAYS.between(d, targetDate))))
                .orElse(null); // retourne null si la liste est vide
    }
}
