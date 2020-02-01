package rootfindingmethods;

public class Context {
	private Methods strategy;

	public Context(Methods strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double executeStrategy()
	{
		return strategy.getMethodRoot();
	}

}
