package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM713_Div1_L1_PowerEquation_orig
{
	public int count(int n)
	{
		n= 7;
		
		int MOD = (int)1e9 + 7;
		long ans = 1L * n * n; //for 1
		ans = ans % MOD;
		int sq = (int)Math.sqrt(n);
		if ((sq-1)*(sq-1) == n)
			sq--;
		else if  ((sq+1)*(sq+1) == n)
			sq++;
		
		ans += (n - sq) * n;
		ans = ans % MOD;
		
		for (long i = 2; i <= sq; i++)
		{
			ans += n;
			ans = ans % MOD;
			long pow = i * i;
			while (pow <= n)
			{
				ans += (n / pow) * 2;
				pow *= i;
				ans = ans % MOD;
			}
		}
			
		return (int) ans;
		
//		n = 9;
//		long cnt = 0, tot = 0;
//		for (int a = 1; a <= n; a++)
//		{
//			for (int b = 1; b <= n; b++)
//				for (int c = 1; c <= n; c++)
//					for (int d = 1; d <= n; d++)
//						if ((long)Math.pow(a, b) == (long)Math.pow(c, d))
//						{
//							System.out.println(a+"^"+b+"="+c+"^"+d);
//							cnt++;	
//							tot++;
//						}
//			System.out.println("Subtotal=" + cnt);
//			cnt = 0;
//		}
//		
//		return (int)tot;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + p0);
		System.out.println("]");
		SRM713_Div1_L1_PowerEquation_orig obj;
		int answer;
		obj = new SRM713_Div1_L1_PowerEquation_orig();
		long startTime = System.currentTimeMillis();
		answer = obj.count(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p1);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p1;
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
		
		// ----- test 0 -----
		p0 = 2;
		p1 = 6;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = 15;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 100;
		p1 = 21620;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 22306;
		p1 = 68467;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1;
		p1 = 1;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
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