package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM807_Div2_L3_DistancesBetweenNumbers
{
	public long count(int N, int[] Aprefix)
	{
		int[] A = new int[N];
		int L = Aprefix.length;
		for (int i=0; i<L; ++i) A[i] = Aprefix[i];
		for (int i=L; i<N; ++i) A[i] = (int)((A[i-1] * 1103515245L + 12345L) % (1L << 31));
		
		long sum = 0;
		for (int p = 0; p < 32; p++) {			
			int[] d = new int[10];
			for (int i = 0; i < N; i++) {
				//System.out.println(A[i]);
				d[A[i] % 10]++;
				A[i] /= 10;				
			}
			for (int i = 0; i < 10; i++) {
				long tot = N;
				if (d[i] != N && d[i] != 0) {
					sum = sum + 1L* d[i] * (tot- d[i]);
					tot -= d[i];
				}
			}
		}
		return sum / 2;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, boolean hasAnswer, long p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM807_Div2_L3_DistancesBetweenNumbers obj;
		long answer;
		obj = new SRM807_Div2_L3_DistancesBetweenNumbers();
		long startTime = System.currentTimeMillis();
		answer = obj.count(p0, p1);
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
		int[] p1;
		long p2;
		
		// ----- test 0 -----
		p0 = 4;
		p1 = new int[]{47,47,47,47};
		p2 = 0L;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 4;
		p1 = new int[]{47,47,42,47};
		p2 = 3L;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 4;
		p1 = new int[]{1,10,100,1000};
		p2 = 12L;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 10;
		p1 = new int[]{1234567,1234890};
		p2 = 389L;
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
