package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;

public class TCO19_R1A_L3_EllysTicketPrices
{
	public double getPrice(int N, int[] C, int target)
	{
		//Find the highest value for which check() is ok
		int lo = 0, hi = 1_000_000_000, mid = 0;
		while (lo < hi)
		{
			mid = lo + (hi - lo) / 2;
			if (check(mid, N, C) < target * 100L )
				lo = mid + 1;
			else
				hi = mid;
		}
		
		return lo / 100.0;
	}
	
	private long check(long price, int n, int[] c)
	{
		long sum = price;
		for (int i = 0; i < n-1; i++)
		{
			price = (price * (100 + c[i]) + 50) / 100;
			sum += price;
		}
		long ave = ((sum * 100) / n + 50) / 100;
		return ave;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, int p2, boolean hasAnswer, double p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}" + "," + p2);
		System.out.println("]");
		TCO19_R1A_L3_EllysTicketPrices obj;
		double answer;
		obj = new TCO19_R1A_L3_EllysTicketPrices();
		long startTime = System.currentTimeMillis();
		answer = obj.getPrice(p0, p1, p2);
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
			res = Math.abs(p3 - answer) <= 1e-9 * Math.max(1.0, Math.abs(p3));
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
		int p2;
		double p3;
		
		// ----- test 0 -----
		p0 = 5;
		p1 = new int[]{-10,15,5,-20};
		p2 = 180;
		p3 = 184.01D;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 11;
		p1 = new int[]{5,16,17,-3,-10,20,20,14,2,0};
		p2 = 1337;
		p3 = 874.77D;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = new int[]{0};
		p2 = 42;
		p3 = 42.0D;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 20;
		p1 = new int[]{30,-26,87,47,-39,25,-67,62,-38,68,-84,5,28,-20,50,-61,10,63,-71};
		p2 = 392;
		p3 = 476.28D;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 50;
		p1 = new int[]{-60,61,17,86,56,27,9,41,-27,-36,57,-16,1,50,-55,-36,14,13,-93,14,18,25,62,-18,40,79,56,19,10,-55,-43,45,-43,-84,61,-64,41,-55,38,18,36,-43,79,33,87,19,-47,38,-56};
		p2 = 8887;
		p3 = 9451.93D;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 20;
		p1 = new int[]{-18, -15, -13, -12, -11, 0, 1, 2, 4, 8, 16, 32, 64, 99, 99, 99, 99, 99, 99};
		p2 = 1081;
		p3 = 120.79;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
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
