package composite.Pattern;
import java.util.ArrayList;
import java.util.List;

public class CompositeTask extends TaskComponent{
	
	private List<TaskComponent> children = new ArrayList <>();

    @Override
    public void add(TaskComponent component) {
        children.add(component);
    }

    @Override
    public void remove(TaskComponent component) {
        children.remove(component);
    }

    @Override
    public List<TaskComponent> getChildren() {
        return children;
    }

    @Override
    public void displayInfo() {
        System.out.println("Composite Task:");
        for (TaskComponent child : children) {
            child.displayInfo();
        }
    }

}
