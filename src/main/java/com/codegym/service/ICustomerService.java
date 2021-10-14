package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();

    void save(Customer customer);

    void update(int id, Customer customer);

    void delete (int id );

    Customer findById(int id);

    int findByIdCustomer(int id);

}
