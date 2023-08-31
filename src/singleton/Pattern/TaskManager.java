package singleton.Pattern;


import java.util.ArrayList;
import java.util.List;

import observer.Pattern.Task;

public class TaskManager {
	
	private static TaskManager instance;

    private List<Task> tasks = new ArrayList <>();

    private TaskManager() {
 
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }


}
