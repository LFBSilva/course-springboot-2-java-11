package br.com.fiap.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.course.entities.Order;
import br.com.fiap.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findByID(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
