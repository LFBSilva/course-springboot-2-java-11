package br.com.fiap.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.course.entities.Product;
import br.com.fiap.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findByID(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
