package strategy.Pattern;

public class HighPriorityStrategy implements PriorityStrategy {
	
	@Override
    public int getPriority() {
        return 3;
    }

}
