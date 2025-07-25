package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM806_Div2_L1_SudokuTypo
{
	public int fix(int[] digits)
	{
		for (int i = 0; i < 9; i++) {
			int[] a = new int[10];
			for (int j = 0; j < 9; j++) {
				a[digits[i*9+j]] = 1;
			}
			for (int j = 1; j <= 9; j++) {
				if (a[j] == 0) return j;
			}
		}
		return -1;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM806_Div2_L1_SudokuTypo obj;
		int answer;
		obj = new SRM806_Div2_L1_SudokuTypo();
		long startTime = System.currentTimeMillis();
		answer = obj.fix(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p1);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p1;
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
		
		// ----- test 0 -----
		p0 = new int[]{8,6,1,2,3,4,9,5,3,4,7,9,5,6,1,2,8,3,3,2,5,9,7,8,1,6,4,9,5,8,1,4,3,6,7,2,7,1,2,8,5,6,3,4,9,6,3,4,7,2,9,5,1,8,5,9,6,4,8,2,7,3,1,1,4,3,6,9,7,8,2,5,2,8,7,3,1,5,4,9,6};
		p1 = 7;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{8,6,1,2,3,4,9,5,7,4,7,9,5,6,1,2,8,3,3,2,5,9,7,8,1,6,4,9,5,8,1,4,3,6,7,2,7,1,2,8,1,6,3,4,9,6,3,4,7,2,9,5,1,8,5,9,6,4,8,2,7,3,1,1,4,3,6,9,7,8,2,5,2,8,7,3,1,5,4,9,6};
		p1 = 5;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{5,3,4,6,7,8,9,1,2,6,7,2,1,9,5,3,4,8,1,9,8,3,4,2,5,6,7,8,5,9,7,6,1,4,2,3,4,2,6,8,5,3,7,9,1,7,1,3,9,2,4,8,5,6,9,6,1,5,3,7,2,8,4,2,8,7,4,1,9,1,3,5,3,4,5,2,8,6,1,7,9};
		p1 = 6;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
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
