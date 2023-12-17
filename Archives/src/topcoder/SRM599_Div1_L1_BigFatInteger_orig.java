package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM599_Div1_L1_BigFatInteger_orig
{
	public int minOperations(int A, int B)
	{
		//Did not work
		int a = A;
		int[] p = new int[1_000_001];
		for (int i = 2; i <= a; i++)
		{
			if (a % i == 0)
			{
				p[i]++;
				a /= i;		
				i--;
			}
		}
		
		int pnum = 0, pow = 0, maxn = 0;
		for (int i = 0; i < 1_000_001; i++)
			if (p[i]>0)
			{
				pnum++;
				System.out.println(i + " " + p[i]);
				int n = 0;
				pow = p[i]*B;
				while (pow > 1)
				{
					if (pow % 2 == 1) n++;
					pow /= 2;
					n++;
				}
				if (n > maxn) maxn = n;
			}
		
		int ret = pnum + maxn;
		return ret;	
		
	}

	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		SRM599_Div1_L1_BigFatInteger_orig obj;
		int answer;
		obj = new SRM599_Div1_L1_BigFatInteger_orig();
		long startTime = System.currentTimeMillis();
		answer = obj.minOperations(p0, p1);
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
		
		int p0;
		int p1;
		int p2;
		
		// ----- test 0 -----
		p0 = 3240;
		p1 = 5;
		p2 = 9;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 1000000;
		p1 = 1;
		p2 = 5;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 6;
		p1 = 1;
		p2 = 2;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 162;
		p1 = 1;
		p2 = 4;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 999983;
		p1 = 9;
		p2 = 5;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 360;
		p1 = 8;
		p2 = 8;
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
