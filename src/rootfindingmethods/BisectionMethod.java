package rootfindingmethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BisectionMethod extends Methods {
	
	private double root;
    public BisectionMethod(double a, double b) {
		super(a,b);
		this.root=getRoot(a,b);
	}


	static final double EPSILON = (float)0.01; 
    
    static double func(double x) 
    { 
        return x*x*x - x*x + 2; 
    } 
  
   
    static double getRoot(double a, double b) 
    { 
        if (func(a) * func(b) >= 0) 
        { 
            System.out.println("You have not assumed"
                        + " right a and b"); 
            return 0; 
        } 
  
        double c = a; 
        while ((b-a) >= EPSILON) 
        { 
             
            c = (a+b)/2; 
  
     
            if (func(c) == 0.0) 
                break; 
  

            else if (func(c)*func(a) < 0) 
                b = c; 
            else
                a = c; 
        } 
               
        BigDecimal bd = new BigDecimal(c).setScale(4, RoundingMode.HALF_EVEN);
        c = bd.doubleValue();
       
        return c; 
    }


	@Override
	public double getMethodRoot() {
		
		return root;
	} 
}
