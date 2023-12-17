package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM841_Div2_L1_DividingCandy
{
	public long divide(long C, long L, long D)
	{
		int max;
		if (L == 0) {
			max = (int)Math.min(C / D, 100_000L);
			if (max <= 0) return -1;
			return C - D * max;
		} else if (D == 0) {
			max = (int)Math.min(C / L, 100_000L);
			if (max <= 0) return -1;
			return C - L * max;
		}
		long minr = C;
		max = (int)Math.min(C / L, 100_000L);
		if (max <= 0) return -1;
		int j;
		for (int i = 2; i <= max; i++) {
			long rem = C - L * i;
			j = (int)Math.min(rem / D, 100_000L);
			j = Math.min(j, i-1);
			rem = rem - D * j;
			if (j > 0) {
				minr = Math.min(minr, rem);
			}			
		}
		if (minr == C) return -1;
		return minr;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, long p0, long p1, long p2, boolean hasAnswer, long p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2);
		System.out.println("]");
		SRM841_Div2_L1_DividingCandy obj;
		long answer;
		obj = new SRM841_Div2_L1_DividingCandy();
		long startTime = System.currentTimeMillis();
		answer = obj.divide(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p3);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p3;
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
		
		long p0;
		long p1;
		long p2;
		long p3;
		
		// ----- test 6 -----
		p0 = 6643732625L;
		p1 = 232351988L;
		p2 = 7815141L;
		p3 = 5019564L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 76123533L;
		p1 = 8736258L;
		p2 = 71002L;
		p3 = 5736455L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 80L;
		p1 = 10L;
		p2 = 10L;
		p3 = 0L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 27L;
		p1 = 20L;
		p2 = 10L;
		p3 = -1L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1234L;
		p1 = 15L;
		p2 = 55L;
		p3 = 4L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1L;
		p1 = 1L;
		p2 = 0L;
		p3 = 0L;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 9876543210L;
		p1 = 0L;
		p2 = 2L;
		p3 = 9876343210L;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 1234567L;
		p1 = 2323L;
		p2 = 4747L;
		p3 = 44L;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 200001L;
		p1 = 1L;
		p2 = 1L;
		p3 = 2L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 18L;
		p1 = 9L;
		p2 = 1L;
		p3 = -1L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 6643732625L;
		p1 = 232351988L;
		p2 = 7815141L;
		p3 = 5019564L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 76123533L;
		p1 = 8736258L;
		p2 = 71002L;
		p3 = 5736455L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, true, p3) && all_right;
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
