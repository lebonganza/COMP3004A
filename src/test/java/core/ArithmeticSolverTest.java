package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4.0,solver.add(2,2));
	}
	
	public void testSubstarct() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(2.0,solver.substract(4,2));
	}
	
	public void testMultiply() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(16.0,solver.multiply(4,4));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(2.0,solver.divide(8,4));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(1.0, solver.modulus(5,2));
	}
}
