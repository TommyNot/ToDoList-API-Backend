package app.toDoList.mapper;

import app.toDoList.DTO.InsertTaskDTO;
import app.toDoList.DTO.TaskDTO;
import app.toDoList.model.Task;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-21T19:38:17+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromTaskDTO(TaskDTO taskDTO) {
        if ( taskDTO == null ) {
            return null;
        }

        Task task = new Task();

        task.setCompleta( taskDTO.isCompleta() );
        task.setTitolo( taskDTO.getTitolo() );

        return task;
    }

    @Override
    public TaskDTO toTaskDTO(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setCompleta( task.isCompleta() );
        taskDTO.setTitolo( task.getTitolo() );

        return taskDTO;
    }

    @Override
    public TaskDTO fromInsertTaskDTO(InsertTaskDTO insertTaskDTO) {
        if ( insertTaskDTO == null ) {
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setCompleta( insertTaskDTO.isCompleta() );
        taskDTO.setTitolo( insertTaskDTO.getTitolo() );

        return taskDTO;
    }

    @Override
    public List<TaskDTO> fromTaskDTO(List<Task> task) {
        if ( task == null ) {
            return null;
        }

        List<TaskDTO> list = new ArrayList<TaskDTO>( task.size() );
        for ( Task task1 : task ) {
            list.add( toTaskDTO( task1 ) );
        }

        return list;
    }
}
