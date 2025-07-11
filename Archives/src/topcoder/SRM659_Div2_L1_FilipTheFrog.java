package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM659_Div2_L1_FilipTheFrog
{
	public int countReachableIslands(int[] p, int L)
	{
		int st = p[0];
		Arrays.sort(p);
		int ind = 0;
		int n = p.length;
		for (ind = 0; ind < n; ind++)
			if (st == p[ind]) break;
		
		int cnt = 0, pos = st;
		for (int i = ind; i < n; i++)
			if (pos + L >= p[i])
			{
				cnt++;
				pos = p[i];
			}
		
		pos = st;
		for (int i = ind-1; i >= 0; i--)
			if (pos - L <= p[i])
			{
				cnt++;
				pos = p[i];
			}

		return cnt;		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + p1);
		System.out.println("]");
		SRM659_Div2_L1_FilipTheFrog obj;
		int answer;
		obj = new SRM659_Div2_L1_FilipTheFrog();
		long startTime = System.currentTimeMillis();
		answer = obj.countReachableIslands(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p2);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p2;
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
		
		// ----- test 2 -----
		p0 = new int[]{17,10,21,14,6,1,2,3,26};
		p1 = 4;
		p2 = 8;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{4,7,1,3,5};
		p1 = 1;
		p2 = 3;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{100,101,103,105,107};
		p1 = 2;
		p2 = 5;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{17,10,22,14,6,1,2,3};
		p1 = 4;
		p2 = 7;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{0};
		p1 = 1000;
		p2 = 1;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
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
