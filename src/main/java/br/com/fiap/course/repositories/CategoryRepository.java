package br.com.fiap.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
