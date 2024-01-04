package org.example.module;

public class Population {

    public Population(String city, Long count, String region){
        this.city = city;
        this.count = count;
        this.region = region;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    private  String city ;
    private Long count;
    private String region;


}
