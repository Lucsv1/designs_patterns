import composite.Pattern.CompositeTask;
import composite.Pattern.SingleTask;
import observer.Pattern.Task;
import observer.Pattern.User;
import strategy.Pattern.HighPriorityStrategy;
import strategy.Pattern.LowPriorityStrategy;

public class Principal {

	public static void main(String[] args) {
		
        Task task1 = new Task("CARROS 2");
        Task task2 = new Task("GOD OF WAR");


        User user1 = new User("JAO");
        User user2 = new User("Lucas");

        
        task1.addObserver(user1);
        task2.addObserver(user2);

        
        task1.setPriorityStrategy(new HighPriorityStrategy());
        task2.setPriorityStrategy(new LowPriorityStrategy());

        
        task1.setStatus("IN PROGRESS");
        task2.setStatus("DONE");

        
        CompositeTask compositeTask = new CompositeTask();
        compositeTask.add(new SingleTask(new Task("Prepare Presentation")));
        compositeTask.add(new SingleTask(new Task("Practice Speech")));

        
        compositeTask.displayInfo();

	}

}
