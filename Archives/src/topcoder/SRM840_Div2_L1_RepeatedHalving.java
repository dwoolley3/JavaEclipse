package topcoder;

import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM840_Div2_L1_RepeatedHalving
{
	public int[] simulate(int[] bags, int steps)
	{
		int n = bags.length;
		Arrays.sort(bags);
		while (steps > 0 && bags[n-1] > 0) {
			bags[n-1] /= 2;
			Arrays.sort(bags);
			steps--;
		}
		return bags;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int p1, boolean hasAnswer, int[] p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + p1);
		System.out.println("]");
		SRM840_Div2_L1_RepeatedHalving obj;
		int[] answer;
		obj = new SRM840_Div2_L1_RepeatedHalving();
		long startTime = System.currentTimeMillis();
		answer = obj.simulate(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p2.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p2[i]);
			}
			System.out.println("}");
		}
		System.out.println("Your answer:");
		System.out.print("\t" + "{");
		for (int i = 0; answer.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(answer[i]);
		}
		System.out.println("}");
		if (hasAnswer) {
			if (answer.length != p2.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p2[i]) {
						res = false;
					}
				}
			}
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
		int[] p2;
		
		// ----- test 0 -----
		p0 = new int[]{1,2,3,21,5,4};
		p1 = 4;
		p2 = new int[]{1,2,2,2,3,4};
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,1,1,1,1};
		p1 = 5;
		p2 = new int[]{0,0,0,0,0};
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{0,0,0,0,0,0,0,0,0,0};
		p1 = 1000000000;
		p2 = new int[]{0,0,0,0,0,0,0,0,0,0};
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{123,4568,89123,45,678901234};
		p1 = 27;
		p2 = new int[]{45,123,1142,1294,1392};
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999};
		p1 = 2899;
		p2 = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3};
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{499999999,999999999,499999998,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999};
		p1 = 1;
		p2 = new int[]{499999998,499999999,499999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999,999999999};
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
