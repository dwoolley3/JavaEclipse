package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM695_Div2_L1_BearNSWE
{
	public double totalDistance(int[] a, String dir)
	{
		int n = a.length, ns = 0, ew = 0, tot = 0;
		for (int i = 0; i < n; i++)
		{
			char c = dir.charAt(i);
			if (c == 'N') ns += a[i];
			if (c == 'S') ns -= a[i];
			if (c == 'E') ew += a[i];
			if (c == 'W') ew -= a[i];
			tot += a[i];
		}
		
		double d = Math.sqrt(ns * ns + ew * ew);
		return d + tot;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, String p1, boolean hasAnswer, double p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + "\"" + p1 + "\"");
		System.out.println("]");
		SRM695_Div2_L1_BearNSWE obj;
		double answer;
		obj = new SRM695_Div2_L1_BearNSWE();
		long startTime = System.currentTimeMillis();
		answer = obj.totalDistance(p0, p1);
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
			res = Math.abs(p2 - answer) <= 1e-9 * Math.max(1.0, Math.abs(p2));
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
		double p2;
		
		// ----- test 0 -----
		p0 = new int[]{1,3,3};
		p1 = "NES";
		p2 = 10.60555127546399D;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{10,10,10,10};
		p1 = "NWSE";
		p2 = 40.0D;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{10,10,10,15,8,20,5};
		p1 = "NEWEWWE";
		p2 = 90.8062484748657D;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{42};
		p1 = "E";
		p2 = 84.0D;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{10,40,40};
		p1 = "NSE";
		p2 = 140.0D;
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