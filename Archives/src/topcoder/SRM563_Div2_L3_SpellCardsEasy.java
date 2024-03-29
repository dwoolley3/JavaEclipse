package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM563_Div2_L3_SpellCardsEasy
{
	public int maxDamage(int[] level, int[] damage)
	{
        int n = level.length;
        int[][] dp = new int[51][51];
        for (int i = level[0] - 1; i < n; i++)
            dp[0][i] = damage[0];

        for (int i = 1; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                if (level[i] - 1 <= j)
                    dp[i][j] = Math.max(dp[i][j], damage[i] + dp[i-1][j-level[i] + 1]);
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j+1]);
            }

       return dp[n - 1][0];
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM563_Div2_L3_SpellCardsEasy obj;
		int answer;
		obj = new SRM563_Div2_L3_SpellCardsEasy();
		long startTime = System.currentTimeMillis();
		answer = obj.maxDamage(p0, p1);
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
		
		int[] p0;
		int[] p1;
		int p2;
		
		// ----- test 0 -----
		p0 = new int[]{1,1,1};
		p1 = new int[]{10,20,30};
		p2 = 60;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{3,3,3};
		p1 = new int[]{10,20,30};
		p2 = 10;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{4,4,4};
		p1 = new int[]{10,20,30};
		p2 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{50,1,50,1,50};
		p1 = new int[]{10,20,30,40,50};
		p2 = 60;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{2,1,1};
		p1 = new int[]{40,40,10};
		p2 = 80;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new int[]{1,2,1,1,3,2,1};
		p1 = new int[]{10,40,10,10,90,40,10};
		p2 = 150;
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = new int[]{1,2,2,3,1,4,2};
		p1 = new int[]{113,253,523,941,250,534,454};
		p2 = 1577;
		all_right = KawigiEdit_RunTest(6, p0, p1, true, p2) && all_right;
		// ------------------

		// ----- test 7 -----
		p0 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		p1 = new int[]{270, 296, 246, 124, 222, 124, 183, 166, 75, 108, 191, 125, 103, 113, 76, 151, 272, 218, 161, 118, 213, 211, 73, 96, 213, 72, 80, 177, 104, 247, 110, 270, 148, 295, 151, 288, 208, 257, 223, 299, 230, 243, 271, 263, 280, 158, 302, 86, 240, 101};
		p2 = 9251;
		all_right = KawigiEdit_RunTest(6, p0, p1, true, p2) && all_right;
		// ------------------
		
		{}

		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
