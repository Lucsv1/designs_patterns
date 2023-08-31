package observer.Pattern;
import java.util.ArrayList;
import java.util.List;

import strategy.Pattern.PriorityStrategy;

public class Task {
	
	private String title;
    private String status;
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<TaskObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<TaskObserver> observers) {
		this.observers = observers;
	}

	public String getStatus() {
		return status;
	}

	public PriorityStrategy getPriorityStrategy() {
		return priorityStrategy;
	}
	

	private List<TaskObserver> observers = new ArrayList<>();
    private PriorityStrategy priorityStrategy;

    public Task(String title) {
        this.title = title;
        this.status = "PENDING";
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(this);
        }
    }
    
    public void setPriorityStrategy(PriorityStrategy priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
    }

    public int getPriority() {
        return priorityStrategy.getPriority();
    }

	

}
