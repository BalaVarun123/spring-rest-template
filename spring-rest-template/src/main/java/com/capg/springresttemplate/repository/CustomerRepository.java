package com.capg.springresttemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springresttemplate.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
