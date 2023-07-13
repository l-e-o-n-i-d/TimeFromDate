package ex9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeFromDate {
    public static void main(String[] args) {
        timePassed("14.07.1992");
    }
    public static void timePassed(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birth = LocalDate.parse(birthDate, formatter);
        LocalDateTime now = LocalDateTime.now();
        Period period = Period.between(birth, now.toLocalDate());
        Duration duration = Duration.between(birth.atStartOfDay(), now);
        System.out.println("Вам виповнилося " + period.getYears() + " років, " + period.getMonths() + " місяців, " + period.getDays() + " днів, " + duration.toHours() % 24 + " годин, " + duration.toMinutes() % 60 + " хвилин та " + duration.getSeconds() % 60+ " секунд.");
    }
}





