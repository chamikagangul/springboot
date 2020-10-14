package com.chamika.springboot.service;



import com.chamika.springboot.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    private int customerId = 1;

    public Customer addCustomer(Customer customer){
        customer.setCustomerId(this.customerId);
        this.customerList.add(customer);
        this.customerId++;
        return customer;
    }

    public Customer getCustomer(int customerId){
        return this.customerList
                .stream()
                .filter(customer -> customer.getCustomerId()==customerId)
                .findFirst()
                .get();
    }

    public List<Customer> getCustomers(){
        return this.customerList;
    }
}
