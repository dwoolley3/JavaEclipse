package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM662_Div2_L2_ExactTreeEasy
{
	public int[] getTree(int n, int m)
	{
		int[] a = new int[(n-1)*2];
		int last = n-m+1;
		for (int i = 0; i < last; i++)
		{
			a[i*2] = i;
			a[i*2+1] = i+1;
		}
		
		for (int i = 0; i < ((n-1)*2 - last * 2) / 2; i++)
		{
			a[(i+last)*2] = 1;
			a[(i+last)*2+1] = (last + 1) + i;
		}
		return a;		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, int[] p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		SRM662_Div2_L2_ExactTreeEasy obj;
		int[] answer;
		obj = new SRM662_Div2_L2_ExactTreeEasy();
		long startTime = System.currentTimeMillis();
		answer = obj.getTree(p0, p1);
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
		
		int p0;
		int p1;
		int[] p2;
		
		// ----- test 4 -----
		p0 = 10;
		p1 = 8;
		p2 = new int[]{0,1,1,2,2,3,1,4,1,5,1,6,1,7,1,8,1,9};
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		
		// ----- test 0 -----
		p0 = 4;
		p1 = 2;
		p2 = new int[]{0,1,1,2,2,3};
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 4;
		p1 = 3;
		p2 = new int[]{0,1,1,2,1,3};
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = 2;
		p2 = new int[]{0,1,1,2};
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 5;
		p1 = 3;
		p2 = new int[]{0,1,1,2,1,3,3,4};
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 10;
		p1 = 9;
		p2 = new int[]{0,1,1,2,1,3,1,4,1,5,1,6,1,7,1,8,1,9};
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
