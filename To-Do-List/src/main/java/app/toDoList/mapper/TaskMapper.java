package app.toDoList.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import app.toDoList.DTO.InsertTaskDTO;
import app.toDoList.DTO.TaskDTO;
import app.toDoList.model.Task;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {
	
	public Task fromTaskDTO(TaskDTO taskDTO);
	
	public TaskDTO toTaskDTO(Task task);
	
	public TaskDTO fromInsertTaskDTO(InsertTaskDTO insertTaskDTO);
	
	public List<TaskDTO> fromTaskDTO(List<Task> task);

}
