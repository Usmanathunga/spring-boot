package com.example.entityMapping.repository;

import com.example.entityMapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer getCustomerByName(String name);
    /**
     * @param email
     * @return
     * **/
    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    Customer getCustomerByEmail(@Param("email") String email);

    /**
     * @param name
     * @param email
     * @return
     * **/

    @Query("SELECT c FROM Customer c WHERE c.email = :email AND c.name = :name")
    Customer getCustomerByNameAndEmail(@Param("email") String email, @Param("name") String name);
}
