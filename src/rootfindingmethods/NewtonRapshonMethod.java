package rootfindingmethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NewtonRapshonMethod extends Methods {
	
	private double root;
	public NewtonRapshonMethod(double a) {
		super(a);
		this.root = getRoot(a);
	}

	static final double EPSILON = 0.0001; 
    static double func(double x) 
    { 
        return x*x*x + x - 3;
    } 
      
    static double derivFunc(double x) 
    { 
        return 3*x*x+1; 
    } 
      
    private double getRoot(double x) 
    { 
        double h = func(x) / derivFunc(x); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = func(x) / derivFunc(x); 

            x = x - h; 
        } 
        BigDecimal bd = new BigDecimal(x).setScale(4, RoundingMode.HALF_EVEN);
        x= bd.doubleValue();
        
      return x;
    }

	@Override
	public double getMethodRoot() {
		return root;
	} 
      
}
