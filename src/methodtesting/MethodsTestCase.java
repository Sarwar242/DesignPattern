package methodtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rootfindingmethods.BisectionMethod;
import rootfindingmethods.Context;
import rootfindingmethods.FalsePositionMethod;
import rootfindingmethods.NewtonRapshonMethod;


class MethodsTestCase {

	@Test
	void test() {
		Context context=new Context(new BisectionMethod(-2, 3));
		
		double output1=context.executeStrategy();
		
		assertEquals(-0.9941, output1);
		
		Context context2=new Context(new FalsePositionMethod(-2, 3));
		
		double output2=context2.executeStrategy();
		
		assertEquals(-1.0, output2);
		

		Context context3=new Context(new NewtonRapshonMethod(2));
		
		double output3=context3.executeStrategy();
		
		assertEquals(1.2134, output3);
	}
	
}
