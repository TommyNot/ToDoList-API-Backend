package app.toDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import app.toDoList.DTO.InsertTaskDTO;
import app.toDoList.DTO.TaskDTO;
import app.toDoList.service.TaskServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
@Tag(name = "Task Controller", description = "Gestione delle Task")
public class TaskController {

    @Autowired
    private TaskServiceInterface taskService;

    @GetMapping("/findAll")
    @Operation(summary = "Vedi tutte le task", description = "Recupera tutte le task esistenti nel sistema.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successo - tutte le task sono state recuperate"),
        @ApiResponse(responseCode = "500", description = "Errore interno del server")
    })
    public ResponseEntity<List<TaskDTO>> getAllTask() throws Exception {
        return ResponseEntity.ok().body(taskService.findAll());
    }

    @PostMapping("/aggiungi")
    @Operation(summary = "Aggiungi una nuova task", description = "Crea una nuova task nel sistema.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successo - task aggiunta con successo"),
        @ApiResponse(responseCode = "400", description = "Dati non validi forniti")
    })
    public ResponseEntity<Void> addTask(@Valid @RequestBody InsertTaskDTO insertTaskDTO) throws Exception {
        taskService.save(insertTaskDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/aggiorna/{id}")
    @Operation(summary = "Aggiorna una task", description = "Aggiorna una task esistente nel sistema.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successo - task aggiornata con successo"),
        @ApiResponse(responseCode = "404", description = "Task non trovata"),
        @ApiResponse(responseCode = "400", description = "Dati non validi forniti")
    })
    public ResponseEntity<TaskDTO> updateTask(@Valid @RequestBody InsertTaskDTO insertTaskDTO, @PathVariable Long id) throws Exception {
        TaskDTO updatedTask = taskService.update(insertTaskDTO, id);
        return ResponseEntity.ok().body(updatedTask);
    }

    @DeleteMapping("/elimina/{id}")
    @Operation(summary = "Elimina una task", description = "Elimina una task esistente nel sistema.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successo - task eliminata con successo"),
        @ApiResponse(responseCode = "404", description = "Task non trovata")
    })
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) throws Exception {
        taskService.delete(id);
        return ResponseEntity.ok().build();
    }
}
