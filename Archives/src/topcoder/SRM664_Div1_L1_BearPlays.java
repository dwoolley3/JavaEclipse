package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;

//Another person's solution

public class SRM664_Div1_L1_BearPlays
{
	public static long mod;
	
	public int pileSize(int A, int B, int K)
	{
		mod = A + B;
		long val = pow(2,K);
		val *= A;
		val %= mod;
		
		return (int)Math.min(val, mod - val);
	}
	
	public long pow(long a, long e)
	{
		if (e == 0) return 1;
		long ret = pow(a, e/2);
		ret = (ret * ret) % mod;
		if (e % 2 == 1)
		{
			ret *= a;
			ret %= mod;
		}
		
		return ret;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2);
		System.out.println("]");
		SRM664_Div1_L1_BearPlays obj;
		int answer;
		obj = new SRM664_Div1_L1_BearPlays();
		long startTime = System.currentTimeMillis();
		answer = obj.pileSize(p0, p1, p2);
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
		
		int p0;
		int p1;
		int p2;
		int p3;
		
		// ----- test 4 -----
		p0 = 900000000;
		p1 = 350000000;
		p2 = 2000000000;
		p3 = 350000000;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 100000;
		p1 = 99;
		p2 = 2000000000;
		p3 = 32959;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1000000000;
		p1 = 999999;
		p2 = 2000000000;
		p3 = 329304471;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 2;
		p1 = 8;
		p2 = 1;
		p3 = 4;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 2;
		p1 = 8;
		p2 = 2;
		p3 = 2;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 2;
		p1 = 8;
		p2 = 3;
		p3 = 4;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 2;
		p1 = 8;
		p2 = 2000000000;
		p3 = 2;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = 6;
		p2 = 2000000000;
		p3 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		
		// ----- test 0 -----
		p0 = 4;
		p1 = 7;
		p2 = 2;
		p3 = 5;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 5;
		p1 = 5;
		p2 = 3;
		p3 = 0;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = 6;
		p2 = 1;
		p3 = 4;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 2;
		p1 = 8;
		p2 = 2000000000;
		p3 = 2;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		
		// ----- test 4 -----
		p0 = 900000000;
		p1 = 350000000;
		p2 = 3;
		p3 = 300000000;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 900000000;
		p1 = 350000000;
		p2 = 2000000000;
		p3 = 350000000;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
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
