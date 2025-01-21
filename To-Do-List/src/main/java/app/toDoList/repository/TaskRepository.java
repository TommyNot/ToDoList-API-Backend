package app.toDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.toDoList.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
