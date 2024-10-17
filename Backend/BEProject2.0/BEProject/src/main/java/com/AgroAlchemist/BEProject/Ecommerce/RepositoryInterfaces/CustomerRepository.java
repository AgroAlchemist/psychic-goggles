package com.AgroAlchemist.BEProject.Ecommerce.RepositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgroAlchemist.BEProject.Ecommerce.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}