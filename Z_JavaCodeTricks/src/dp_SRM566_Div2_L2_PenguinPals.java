//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class dp_SRM566_Div2_L2_PenguinPals
{
    int[][] memo;
	public int findMaximumMatching(String colors)
	{
        int n = colors.length();
        memo = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                memo[i][j] = -1;

        return findMax(0, n - 1, colors);
	}
	
    private int findMax(int s, int e, String colors)
    {
        if (s >= e) return 0;
        if (memo[s][e] != -1) return memo[s][e];
        int max = 0;
        for (int i = s; i < e; i++)
            for (int j = i + 1; j <= e; j++)
                if (colors.charAt(i) == colors.charAt(j))
                    max = Math.max(max, 1
                        + findMax(i + 1, j - 1, colors)
                        + findMax(j + 1, e, colors));

        memo[s][e] = max;
        return max;
    }
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		dp_SRM566_Div2_L2_PenguinPals obj;
		int answer;
		obj = new dp_SRM566_Div2_L2_PenguinPals();
		long startTime = System.currentTimeMillis();
		answer = obj.findMaximumMatching(p0);
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
		
		String p0;
		int p1;
		
		// ----- test 0 -----
		p0 = "RRBRBRBB";
		p1 = 3;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "RRRR";
		p1 = 2;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "BBBBB";
		p1 = 2;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "RBRBRBRBR";
		p1 = 4;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "RRRBRBRBRBRB";
		p1 = 5;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "R";
		p1 = 0;
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = "RBRRBBRB";
		p1 = 3;
		all_right = KawigiEdit_RunTest(6, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = "RBRBBRBRB";
		p1 = 4;
		all_right = KawigiEdit_RunTest(7, p0, true, p1) && all_right;
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
