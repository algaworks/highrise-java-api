/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

/**
 *
 * @author duncan
 */
public class Address {
    
    private Long id;
    private String city;
    private String country;
    private String state;
    private String street;
    private String zip;
    private String location;

    public Address() {
    }

    public Address(String city, String country, String street, String zip, String location) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.zip = zip;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
}
