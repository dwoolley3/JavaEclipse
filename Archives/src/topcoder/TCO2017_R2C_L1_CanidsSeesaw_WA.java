package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class TCO2017_R2C_L1_CanidsSeesaw_WA
{
	public int[] construct(int[] wolf, int[] fox, int k)
	{
		int n = wolf.length;
		int[] p = new int[n];
		boolean ok = true;
		int[] wsum = new int[n];
		wsum[0] = wolf[0];
		for (int i = 1; i < n; i++)
		{
			wsum[i] = wsum[i-1] + wolf[i];
		}
		
		int[] find = new int[n];
		for (int i = 0; i < n; i++) find[i] = i;
		
		for (int i = 0; i < n; i++)
			for (int j = i+1; j < n; j++)
				if (fox[i] > fox[j])
				{
					int t = fox[i]; fox[i] = fox[j]; fox[j] = t;
					t = find[i]; find[i] = find[j]; find[j] = t;
				}
		
		int flose = n - k;
		int sumfoxes = 0;
		for (int i = 0; i < flose; i++)
		{
			p[i] = find[i];
			sumfoxes += fox[i];
			if (sumfoxes >= wsum[i]) ok = false;
		}
		
		for (int i = flose; i < n; i++)
		{
			p[i] = find[n-1 - (i-flose)];
			sumfoxes += fox[n-1 - (i-flose)];
			if (sumfoxes <= wsum[i]) ok = false;
		}
		
		
		if (ok) 
			return p;
		return new int[] {};		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, int p2, boolean hasAnswer, int[] p3) {
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
		System.out.print("}" + "," + p2);
		System.out.println("]");
		TCO2017_R2C_L1_CanidsSeesaw_WA obj;
		int[] answer;
		obj = new TCO2017_R2C_L1_CanidsSeesaw_WA();
		long startTime = System.currentTimeMillis();
		answer = obj.construct(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p3.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p3[i]);
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
			if (answer.length != p3.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p3[i]) {
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
		int[] p1;
		int p2;
		int[] p3;
		
		// ----- test 0 -----
		p0 = new int[]{3,1};
		p1 = new int[]{4,2};
		p2 = 1;
		p3 = new int[]{1,0};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,3};
		p1 = new int[]{4,2};
		p2 = 1;
		p3 = new int[]{};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{10,10,10,10,10,10,10,10,10,10};
		p1 = new int[]{1,100,1,100,1,100,1,100,1,100};
		p2 = 7;
		p3 = new int[]{0,2,4,1,6,3,5,7,9,8};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{10,10,10,10,10,10,10,10,10,10};
		p1 = new int[]{1,100,1,100,1,100,1,100,1,100};
		p2 = 4;
		p3 = new int[]{};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{2};
		p1 = new int[]{1};
		p2 = 0;
		p3 = new int[]{0};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		
		// ----- test 2 -----
		p0 = new int[]{10,10,10,10,10,10,10,10,10,10};
		p1 = new int[]{1,100,1,100,1,100,1,100,1,100};
		p2 = 5;
		p3 = new int[]{0,2,4,6,8,9,1,7,3,5};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{10,10,10,10,10,10,10,10,10,10};
		p1 = new int[]{1,100,1,100,1,100,1,100,1,100};
		p2 = 0;
		p3 = new int[]{0,2,4,6,8,9,1,7,3,5};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{2};
		p1 = new int[]{1};
		p2 = 1;
		p3 = new int[]{};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{10,10,10,10,10,10,10,10,10};
		p1 = new int[]{1,1,1,1,1,1,1,1,21};
		p2 = 1;
		p3 = new int[]{0,8,4,6,2,7,3,5};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!