package rootfindingmethods;


public class DriverClass {

	public static void main(String[] args) {
		Context context1=new Context(new BisectionMethod(-2, 3));
		
		context1.executeStrategy();
		
		Context context2=new Context(new FalsePositionMethod(-2, 3));
		
		context2.executeStrategy();
		
	BisectionMethod fixed=new BisectionMethod(-2, 3);
	System.out.println(fixed.getMethodRoot());
	System.out.println("\n");
	
	
	FalsePositionMethod falsePositionMethod=new FalsePositionMethod(-2, 3);
	System.out.println(falsePositionMethod.getMethodRoot());
	System.out.println("\n");
	

	NewtonRapshonMethod newtonRapshonMethod =new NewtonRapshonMethod(2);
	System.out.println(newtonRapshonMethod.getMethodRoot());
	System.out.println("\n");
	}
}
