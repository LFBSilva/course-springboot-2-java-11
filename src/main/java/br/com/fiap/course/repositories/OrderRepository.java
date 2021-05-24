package br.com.fiap.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
