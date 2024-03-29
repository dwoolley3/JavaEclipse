package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM655_Div2_L2_FoldingPaper2
{
	public int solve(int W, int H, int A)
	{
		ArrayList<Integer> f1 = new ArrayList<Integer>();
		ArrayList<Integer> f2 = new ArrayList<Integer>();
		for (int i = 1; i <= A; i++)
			if (A % i == 0)
			{
				f1.add(i);
				f2.add(A / i);
			}
		
		int n = f1.size();
		int minCnt = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++)
		{
			int w = W, h = H, cnt = 0;
			int f1n = f1.get(i), f2n = f2.get(i);
			while (w > f1n)
			{
				w = Math.max(f1n,  (w+1)/2);
				cnt++;
			}
			while (h > f2n)
			{
				h = Math.max(f2n,  (h+1)/2);
				cnt++;
			}
			if (w == f1n && h == f2n && w * h == A)
				minCnt = Math.min(minCnt,  cnt);
		}
		
		if (minCnt == Integer.MAX_VALUE)
			return -1;
		return minCnt;		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2);
		System.out.println("]");
		SRM655_Div2_L2_FoldingPaper2 obj;
		int answer;
		obj = new SRM655_Div2_L2_FoldingPaper2();
		long startTime = System.currentTimeMillis();
		answer = obj.solve(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p3);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p3;
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
		
		// ----- test 4 -----
		p0 = 1000000000;
		p1 = 1000000000;
		p2 = 100000;
		p3 = 44;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 100000;
		p1 = 1;
		p2 = 100000;
		p3 = 0;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 3;
		p1 = 5;
		p2 = 12;
		p3 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 129;
		p1 = 127;
		p2 = 72;
		p3 = 8;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 5;
		p1 = 3;
		p2 = 12;
		p3 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 2;
		p1 = 2;
		p2 = 3;
		p3 = -1;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 4;
		p1 = 4;
		p2 = 1;
		p3 = 4;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 127;
		p1 = 129;
		p2 = 72;
		p3 = 8;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1;
		p1 = 100000;
		p2 = 100000;
		p3 = 0;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 1;
		p1 = 1;
		p2 = 2;
		p3 = -1;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, true, p3) && all_right;
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
