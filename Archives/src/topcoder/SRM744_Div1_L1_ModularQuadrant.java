package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM744_Div1_L1_ModularQuadrant
{
	public long sum(int r1, int r2, int c1, int c2)
	{		
		long sum = partSum(r2, c2);
		long sum1 = partSum(r2,c1-1);
		long sum2 = partSum(r1-1,c2);
		long sum3 = partSum(r1-1,c1-1);		
		return sum - sum1 - sum2 + sum3;
	}
	
	private long partSum(int r, int c) {
		//sum from 0,0, to r,c
		if (r < 0 || c < 0) return 0;
		long sum = 0;
		int max = Math.max(r, c);
		int min = Math.min(r, c);
		
		long x0 = (min + 3) / 3;
		long x1 = (min + 2) / 3;
		long x2 = (min + 1) / 3;
		long sum0 = x0 * 0;
		// 3 + 9 + 15 + 21 = 3*x1 + (0 + 6 + 12 + 18)
		long sum1 = (3*x1 + (0 + 6*(x1-1)) * x1 / 2);  
		
		// 10 + 22 + 34 = 10 * x2 + (0 + 12 + 24)
		long sum2 = (10 * x2 + (0 + 12*(x2-1)) * x2 / 2);
		
		sum = sum0 + sum1 + sum2;
		
		if (max > min) {
			long dif = max - min;
			long sum4 = (dif / 3) * (1+2);
			for (int i = 0; i < (dif % 3); i++) {
				sum4 += ((min + 1 + i) % 3);
			}
			sum4 *= (min + 1);
			sum += sum4;
		}
		
		return sum;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, long p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		SRM744_Div1_L1_ModularQuadrant obj;
		long answer;
		obj = new SRM744_Div1_L1_ModularQuadrant();
		long startTime = System.currentTimeMillis();
		answer = obj.sum(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p4);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p4;
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
		long p4;
		
		// ----- test 0 -----
		p0 = 0;
		p1 = 2;
		p2 = 1;
		p3 = 4;
		p4 = 13L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 2;
		p1 = 2;
		p2 = 0;
		p3 = 7;
		p4 = 10L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 4;
		p1 = 8;
		p2 = 0;
		p3 = 5;
		p4 = 37L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
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
