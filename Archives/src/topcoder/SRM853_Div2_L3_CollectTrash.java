package topcoder;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class SRM853_Div2_L3_CollectTrash
{
	public int optimize(int P, int T, int M, int C, int[] Lprefix, int seed)
	{
		long state = seed;
		int PL = Lprefix.length;
		int MOD = (int)Math.pow(2, 31);
		int[] L = new int[T];
		for (int i = 0; i < PL; i++) 
			L[i] = Lprefix[i];
		
		for (int i = PL; i <= T-1; i++) {
			if (C == 1 && i > 0) {
				state = (int)((1L* state * 1103515245 + 12345) % MOD);
				int old = L[(int)(state % i)];
				state = ((1L * state * 1103515245 + 12345) % MOD);
				int spread = (int)((state % 21) - 10);
				L[i] = Math.max(0,  Math.min(M-1,  old+spread));
			} else {
				state = (1L* state * 1103515245 + 12345) % MOD;
				L[i] = (int)(state % M);
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.print(L[i] + " ");
		} 
		System.out.println();
		return 0;
	}

	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, int[] p4, int p5, boolean hasAnswer, int p6) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3 + "," + "{");
		for (int i = 0; p4.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p4[i]);
		}
		System.out.print("}" + "," + p5);
		System.out.println("]");
		SRM853_Div2_L3_CollectTrash obj;
		int answer;
		obj = new SRM853_Div2_L3_CollectTrash();
		long startTime = System.currentTimeMillis();
		answer = obj.optimize(p0, p1, p2, p3, p4, p5);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p6);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p6;
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
		int[] p4;
		int p5;
		int p6;
		
		// ----- test 0 -----
		p0 = 1;
		p1 = 4;
		p2 = 1000000000;
		p3 = 0;
		p4 = new int[]{7,4,10,4};
		p5 = 1000000000;
		p6 = 14;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, p5, true, p6) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 47;
		p1 = 47003;
		p2 = 1;
		p3 = 0;
		p4 = new int[]{};
		p5 = 47;
		p6 = 1001;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, p5, true, p6) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = 5;
		p2 = 100000;
		p3 = 0;
		p4 = new int[]{1,2,3,4,5};
		p5 = 42;
		p6 = 7;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, p5, true, p6) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 3;
		p1 = 12;
		p2 = 7654321;
		p3 = 0;
		p4 = new int[]{1000,2000,3000};
		p5 = 1234567;
		p6 = 5937965;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, p4, p5, true, p6) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 3;
		p1 = 12;
		p2 = 7654321;
		p3 = 1;
		p4 = new int[]{1000,2000,3000};
		p5 = 1234567;
		p6 = 3015;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, p4, p5, true, p6) && all_right;
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