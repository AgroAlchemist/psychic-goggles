package com.AgroAlchemist.BEProject.Ecommerce.RepositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgroAlchemist.BEProject.Ecommerce.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
