package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Todo;

/**
 * @author Petri Kainulainen
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
