# 📝 To-Do List API

## 📄 Descrizione
Questa è una semplice API per la gestione di una lista di attività (To-Do List) implementata utilizzando **Spring Boot**. L'API permette di creare, leggere, aggiornare e eliminare task.

### 🔧 Tecnologie Utilizzate:
- **Java 17** ☕
- **Spring Boot 3.x** 🚀
- **Spring Data JPA** 🗄️
- **MySQL** 🐬
- **MapStruct** 🔄
- **Swagger UI** 📜
- **Lombok** 🤖

## 🚀 Endpoints

L'API espone i seguenti endpoint:

### 1. `GET /api/tasks/findAll`
**Descrizione**: Recupera tutte le task.
- **Risposta (200)**: Una lista di tutte le task. ✅

### 2. `POST /api/tasks/aggiungi`
**Descrizione**: Aggiungi una nuova task.
- **Corpo della richiesta**:
  ```json
  {
    "titolo": "Nuova Task",
    "descrizione": "Descrizione della nuova task",
    "completa": false
  }
  ```
- **Risposta (200)**: Task aggiunta con successo. ✔️

### 3. `PUT /api/tasks/aggiorna/{id}`
**Descrizione**: Aggiorna una task esistente.
- **Parametri**:
  - `id` (Path Variable): ID della task da aggiornare.
- **Corpo della richiesta**:
  ```json
  {
    "titolo": "Titolo aggiornato",
    "descrizione": "Descrizione aggiornata",
    "completa": true
  }
  ```
- **Risposta (200)**: Task aggiornata con successo. 🔄

### 4. `DELETE /api/tasks/elimina/{id}`
**Descrizione**: Elimina una task.
- **Parametri**:
  - `id` (Path Variable): ID della task da eliminare.
- **Risposta (200)**: Task eliminata con successo. 🗑️

## ⚙️ Installazione

1. **Clona il repository**:
   ```bash
   git clone https://github.com/TommyNot/ToDoListEasy-Backend.git
   ```

2. **Accedi alla cartella del progetto**:
   ```bash
   cd ToDoListEasy-Backend
   ```

3. **Compila il progetto**:
   Assicurati di avere [Maven](https://maven.apache.org/) installato. Compila il progetto eseguendo:
   ```bash
   mvn clean install
   ```

4. **Configurazione del database MySQL**:
   - Crea un database chiamato `todolist`.
   - Configura il file `application.properties` per la connessione al tuo database:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todolist
     spring.datasource.username=root
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

5. **Avvia l'applicazione**:
   Puoi avviare l'applicazione con il comando:
   ```bash
   mvn spring-boot:run
   ```

## 🌐 Swagger UI

Una volta che l'applicazione è avviata, puoi accedere alla documentazione interattiva di Swagger UI all'indirizzo:

```
http://localhost:8080/swagger-ui/index.html
```

## 💡 Contributi

Contributi sono sempre benvenuti! Se hai suggerimenti o miglioramenti, non esitare a creare un **Pull Request**.

## 📝 Licenza

Distribuito sotto la licenza MIT. Vedi `LICENSE` per ulteriori informazioni.
```
