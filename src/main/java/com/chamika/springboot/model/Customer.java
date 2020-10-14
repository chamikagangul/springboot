package com.chamika.springboot.model;


import com.fasterxml.jackson.annotation.JsonProperty;



public class Customer {


    @JsonProperty("id")
    private int customerId;
    @JsonProperty("firstName")
    private String customerFirstName;
    @JsonProperty("lastName")
    private String getCustomerLastName;
    @JsonProperty("email")
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
