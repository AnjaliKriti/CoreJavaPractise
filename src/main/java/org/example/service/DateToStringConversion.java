package org.example.service;
//java.util.Date objects convert  into String in format ‘YYYYMMDD’ and then sort Collection of String in descending order

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DateToStringConversion {

    public static void main(String[] args) {
        List<LocalDate> dateList = new ArrayList<>();

        dateList.add(LocalDate.of(2023, 10, 07));
        dateList.add(LocalDate.of(2023, 10, 05));
        dateList.add(LocalDate.of(2024, 10, 04));
        dateList.add(LocalDate.of(2023, 10, 06));
        dateList.add(LocalDate.of(2026, 10, 03));

        List<String> sortedDate = dateList.stream().map(LocalDate::toString).sorted().collect(Collectors.toList());
        sortedDate.forEach(d -> System.out.println(d));
    }

}
