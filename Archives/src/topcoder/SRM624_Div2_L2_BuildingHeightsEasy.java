package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM624_Div2_L2_BuildingHeightsEasy
{
	public int minimum(int M, int[] h)
	{
		Arrays.sort(h);
		int n = h.length;
		
		int min = Integer.MAX_VALUE;
		for (int i = M-1; i < n; i++)
		{		
			int cnt = 0;		
			for (int j = i; j > i-M; j--)
				cnt += h[i] - h[j];
			min = Math.min(min,  cnt);
		}
		return min;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM624_Div2_L2_BuildingHeightsEasy obj;
		int answer;
		obj = new SRM624_Div2_L2_BuildingHeightsEasy();
		long startTime = System.currentTimeMillis();
		answer = obj.minimum(p0, p1);
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
		
		int p0;
		int[] p1;
		int p2;
		
		// ----- test 0 -----
		p0 = 2;
		p1 = new int[]{1,2,1,4,3};
		p2 = 0;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = new int[]{1,3,5,2,1};
		p2 = 2;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1;
		p1 = new int[]{43,19,15};
		p2 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 3;
		p1 = new int[]{19,23,9,12};
		p2 = 15;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 12;
		p1 = new int[]{25,18,38,1,42,41,14,16,19,46,42,39,38,31,43,37,26,41,33,37,45,27,19,24,33,11,22,20,36,4,4};
		p2 = 47;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
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
