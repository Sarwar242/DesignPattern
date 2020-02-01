package rootfindingmethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FalsePositionMethod extends Methods{
	

	private double root;
    public FalsePositionMethod(double a, double b) {
		super(a,b);
		this.root=getRoot(a,b);
	}

    private double getRoot(double a, double b) {
    	if (func(a) * func(b) >= 0)  
        { 
            System.out.println("You have not assumed right a and b"); 
        } 
        // Initialize result 
        double c = a;  
  
        for (int i = 0; i < MAX_ITER; i++)  
        { 
            // Find the point that touches x axis 
            c = (a * func(b) - b * func(a))  
                 / (func(b) - func(a)); 
  
            // Check if the above found point is root 
            if (func(c) == 0) 
                break; 
  
            // Decide the side to repeat the steps 
            else if (func(c) * func(a) < 0) 
                b = c; 
            else
                a = c; 
            
        } 
        BigDecimal bd = new BigDecimal(c).setScale(4, RoundingMode.HALF_EVEN);
        c = bd.doubleValue();
       
        return c; 
	}

	static int MAX_ITER = 1000000; 
    
    static double func(double x) 
    { 
        return (x * x * x - x * x + 2); 
    } 
  
    
  
	@Override
	public double getMethodRoot() {
			
		return root;
	} 
}
