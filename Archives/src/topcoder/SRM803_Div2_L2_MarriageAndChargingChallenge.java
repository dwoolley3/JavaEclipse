package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM803_Div2_L2_MarriageAndChargingChallenge
{
	public int solve(int forumLength, int[] relative, int[] greeting)
	{
		int n = relative.length;
		long charge = 0;
		int ind = 0, cnt = 0;
		int curpos, nextpos;
		for (int i = 0; i < n; i++) {
			boolean ok = true;
			charge = 0;
			for (int j = 0; j < n; j++) {				
				ind = (i + j) % n;
				curpos = relative[ind];
				if (i + j >= n) {
					curpos += forumLength;
				}
				charge += greeting[ind];
				ind = (i + j + 1) % n;
				nextpos = relative[ind];
				if (i + j + 1 >= n) {
					nextpos += forumLength;
				}
				charge -= (nextpos - curpos);
				if (charge < 0) {
					ok = false;
					break;
				}
			}
			if (ok) cnt++;
		}
		return cnt;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, int[] p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p2[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM803_Div2_L2_MarriageAndChargingChallenge obj;
		int answer;
		obj = new SRM803_Div2_L2_MarriageAndChargingChallenge();
		long startTime = System.currentTimeMillis();
		answer = obj.solve(p0, p1, p2);
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
		int[] p1;
		int[] p2;
		int p3;
		
		// ----- test 0 -----
		p0 = 1000;
		p1 = new int[]{100,300,500,700,900};
		p2 = new int[]{200,200,200,200,200};
		p3 = 5;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 1000;
		p1 = new int[]{0,42};
		p2 = new int[]{1234567,47};
		p3 = 1;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1000000000;
		p1 = new int[]{123456,7890123,456789012};
		p2 = new int[]{222222222,333333333,444444444};
		p3 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1;
		p1 = new int[]{0};
		p2 = new int[]{1};
		p3 = 1;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1000000;
		p1 = new int[]{42,47};
		p2 = new int[]{6,999994};
		p3 = 1;
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