package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM813_Div2_L1_LightbulbRow
{
	public String solve(String bulbStates, int startIndex, int goalCount)
	{
		int n = bulbStates.length();
		String ans = "";

		int onState = 0;
		for (int i = 0; i < n; i++) {
			if (bulbStates.charAt(i) == 'O') onState++; 
		}
		
		if (goalCount != onState) {
			for (int i = 0; i < startIndex; i++) {
				ans+="<";
			}
			for (int i = 0; i < n && goalCount != onState; i++) {
				char ch = bulbStates.charAt(i);
				if (onState > goalCount) {
					if (ch == 'O') {
						onState--;
						ans += "S";
					}
				} else if (onState < goalCount) {
					if (ch == 'X') {
						onState++;
						ans += "S";
					}
				}
				if (i < n-1 && goalCount != onState) {
					ans += ">";
				}
			}
		}
		
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, int p1, int p2, boolean hasAnswer, String p3) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + p1 + "," + p2);
		System.out.println("]");
		SRM813_Div2_L1_LightbulbRow obj;
		String answer;
		obj = new SRM813_Div2_L1_LightbulbRow();
		long startTime = System.currentTimeMillis();
		answer = obj.solve(p0, p1, p2);
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
		
		String p0;
		int p1;
		int p2;
		String p3;
		
		// ----- test 0 -----
		p0 = "XXXXXXXXXX";
		p1 = 4;
		p2 = 3;
		p3 = "S<S>>>S";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------

		
		// ----- test 1 -----
		p0 = "XXXXOOOXXX";
		p1 = 0;
		p2 = 3;
		p3 = "SSSS";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "XXXXOOOXXX";
		p1 = 0;
		p2 = 2;
		p3 = ">>>>S";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
				
		// ----- test 0 -----
		p0 = "XXXXX";
		p1 = 4;
		p2 = 0;
		p3 = "";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
				
		// ----- test 0 -----
		p0 = "XXXXX";
		p1 = 0;
		p2 = 4;
		p3 = "<<<<S>S>S>S";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = "XXXXX";
		p1 = 1;
		p2 = 4;
		p3 = "<S>S>S>S";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
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
