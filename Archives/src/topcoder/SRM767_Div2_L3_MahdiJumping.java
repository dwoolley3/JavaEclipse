package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;

// Not yet working


public class SRM767_Div2_L3_MahdiJumping
{
	public long minDis(int n, int A, int B, int a, int b)
	{
		long[] min = new long[n];
		for (int i = 0; i < n-1; i++) {
			min[i] = (n-1 - i) * 1L * a;
		}
		
		for (int x = 0; x < n-1; x++) {
			 int dest = (int)((1L * A * x + B) % n);
			 min[x] = Math.min(min[x], min[dest] + b);
		}
		
		long best = Long.MAX_VALUE;
		for (int x = 0; x < n-1; x++) {
			best = Math.min(best, min[x]);
		}
		return best;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, int p4, boolean hasAnswer, long p5) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3 + "," + p4);
		System.out.println("]");
		SRM767_Div2_L3_MahdiJumping obj;
		long answer;
		obj = new SRM767_Div2_L3_MahdiJumping();
		long startTime = System.currentTimeMillis();
		answer = obj.minDis(p0, p1, p2, p3, p4);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p5);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p5;
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		int p0;
		int p1;
		int p2;
		int p3;
		int p4;
		long p5;
		
		// ----- test 0 -----
		p0 = 7;
		p1 = 1;
		p2 = 1;
		p3 = 1;
		p4 = 5;
		p5 = 6L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 5;
		p1 = 2;
		p2 = 2;
		p3 = 1;
		p4 = 2;
		p5 = 3L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 5;
		p1 = 5;
		p2 = 5;
		p3 = 5;
		p4 = 5;
		p5 = 20L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
