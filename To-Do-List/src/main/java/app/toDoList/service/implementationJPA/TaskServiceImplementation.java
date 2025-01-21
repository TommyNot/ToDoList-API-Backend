package app.toDoList.service.implementationJPA;

import java.util.List;

import org.springframework.stereotype.Service;

import app.toDoList.DTO.InsertTaskDTO;
import app.toDoList.DTO.TaskDTO;
import app.toDoList.mapper.TaskMapper;
import app.toDoList.model.Task;
import app.toDoList.repository.TaskRepository;
import app.toDoList.service.TaskServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskServiceImplementation implements TaskServiceInterface{
	
	private final TaskRepository repositoryTask;
	private final TaskMapper mapperTask;
	
	@Override
	public List<TaskDTO> findAll() throws Exception {
		
		List<Task> task = repositoryTask.findAll();
		return mapperTask.fromTaskDTO(task);
	}

	@Override
	public TaskDTO save(InsertTaskDTO insertTaskDTO) throws Exception {
		
		if(insertTaskDTO == null) {
			throw new IllegalArgumentException("Errore nell'inserimento della task");
		}
		
		Task task = new Task();
		task.setTitolo(insertTaskDTO.titolo);
		task.setCompleta(false);
		
		Task salvaTask = repositoryTask.save(task);
		
		return mapperTask.toTaskDTO(salvaTask);
		
	}

	@Override
	public void delete(long id) throws Exception {
		
		repositoryTask.deleteById(id);
		
	}

	@Override
	public TaskDTO update(InsertTaskDTO insertTaskDTO, long id) throws Exception {
		
		Task task = repositoryTask.findById(id).orElseThrow(()-> new EntityNotFoundException("Task non trovata"));
		
		if(insertTaskDTO.getTitolo() != null && !insertTaskDTO.getTitolo().isBlank()) {
			
			task.setTitolo(insertTaskDTO.getTitolo());
		}
		
		
		task.setCompleta(insertTaskDTO.isCompleta());
		
		
		task = repositoryTask.save(task);
		
		return mapperTask.toTaskDTO(task);
	}

}
