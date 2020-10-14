package com.chamika.springboot.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private int customerId;
    @JsonProperty("FName")
    private String customerFirstName;
    @JsonProperty("LName")
    private String getCustomerLastName;
    @JsonProperty("Email")
    private String customerEmail;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getGetCustomerLastName() {
        return getCustomerLastName;
    }

    public void setGetCustomerLastName(String getCustomerLastName) {
        this.getCustomerLastName = getCustomerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
