package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM553_Div2_L1_PlatypusDuckAndBeaver
{
	public int minimumAnimals(int webbedFeet, int duckBills, int beaverTails)
	{
        int cnt = 0;
        for (int d = 0; d <= 500; d++)
            for (int b = 0; b <= 250; b++)
                for (int p = 0; p <= 250; p++)
                    if ((duckBills == d + p) &&
                        (beaverTails == b + p) &&
                        (webbedFeet == 2 * d + 4 * b + 4 * p))
                        cnt = d + b + p;
        return cnt;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2);
		System.out.println("]");
		SRM553_Div2_L1_PlatypusDuckAndBeaver obj;
		int answer;
		obj = new SRM553_Div2_L1_PlatypusDuckAndBeaver();
		long startTime = System.currentTimeMillis();
		answer = obj.minimumAnimals(p0, p1, p2);
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
		
		// ----- test 0 -----
		p0 = 4;
		p1 = 1;
		p2 = 1;
		p3 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 0;
		p1 = 0;
		p2 = 0;
		p3 = 0;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 10;
		p1 = 2;
		p2 = 2;
		p3 = 3;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 60;
		p1 = 10;
		p2 = 10;
		p3 = 20;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1000;
		p1 = 200;
		p2 = 200;
		p3 = 300;
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
