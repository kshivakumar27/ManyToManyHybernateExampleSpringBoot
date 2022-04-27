package com.hibernatemm.hibernatemm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernatemm.hibernatemm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
