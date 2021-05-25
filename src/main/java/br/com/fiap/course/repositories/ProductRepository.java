package br.com.fiap.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
