package com.AgroAlchemist.BEProject.Ecommerce.RepositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgroAlchemist.BEProject.Ecommerce.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}