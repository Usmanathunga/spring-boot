package com.example.entityMapping.repository;

import com.example.entityMapping.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;


    @Test
    void saveData(){
        Customer customer = new Customer();

        customer.setName("test");
        customer.setEmail("teste@h.com");

        Customer customer1 = customerRepository.save(customer);
        System.out.println(customer1.getId());
    }

    @Test
    void getCustomerByName(){
        String name = "test";
        Customer customer = customerRepository.getCustomerByName(name);
        System.out.println(customer);
    }

    @Test
    void getCustomerByEmail(){
        String email = "teste@h.com";
        Customer customer = customerRepository.getCustomerByEmail(email);
        System.out.println(customer);
    }

    @Test
    void getCustomerByNameAndEmail(){
        String name = "test";
        String email = "teste@h.com";
        Customer customer = customerRepository.getCustomerByNameAndEmail(email,name);
        System.out.println(customer);

    }

}