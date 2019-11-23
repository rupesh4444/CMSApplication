package com.rupesh.cms.dao;

import com.rupesh.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();
}
