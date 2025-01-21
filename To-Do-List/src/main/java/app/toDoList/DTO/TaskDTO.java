package app.toDoList.DTO;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class TaskDTO {
	
	private String titolo;
	private boolean completa;

}
