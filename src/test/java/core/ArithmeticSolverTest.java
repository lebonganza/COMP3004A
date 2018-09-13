package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4,solver.add(2,2));
	}
	
	public void testSubstarct() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(2,solver.substract(4,2));
	}
	
	public void testMultiply() {
		ArithmeticSollver solver = new ArithmeticSolver();
		
		assertEquals(16,solver.multiply(4,4));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(2,solver.divide(8,4));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(1, solver.modulus(5,2));
	}
}
