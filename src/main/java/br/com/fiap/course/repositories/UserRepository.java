package br.com.fiap.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
