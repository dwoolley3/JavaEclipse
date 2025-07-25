package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM698_Div2_L2_RepeatStringEasy
{
	public int maximalLength(String s)
	{
		int n = s.length();
		int ans = 0;
		for (int sp = 0; sp < n-1; sp++)
		{			
			int len = lcs(s.substring(0,sp+1), s.substring(sp+1)).length();
			ans = Math.max(ans, len * 2);
		}
		return ans;
	}
	
	//Longest Common Subsequence (LCS)
	private String lcs(String a, String b) {
		int na = a.length(), nb = b.length();
	    int[][] lens = new int[na+1][nb+1];
	 
	    for (int i = 0; i < na; i++)
	        for (int j = 0; j < nb; j++)
	            if (a.charAt(i) == b.charAt(j))
	                lens[i+1][j+1] = lens[i][j] + 1;
	            else
	                lens[i+1][j+1] = Math.max(lens[i+1][j], lens[i][j+1]);
	    	    
	    StringBuffer sb = new StringBuffer();
	    for (int i = na, j = nb; i != 0 && j != 0; ) {
	        if (lens[i][j] == lens[i-1][j])
	            i--;
	        else if (lens[i][j] == lens[i][j-1])
	            j--;
	        else {
	            sb.append(a.charAt(i-1));
	            i--;
	            j--;
	        }
	    }
	 
	    return sb.reverse().toString();    //Return LCS
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM698_Div2_L2_RepeatStringEasy obj;
		int answer;
		obj = new SRM698_Div2_L2_RepeatStringEasy();
		long startTime = System.currentTimeMillis();
		answer = obj.maximalLength(p0);
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
		p0 = "frankfurt";
		p1 = 4;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "single";
		p1 = 0;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "singing";
		p1 = 6;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "aababbababbabbbbabbabb";
		p1 = 18;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "x";
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
