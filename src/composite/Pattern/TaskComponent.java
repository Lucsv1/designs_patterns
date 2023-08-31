package composite.Pattern;

import java.util.List;

public abstract class TaskComponent {
	
	public abstract void add(TaskComponent component);
    public abstract void remove(TaskComponent component);
    public abstract List<TaskComponent> getChildren();
    public abstract void displayInfo();

}
