package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM509_Div2_L1_PalindromizationDiv2
{
	public int getMinimumCost(int X)
	{
		int i = -1;
		while (i++ < 1_000_000)
		{
			if (isPal(X - i) || isPal(X + i)) return i;	
		}
		return i;
	}
	
	@SuppressWarnings("unused")
	private boolean isPal(String s)
	{
		int n = s.length();
		for (int i = 0; i < n/2; i++)
			if (s.charAt(i) != s.charAt(n-1-i))	return false;
		return true;
	}
	
	private boolean isPal(int number)
	{
        int num = number, reverse = 0, digit;
        while (num > 0)
        {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return (number == reverse);
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + p0);
		System.out.println("]");
		SRM509_Div2_L1_PalindromizationDiv2 obj;
		int answer;
		obj = new SRM509_Div2_L1_PalindromizationDiv2();
		long startTime = System.currentTimeMillis();
		answer = obj.getMinimumCost(p0);
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
		p0 = 25;
		p1 = 3;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 12321;
		p1 = 0;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 40;
		p1 = 4;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 2011;
		p1 = 9;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 0;
		p1 = 0;
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
