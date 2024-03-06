package org.example.service.functionality;

public class Address {

    private String AddressLine1;
    private String AddressLine2;
    private double zipcode;
    private String state;


    public Address(String addressLine1, String addressLine2, double zipcode, String state) {
        AddressLine1 = addressLine1;
        AddressLine2 = addressLine2;
        this.zipcode = zipcode;
        this.state = state;
    }
    
    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public double getZipcode() {
        return zipcode;
    }

    public void setZipcode(double zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }







}
