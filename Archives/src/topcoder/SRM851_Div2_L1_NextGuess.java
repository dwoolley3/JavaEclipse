package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;



public class SRM851_Div2_L1_NextGuess
{
	public int guess(int[] guesses, String answers)
	{
		int n = guesses.length;
		for (int i = -1_000_047; i <= 1_000_047; i++) {
			boolean ok = true;
			for (int j = 0; j < n && ok; j++) {
				if (answers.charAt(j) == '<') {
					if (i >= guesses[j]) ok = false;
				} else {
					if (i <= guesses[j]) ok = false;
				}
			}
			if (ok) return i;
		}
		return 0;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, String p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + "\"" + p1 + "\"");
		System.out.println("]");
		SRM851_Div2_L1_NextGuess obj;
		int answer;
		obj = new SRM851_Div2_L1_NextGuess();
		long startTime = System.currentTimeMillis();
		answer = obj.guess(p0, p1);
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
		String p1;
		int p2;
		
		// ----- test 0 -----
		p0 = new int[]{100};
		p1 = ">";
		p2 = 654321;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{98,100};
		p1 = "><";
		p2 = 99;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{0,100,50,75,62,56};
		p1 = "><><<>";
		p2 = 59;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{-23,-47,1234,-47,-123456,-47,-47};
		p1 = "<><>>>>";
		p2 = -33;
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
