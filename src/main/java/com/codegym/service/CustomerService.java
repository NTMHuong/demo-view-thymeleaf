package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "huong", "huong@123", "NB"));
        customers.add(new Customer(2, "abc", "abc@123", "VN"));
        customers.add(new Customer(3, "nguyen", "nguyen@123", "NB"));
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(int id, Customer customer) {
        int index = findCustomerById(id);
        customers.set(index, customer);
    }

    @Override
    public void delete(int id) {
        int index = findCustomerById(id);
        customers.remove(index);

    }

    @Override
    public Customer findById(int id) {
        int index = findCustomerById(id);
        return customers.get(index);
    }

    @Override
    public int findCustomerById(int id) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> newCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                newCustomers.add(customer);
            }
        }
        return newCustomers;
    }
}
