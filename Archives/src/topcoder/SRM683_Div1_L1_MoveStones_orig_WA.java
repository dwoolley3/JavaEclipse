package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM683_Div1_L1_MoveStones_orig_WA
{
	public long get(int[] a, int[] b)
	{
		int n = a.length;
		long suma = 0, sumb = 0, ans = 0;
		for (int i = 0; i < n; i++)
		{
			suma += a[i];
			sumb += b[i];
		}
		if (suma != sumb) return -1;
		
		for (int i = 0; i < n; i++)
			for (int j = 1; j < n; j++)
				if (b[i] > a[i])
				{	
					int i1 = i+j, i2 = i-j;
					if (i1 >= n) i1 -= n;
					if (i2 < 0) i2 += n;
					int dif = a[i1] - b[i1], x;
					if (dif > 0)
					{
						x = Math.min(b[i] - a[i], dif);
						a[i] += x;
						a[i1] -= x;
						ans += 1L * x * j;
					}
					dif = a[i2] - b[i2];
					if (dif > 0)
					{
						x = Math.min(b[i] - a[i], dif);
						a[i] += x;
						a[i2] -= x;
						ans += 1L * x * j;
					}
				}
				else break;
		
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, long p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM683_Div1_L1_MoveStones_orig_WA obj;
		long answer;
		obj = new SRM683_Div1_L1_MoveStones_orig_WA();
		long startTime = System.currentTimeMillis();
		answer = obj.get(p0, p1);
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
		int[] p1;
		long p2;
		
		// ----- test 0a ----- ***
		p0 = new int[]{2,0,2,0,0};
		p1 = new int[]{0,2,0,2,0};
		p2 = 4L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0b ----- **
		p0 = new int[]{2,0,2,0,0};
		p1 = new int[]{0,2,0,0,2};
		p2 = 4L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
				
		// ----- test 1b -----
		p0 = new int[]{2,0,0,0,0,0,0,2,0};
		p1 = new int[]{0,0,0,2,0,0,0,0,2};
		p2 = 8L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1c ----- ***
		p0 = new int[]{2,0,0,0,0,0,2,0,0};
		p1 = new int[]{0,0,0,2,0,0,0,2,0};
		p2 = 8L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1d ----- **
		p0 = new int[]{2,0,0,0,0,0,2,0,0};
		p1 = new int[]{0,0,0,2,0,0,0,0,2};
		p2 = 8L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{5,0,0,0,0,1,1};
		p1 = new int[]{0,0,4,0,0,2,1};
		p2 = 10L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{3,0,0,1,0};
		p1 = new int[]{0,2,0,0,2};
		p2 = 4L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{3,1,2};
		p1 = new int[]{1,2,3};
		p2 = 2L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{12};
		p1 = new int[]{12};
		p2 = 0L;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{10};
		p1 = new int[]{9};
		p2 = -1L;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{0,5};
		p1 = new int[]{5,0};
		p2 = 5L;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{1,2,3};
		p1 = new int[]{3,1,2};
		p2 = 2L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{1,0,1,1,0};
		p1 = new int[]{0,3,0,0,0};
		p2 = 4L;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new int[]{1000000000,0,0,0,0,0};
		p1 = new int[]{0,0,0,1000000000,0,0};
		p2 = 3000000000L;
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
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
