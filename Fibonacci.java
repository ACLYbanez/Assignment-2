//This is a program that run a Fibonacci sequence that doesn't surpass 10,000 

import acm.program.*;

public class Fibonacci extends ConsoleProgram{

	private static final int MAX_VALUE = 10000;

	public void run() {
		println("This is a Fibonacci sequence");
		int x1 = 0;
		int x2 = 1;
		int x3;
		while (x1 <= MAX_VALUE){
			println(x1);
			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
		}

	}
}