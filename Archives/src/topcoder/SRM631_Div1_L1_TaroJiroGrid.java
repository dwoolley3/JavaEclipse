package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM631_Div1_L1_TaroJiroGrid
{
	public int getNumber(String[] grid)
	{
		int n = grid.length;
		String w = "";
		String b = "";
		for (int j = 0; j < n; j++)
		{
			w += "W";
			b += "B";
		}		
			
		if (good(grid)) return 0;
		for (int i = 0; i < n; i++)
		{
			String temp = grid[i];
			grid[i] = w;
			if (good(grid)) return 1;
			grid[i] = b;
			if (good(grid)) return 1;
			grid[i] = temp;
		}
		return 2;
	}
	
	public boolean good(String[] grid)
	{
		int n = grid.length;
		int max = 1;
		for (int i = 0; i < n; i++)
		{
			char c= grid[0].charAt(i);	
			int cons = 1;
			for (int j = 1; j < n; j++)
			{
				if (c == grid[j].charAt(i))
				{
					cons++;
					max = Math.max(max, cons);
				}
				else 
				{ 
					cons = 1;
					c = grid[j].charAt(i);
				}
			}			
		}
		return (max <= n/2);				
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM631_Div1_L1_TaroJiroGrid obj;
		int answer;
		obj = new SRM631_Div1_L1_TaroJiroGrid();
		long startTime = System.currentTimeMillis();
		answer = obj.getNumber(p0);
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
		
		String[] p0;
		int p1;
		
		// ----- test 0 -----
		p0 = new String[]{"WBBW","WWBB","BWWB","BBWB"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new String[]{"BBBB","BBBW","BWWW","WWWW"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new String[]{"BW","WB"};
		p1 = 0;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new String[]{"WB","BW"};
		p1 = 0;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		
		// ----- test 0 -----
		p0 = new String[]{"WB","BB"};
		p1 = 1;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"WB","WW"};
		p1 = 1;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"WB","WB"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"WBBW","WBWB","WWBB","BWWW"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new String[]{"WBBWBB","BBWBBW","WWBWBW","BWWBBB","WBWBBW","WWWBWB"};
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
