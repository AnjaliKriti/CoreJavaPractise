package org.example.service.collections;


//    city              count           region
//        Delhi             4M               North
//        Mumbai        7M               West
//        Chennai    6M               South
//        Chandigarh  2M               North
//        Kolkata            17M                  East
//        for a given region or multiple region - list the number of  cities grouped by population range
//        Population Ranges are  1M to 5M   and 6M to 10M   and  above 10M
//        Example ->
//        Input ->
//        All Region
//        Output -
//        1M-to-5M     6M-to-10M  above 10M
//        2                       2

import org.example.module.Population;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfCities {
    public static void main(String[] args) {

        Population population ;
        List<Population>  populationList = new ArrayList<>();
        populationList.add(new Population("Delhi", 8L,"North"));
        populationList.add(new Population("Mumbai", 7L,"West"));
        populationList.add(new Population("Chennai", 6L,"South"));
        populationList.add(new Population("Chandigarh", 2L,"North"));
        populationList.add(new Population("Kolkata", 17L,"East"));

        Map populationWithRange =  findNumberOfCitiesInRegion(populationList , "North" );
        System.out.println(populationWithRange);

    }

    private static Map findNumberOfCitiesInRegion(List<Population> populationList, String region ) {

        Map<String , Long> populationWithRange  =  populationList.stream().filter(population -> population.getRegion() == region ).
                collect(Collectors.groupingBy(cities -> {
                    if (cities.getCount() >= 1L && cities.getCount() <= 5L)
                        return "1M-5M";
                    else if (cities.getCount() > 5L && cities.getCount() <= 10L) {
                        return "5M-10M";
                    } else if (cities.getCount() > 10L ) {
                        return "above 10M";
                    }
                    else return "Invalid";
                },Collectors.counting()));
        return populationWithRange;
    }

}
