package sg.edu.ntu.taskflow_api.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import sg.edu.ntu.taskflow_api.model.Task;

@Repository
public class TaskRepository {
    private final Map<Long, Task> tasks = new HashMap<>();
    private long nextId = 1;

    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(nextId++);
        }
        tasks.put(task.getId(), task);
        return task;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Optional<Task> getTaskById(Long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    public void deleteTaskById(Long id) {
        tasks.remove(id);
    }

}
