package ucode.curs10;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DatesExamples {

    public static void main(String[] args) {
//        new DatesExamples().createDatesWithFactoryMethod();
//        new DatesExamples().createDatesFromAnotherDate();
//        new DatesExamples().getCurrentDate();
//        new DatesExamples().queryTheLocalDate();
//        new DatesExamples().manipulationAndQuery();
        new DatesExamples().articleExample();
//        new DatesExamples().converting();
//        new DatesExamples().formatting();
    }


    public void createDatesWithFactoryMethod() {
        LocalDate aDate = LocalDate.of(2020, Month.FEBRUARY, 29);
        System.out.println(aDate);
    }

    public void createDatesFromAnotherDate() {
        LocalDate aDate = LocalDate.of(2020, Month.FEBRUARY, 29);
        System.out.println(aDate);
        LocalDate aSecondDate = aDate.with(ChronoField.DAY_OF_MONTH, 1);
        System.out.println(aSecondDate);


    }

    public void getCurrentDate() {
        System.out.println(LocalDate.now());
    }

    public void queryTheLocalDate() {
        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
    }

    public void manipulationAndQuery() {
        LocalDate localDate = LocalDate.now();
        LocalDate modifiedDate = localDate.minusMonths(2).plusDays(45);
        System.out.println(localDate);
        System.out.println(modifiedDate);
        System.out.println(modifiedDate.isBefore(localDate));

        OffsetDateTime offset = OffsetDateTime.now();
        offset = offset.withMonth(Month.JANUARY.getValue()).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(offset);
        System.out.println(offset.plusMonths(1));
        System.out.println(offset.plusMonths(2));
        offset = offset.withMonth(Month.FEBRUARY.getValue()).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(offset);
        System.out.println(offset.plusMonths(1));
        System.out.println(offset.plusMonths(2));

    }

    public void converting() {
        OffsetDateTime offset = OffsetDateTime.now();
        System.out.println("offset = " + offset);
        System.out.println("offset.toZonedDateTime().withZoneSameLocal(ZoneId.systemDefault()) = " + offset.toZonedDateTime().withZoneSameLocal(ZoneId.systemDefault()));
        System.out.println("offset.toZonedDateTime() = " + offset.toZonedDateTime());
        System.out.println("offset.toEpochSecond() = " + offset.toEpochSecond());
        System.out.println("offset.toInstant() = " + offset.toInstant());
        System.out.println("offset.toLocalDateTime() = " + offset.toLocalDateTime());

    }

    public void articleExample() {
        ZoneId zid = ZoneId.systemDefault();
        System.out.printf("Zone Id = %s%n", zid);
        System.out.printf("Rules = %s%n", zid.getRules());
        System.out.printf("DST in effect: %b%n",
                zid.getRules().isDaylightSavings(Instant.now()));


        zid = ZoneId.of("Europe/Paris");
        System.out.printf("Zone Id = %s%n", zid);

        ZoneOffset zoffset = ZoneOffset.of("+06:00");
        System.out.printf("Zone Offset = %s%n", zoffset);
        System.out.printf("Total seconds = %d%n", zoffset.getTotalSeconds());

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(2019, Month.JANUARY, 20), LocalTime.now()), ZoneId.systemDefault());
        System.out.printf("Zoned date and time = %s%n", zonedDateTime);
        System.out.printf("Zone = %s%n", zonedDateTime.getZone());

        zoffset = ZoneOffset.from(zonedDateTime);
        System.out.printf("Zone Offset = %s%n", zoffset);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.printf("Offset date and time = %s%n", offsetDateTime);
        System.out.printf("Offset date and time = %s%n",
                offsetDateTime.with(TemporalAdjusters.lastDayOfMonth()));

        zonedDateTime = ZonedDateTime.of(2013, 11, 2, 3, 00, 0, 0,
                ZoneId.of("America/Chicago"));
        System.out.printf("Zoned date and time = %s%n", zonedDateTime);


        zonedDateTime = ZonedDateTime.of(2013, 11, 3, 3, 00, 0, 0,
                ZoneId.of("America/Chicago"));
        System.out.printf("Zoned date and time = %s%n", zonedDateTime);

        offsetDateTime = OffsetDateTime.of(2013, 11, 2, 3, 00, 0, 0, zoffset);
        System.out.printf("Offset date and time = %s%n", offsetDateTime);

        offsetDateTime = OffsetDateTime.of(2013, 11, 3, 3, 00, 0, 0, zoffset);
        System.out.printf("Offset date and time = %s%n", offsetDateTime);

    }

    public void formatting() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE_TIME;

//        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy");
//        LocalDate date = LocalDate.parse("2057", d1);

//        String dateA = "2019 01 20 14/22/30";
//        LocalDateTime theDate = LocalDateTime.parse(dateA, DateTimeFormatter.ofPattern("yyyy MM dd HH/mm/ss"));
//        System.out.println("theDate = " + theDate);


        System.out.println("Instant.now() = " + Instant.now());
        System.out.println("OffsetDateTime.now() = " + OffsetDateTime.now());
        System.out.println("ZonedDateTime.now() = " + ZonedDateTime.now());
    }

}
