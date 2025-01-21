package app.toDoList.DTO;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ErroreDTO {
	
	private LocalDateTime time;
	private String errore;
	private String statusErrore;
	
	

}
