package strategy.Pattern;

public class LowPriorityStrategy implements PriorityStrategy  {
	
	@Override
    public int getPriority() {
        return 1;
    }

}
