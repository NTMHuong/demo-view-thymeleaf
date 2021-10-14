package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> getAll();

    void save(Customer customer);

    void update(int id, Customer customer);

    void delete (int id );

    Customer findById(int id);

    int findCustomerById(int id);

    List<Customer> findByName(String name);
}
