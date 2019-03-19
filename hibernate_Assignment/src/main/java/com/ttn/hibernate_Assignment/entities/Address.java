package com.ttn.hibernate_Assignment.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private Integer streetNumber;
    private String location;
    private String state;
    
    public Integer getStreetNumber() {
        return streetNumber;
    }
    
    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
