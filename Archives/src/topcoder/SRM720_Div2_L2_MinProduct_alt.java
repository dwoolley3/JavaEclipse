package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM720_Div2_L2_MinProduct_alt
{
	public long findMin(int[] amount, int blank1, int blank2)
	{
		int b1 = Math.min(blank1, blank2);
		int b2 = Math.max(blank1, blank2);
		int z = Math.min(amount[0], b1);
		b1 -= z;
		amount[0] -= z;
		
		int a = 0, b = 0, ind = 0, acnt = 0;
		for (int i = 0; i < b1 + b2; i++)
		{
			while (amount[ind] == 0) ind++;
			if (i%2 == 0 && acnt < b1) {
				a = a * 10 + ind;
				acnt++;
			}
			else
				b = b * 10 + ind;
			
			amount[ind]--;
		}
		return 1L * a * b;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int p1, int p2, boolean hasAnswer, long p3) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + p1 + "," + p2);
		System.out.println("]");
		SRM720_Div2_L2_MinProduct_alt obj;
		long answer;
		obj = new SRM720_Div2_L2_MinProduct_alt();
		long startTime = System.currentTimeMillis();
		answer = obj.findMin(p0, p1, p2);
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
		
		int[] p0;
		int p1;
		int p2;
		long p3;
		
		// ----- test 0 -----
		p0 = new int[]{0,1,1,2,1,1,0,0,0,0};
		p1 = 2;
		p2 = 3;
		p3 = 3042L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,1,1,1,1,1,1,1,1,1};
		p1 = 1;
		p2 = 8;
		p3 = 0L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{1,3,0,0,0,0,0,0,0,0};
		p1 = 2;
		p2 = 2;
		p3 = 11L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{0,20,20,20,20,20,20,20,20,20};
		p1 = 9;
		p2 = 9;
		p3 = 12345678987654321L;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{1,0,0,0,1,0,0,5,3,2};
		p1 = 9;
		p2 = 3;
		p3 = 36556078253L;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new int[]{0,0,0,0,0,0,0,0,0,18};
		p1 = 9;
		p2 = 8;
		p3 = 99999998900000001L;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, true, p3) && all_right;
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
