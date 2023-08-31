package observer.Pattern;

public class User implements TaskObserver {
	    private String name;

	    public User(String name) {
	        this.name = name;
	    }

	    @Override
	    public void update(Task task) {
	        System.out.println("User " + name + ": Task status changed to " + task.getStatus());
	    }

}
