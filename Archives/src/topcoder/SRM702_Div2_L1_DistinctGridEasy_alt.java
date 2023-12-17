package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM702_Div2_L1_DistinctGridEasy_alt
{
	public String checkGrid(int n, int k, int[] grid)
	{
		
		for (int i = 0; i < n; i++)
		{
			Set<Integer> hs = new HashSet<Integer>();
			for (int j = 0; j < n; j++)
				hs.add(grid[i*n+j]);
			if (hs.size() != k) return "Bad";
			
			hs = new HashSet<Integer>();
			for (int j = 0; j < n; j++)
				hs.add(grid[j*n+i]);
			if (hs.size() != k) return "Bad";
		}			
		return "Good";
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int[] p2, boolean hasAnswer, String p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p2[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM702_Div2_L1_DistinctGridEasy_alt obj;
		String answer;
		obj = new SRM702_Div2_L1_DistinctGridEasy_alt();
		long startTime = System.currentTimeMillis();
		answer = obj.checkGrid(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p3 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p3);
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
		int[] p2;
		String p3;
		
		// ----- test 0 -----
		p0 = 3;
		p1 = 3;
		p2 = new int[]{0,1,2,1,2,0,2,0,1};
		p3 = "Good";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = 3;
		p2 = new int[]{0,1,2,1,2,0,2,0,0};
		p3 = "Bad";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 5;
		p1 = 2;
		p2 = new int[]{0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0};
		p3 = "Good";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 5;
		p1 = 3;
		p2 = new int[]{2,2,0,0,1,0,1,2,2,0,0,2,1,0,0,1,0,0,0,2,0,0,2,1,0};
		p3 = "Good";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 7;
		p1 = 4;
		p2 = new int[]{3,2,1,0,3,2,1,3,2,1,3,2,1,2,2,0,3,1,1,0,3,1,3,0,2,0,3,0,0,3,1,2,3,2,1,1,1,1,2,1,0,3,3,1,2,0,3,2,3};
		p3 = "Bad";
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
