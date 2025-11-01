package sst.date.utils;

import java.time.LocalTime;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public class TimeUtils {
    public static LocalTime findClosestTime(List<LocalTime> times, LocalTime targetTime) {
        return times.stream()
                .min(Comparator.comparingLong(t -> Math.abs(Duration.between(t, targetTime).toSeconds())))
                .orElse(null); // retourne null si la liste est vide
    }
}
