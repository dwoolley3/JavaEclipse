package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM844_Div2_L1_Padding
{
	public int volume(int N, int[] X, int[] Y, int[] Z, int P)
	{
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int x = X[i] - P*2;
			int y = Y[i] - P*2;
			int z = Z[i] - P*2;
			if (x > 0 && y > 0 && z > 0) {
				sum += (x*y*z);
			}
		}
		return sum;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, int[] p2, int[] p3, int p4, boolean hasAnswer, int p5) {
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
		System.out.print("}" + "," + "{");
		for (int i = 0; p3.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p3[i]);
		}
		System.out.print("}" + "," + p4);
		System.out.println("]");
		SRM844_Div2_L1_Padding obj;
		int answer;
		obj = new SRM844_Div2_L1_Padding();
		long startTime = System.currentTimeMillis();
		answer = obj.volume(p0, p1, p2, p3, p4);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p5);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p5;
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
		int[] p3;
		int p4;
		int p5;
		
		// ----- test 0 -----
		p0 = 1;
		p1 = new int[]{10};
		p2 = new int[]{20};
		p3 = new int[]{30};
		p4 = 1;
		p5 = 4032;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = new int[]{10,20,30};
		p2 = new int[]{20,10,10};
		p3 = new int[]{30,30,20};
		p4 = 1;
		p5 = 12096;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = new int[]{19,20,21};
		p2 = new int[]{30,30,30};
		p3 = new int[]{30,30,30};
		p4 = 10;
		p5 = 100;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
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
