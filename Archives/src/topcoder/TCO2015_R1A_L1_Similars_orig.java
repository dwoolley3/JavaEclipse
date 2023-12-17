package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class TCO2015_R1A_L1_Similars_orig
{
	public int maxsim(int L, int R)
	{
		int max = 0;
		L = Math.max(L, R - 3000);
		for (int i = L; i < R; i++)
			for (int j = i+1; j <= R; j++)
			{
				int d = common(i,j);			
				max = Math.max(max, d);
			}
		return max;
	}
	
	private int common(int a, int b)
	{
		boolean[] da = new boolean[10];
		boolean[] db = new boolean[10];
		while (a > 0)
		{
			int x = a % 10;
			da[x] = true;
			a /= 10;
		}
		while (b > 0)
		{
			int x = b % 10;
			db[x] = true;
			b /= 10;
		}
		int cnt = 0;
		for (int i = 0; i <= 9; i++)
			if (da[i] && db[i])
				cnt++;
		return cnt;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		TCO2015_R1A_L1_Similars_orig obj;
		int answer;
		obj = new TCO2015_R1A_L1_Similars_orig();
		long startTime = System.currentTimeMillis();
		answer = obj.maxsim(p0, p1);
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
		p0 = 1;
		p1 = 96000;
		p2 = 5;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 1;
		p1 = 5000;
		p2 = 4;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 95000;
		p1 = 100000;
		p2 = 5;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		
		// ----- test 0 -----
		p0 = 1;
		p1 = 10;
		p2 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 1;
		p1 = 99;
		p2 = 2;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 99;
		p1 = 100;
		p2 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1000;
		p1 = 1010;
		p2 = 2;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 444;
		p1 = 454;
		p2 = 2;
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
