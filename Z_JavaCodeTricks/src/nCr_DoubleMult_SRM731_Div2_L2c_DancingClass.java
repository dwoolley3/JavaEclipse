//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class nCr_DoubleMult_SRM731_Div2_L2c_DancingClass
{
	public String checkOdds(int n, int k)
	{
		double tot = 0;
		
		for (int a = 0; a <= n; a++)
		{
			int b = n - a;
			if (a * b >= k) {
				//System.out.println(n + " " + a + " = " + nCr[n][a]);
				tot += nCr(n,a);
			}
		}
		
		double half = Math.pow(2, n-1);
		
		//double eps = 1e-18;
		//if (Math.abs(tot - half) < eps) return "Equal";
		if (tot == half) return "Equal";
		return (tot < half) ? "Low" : "High";
	}
	
    private double nCr(int n, int r) {
    	if (r < 0 || n < 0 || r > n) return 0;
    	double nCr = 1;
    	for (int i = 1; i <= r; i++)
    		nCr *= (double) (n-i+1) / i;
    	return nCr;
    }	
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, String p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		nCr_DoubleMult_SRM731_Div2_L2c_DancingClass obj;
		String answer;
		obj = new nCr_DoubleMult_SRM731_Div2_L2c_DancingClass();
		long startTime = System.currentTimeMillis();
		answer = obj.checkOdds(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p2 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p2);
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
		String p2;
		
		// ----- test 0 -----
		p0 = 2;
		p1 = 1;
		p2 = "Equal";
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = 2;
		p2 = "High";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 4;
		p1 = 4;
		p2 = "Low";
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 500;
		p1 = 500;
		p2 = "High";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 40;
		p1 = 397;
		p2 = "Low";
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 1;
		p1 = 1;
		p2 = "Low";
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
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
