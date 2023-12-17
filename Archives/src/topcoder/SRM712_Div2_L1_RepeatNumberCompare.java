package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM712_Div2_L1_RepeatNumberCompare
{
	public String compare(int x1, int k1, int x2, int k2)
	{
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < k1; i++)
			s1 += x1;
		for (int i = 0; i < k2; i++)
			s2 += x2;
		
		if (s1.length() < s2.length())
			return "Less";
		else if (s1.length() > s2.length())
			return "Greater";
		
		if (s1.compareTo(s2) < 0)
			return "Less";
		else if (s1.compareTo(s2) > 0)
			return "Greater";
		
//		for (int i = 0; i < s1.length(); i++)
//			if (s1.charAt(i) < s2.charAt(i))
//				return "Less";
//			else if (s1.charAt(i) > s2.charAt(i))
//				return "Greater";
		return "Equal";
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, String p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		SRM712_Div2_L1_RepeatNumberCompare obj;
		String answer;
		obj = new SRM712_Div2_L1_RepeatNumberCompare();
		long startTime = System.currentTimeMillis();
		answer = obj.compare(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p4 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p4);
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
		String p4;
		
		// ----- test 0 -----
		p0 = 1234;
		p1 = 3;
		p2 = 70;
		p3 = 4;
		p4 = "Greater";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 1010;
		p1 = 3;
		p2 = 101010;
		p3 = 2;
		p4 = "Equal";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1234;
		p1 = 10;
		p2 = 456;
		p3 = 20;
		p4 = "Less";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 5;
		p1 = 9;
		p2 = 555555555;
		p3 = 1;
		p4 = "Equal";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 5;
		p1 = 9;
		p2 = 555555554;
		p3 = 1;
		p4 = "Greater";
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 5;
		p1 = 9;
		p2 = 555555556;
		p3 = 1;
		p4 = "Less";
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 1000000000;
		p1 = 50;
		p2 = 1000000000;
		p3 = 50;
		p4 = "Equal";
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, p3, true, p4) && all_right;
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
