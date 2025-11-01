package sst.date.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class DateTimeUtils {
    public static LocalDateTime findClosestTimestamp(List<LocalDateTime> timestamps, LocalDateTime target) {
        return timestamps.stream()
                .min(Comparator.comparingLong(t -> Math.abs(Duration.between(t, target).toSeconds())))
                .orElse(null); // retourne null si la liste est vide
    }
}