package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class TCO17_Regional_Austin_L2_PlusSign
{
	public int draw(String[] p)
	{
		int Rows = p.length;
		int Cols = p[0].length();
		int black = 0;
		for (int i = 0; i < Rows; i++)
			for (int j = 0; j < Cols; j++)
				if (p[i].charAt(j) == '#') black++;
		
		int min = Integer.MAX_VALUE;
		int minRowCol = Math.min(Rows,Cols);
		for (int len = 3; len <= minRowCol; len += 2)
		{
			//System.out.println("len=" + len + " minRowCol = " + minRowCol);
			for (int box = 1; box <= len / 2; box++)
				for (int r = 0; r <= Rows - len; r++)
					for (int c = 0; c <= Cols - len; c++)
					{
						//System.out.println("box = " + box + " r = " + r + " c = " + c);
						int b = 0, w = 0;
						for (int i = r + box; i < r + len - box; i++)
							for (int j = 0; j < len; j++)
								if (p[i].charAt(c+j) == '#') b++;
								else w++;
						//System.out.println(b + " " + w);
						
						for (int i = c + box; i < c + len - box; i++)
							for (int j = 0; j < len; j++)
								if (j < box || j >= len - box)
									if (p[r+j].charAt(i) == '#') b++;
									else w++;
						//System.out.println(b + " " + w);
					
						if (b == black)
							min = Math.min(min, w);
					}
		}
					
		if (min == Integer.MAX_VALUE) return -1;
		return min;
		
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
		TCO17_Regional_Austin_L2_PlusSign obj;
		int answer;
		obj = new TCO17_Regional_Austin_L2_PlusSign();
		long startTime = System.currentTimeMillis();
		answer = obj.draw(p0);
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
		p0 = new String[]{".#..","#.#.",".#..","...."};
		p1 = 1;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new String[]{"....","..#.",".###","..#."};
		p1 = 0;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"..#....",".......","......#",".......",".......",".......","......."};
		p1 = 31;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"#..","...","..."};
		p1 = -1;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
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