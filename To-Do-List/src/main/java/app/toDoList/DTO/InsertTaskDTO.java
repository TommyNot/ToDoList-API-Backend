package app.toDoList.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InsertTaskDTO {
	
	@NotNull(message = "Il titolo non può essere null")
	public String titolo;
	public boolean completa;

}
