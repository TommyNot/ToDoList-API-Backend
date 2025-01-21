package app.toDoList.service;

import java.util.List;

import app.toDoList.DTO.InsertTaskDTO;
import app.toDoList.DTO.TaskDTO;

public interface TaskServiceInterface {
	
	List<TaskDTO> findAll()throws Exception;
	
	TaskDTO save(InsertTaskDTO insertTaskDTO)throws Exception;
	
	void delete(long id)throws Exception;
	
	TaskDTO update(InsertTaskDTO insertTaskDTO,long id)throws Exception;

}
