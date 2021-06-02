package br.com.fiap.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
