package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM730_Div2_L2_ExpectedMinimumPowerDiv2
{
	public double findExp(int n, int x)
	{
		double sum = 0;
		long den = 0;
		long[] pow2 = new long[51];
		pow2[0] = 1;
		for (int i = 1; i <= 50; i++)
			pow2[i] = pow2[i-1] * 2L;
		
		long[][] nCr = generateBinomialCoefficients(n+5);
		
		for (int i = 1; i <= n-x+1; i++) {			
			int r = n-x+1 - i;
			int num = n - i;
			long k = 1;
			k = nCr[num][r];
			sum += (pow2[i] * k); 
			den += k;
		}
		
		double ave = 1.0 * sum / den;
		return ave;
	}
	
   long[][] generateBinomialCoefficients(int n) {
        long[][] nCr = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
        	nCr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
            	nCr[i][j] = nCr[i - 1][j - 1] + nCr[i - 1][j];
            }
        }
        return nCr;
    }
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, double p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		SRM730_Div2_L2_ExpectedMinimumPowerDiv2 obj;
		double answer;
		obj = new SRM730_Div2_L2_ExpectedMinimumPowerDiv2();
		long startTime = System.currentTimeMillis();
		answer = obj.findExp(p0, p1);
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
			res = Math.abs(p2 - answer) <= 1e-9 * Math.max(1.0, Math.abs(p2));
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
		double p2;
		
		// ----- test 0 -----
		p0 = 4;
		p1 = 4;
		p2 = 2.0D;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = 2;
		p2 = 2.6666666666666665D;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = 1;
		p2 = 4.666666666666667D;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 10;
		p1 = 4;
		p2 = 8.076190476190476D;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 50;
		p1 = 25;
		p2 = 9.906688596554163D;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 50;
		p1 = 1;
		p2 = 4.503599627370492E13D;
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
