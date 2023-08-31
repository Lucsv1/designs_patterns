package composite.Pattern;
import java.util.ArrayList;
import java.util.List;

import observer.Pattern.Task;

public class SingleTask extends TaskComponent {
	
	private Task task;

    public SingleTask(Task task) {
        this.task = task;
    }

    @Override
    public void add(TaskComponent component) {
    }

    @Override
    public void remove(TaskComponent component) {
    }

    @Override
    public List<TaskComponent> getChildren() {     
        return new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Single Task: " + task.getTitle() + ", Status: " + task.getStatus());
    }
}


