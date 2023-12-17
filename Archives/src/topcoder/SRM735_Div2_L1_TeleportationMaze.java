package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM735_Div2_L1_TeleportationMaze
{
	public int pathLength(String[] a, int r1, int c1, int r2, int c2)
	{
		int rows = a.length, cols = a[0].length();
		int[][] min = new int [rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				min[i][j] = Integer.MAX_VALUE;
		
		boolean[][] did = new boolean[rows][cols];		
		//boolean didone = false;
		
		int rcur = r1, ccur = c1;
		min[rcur][ccur] = 0;
		int lastr = rcur;
		int lastmin = min[rcur][ccur];
		for (int r = rcur - 1; r >= 0; r--)
		{
			if (a[r].charAt(ccur) == '.') {
				int steps = 1;
				if (Math.abs(r - lastr) > 1) steps = 2;
				min[r][ccur] = Math.min(min[r][ccur], lastmin + steps);
				lastr = r;
				lastmin = min[r][ccur];
			}
		}
		
		lastmin = min[rcur][ccur];
		lastr = rcur;
		for (int r = rcur + 1; r < rows; r++)
		{
			if (a[r].charAt(ccur) == '.') {
				int steps = 1;
				if (Math.abs(r - lastr) > 1) steps = 2;
				min[r][ccur] = Math.min(min[r][ccur], lastmin + steps);
				lastr = r;
				lastmin = min[r][ccur];
			}
		}
		
		int lastc = ccur;
		lastmin = min[rcur][ccur];
		for (int c = ccur - 1; c >= 0; c--)
		{
			if (a[rcur].charAt(c) == '.') {
				int steps = 1;
				if (Math.abs(c - lastc) > 1) steps = 2;
				min[rcur][c] = Math.min(min[rcur][c], lastmin + steps);
				lastc = c;
				lastmin = min[rcur][c];
			}
		}
		
		lastc = ccur;
		lastmin = min[rcur][ccur];
		for (int c = ccur + 1; c < cols; c++)
		{
			if (a[rcur].charAt(c) == '.') {
				int steps = 1;
				if (Math.abs(c - lastc) > 1) steps = 2;
				min[rcur][c] = Math.min(min[rcur][c], lastmin + steps);
				lastc = c;
				lastmin = min[rcur][c];
			}
		}
		did[rcur][ccur] = true;
		//didone = true;
		
		for (int iter = 0; iter < rows * cols; iter++)
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				if (min[i][j] != Integer.MAX_VALUE && !did[i][j])
				{
					rcur = i;
					ccur = j;
					//min[rcur][ccur] = 0;
					lastr = rcur;
					lastmin = min[rcur][ccur];
					for (int r = rcur - 1; r >= 0; r--)
					{
						if (a[r].charAt(ccur) == '.') {
							int steps = 1;
							if (Math.abs(r - lastr) > 1) steps = 2;
							min[r][ccur] = Math.min(min[r][ccur], lastmin + steps);
							lastr = r;
							lastmin = min[r][ccur];
							did[i][j] = true;
						}
					}
					
					lastmin = min[rcur][ccur];
					lastr = rcur;
					for (int r = rcur + 1; r < rows; r++)
					{
						if (a[r].charAt(ccur) == '.') {
							int steps = 1;
							if (Math.abs(r - lastr) > 1) steps = 2;
							min[r][ccur] = Math.min(min[r][ccur], lastmin + steps);
							lastr = r;
							lastmin = min[r][ccur];
							did[i][j] = true;
						}
					}
					
					lastc = ccur;
					lastmin = min[rcur][ccur];
					for (int c = ccur - 1; c >= 0; c--)
					{
						if (a[rcur].charAt(c) == '.') {
							int steps = 1;
							if (Math.abs(c - lastc) > 1) steps = 2;
							min[rcur][c] = Math.min(min[rcur][c], lastmin + steps);
							lastc = c;
							lastmin = min[rcur][c];
							did[i][j] = true;
						}
					}
					
					lastc = ccur;
					lastmin = min[rcur][ccur];
					for (int c = ccur + 1; c < cols; c++)
					{
						if (a[rcur].charAt(c) == '.') {
							int steps = 1;
							if (Math.abs(c - lastc) > 1) steps = 2;
							min[rcur][c] = Math.min(min[rcur][c], lastmin + steps);
							lastc = c;
							lastmin = min[rcur][c];
							did[i][j] = true;
						}
					}
				}
		
		if (min[r2][c2] == Integer.MAX_VALUE)
			return -1;
		return min[r2][c2];		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, int p1, int p2, int p3, int p4, boolean hasAnswer, int p5) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}" + "," + p1 + "," + p2 + "," + p3 + "," + p4);
		System.out.println("]");
		SRM735_Div2_L1_TeleportationMaze obj;
		int answer;
		obj = new SRM735_Div2_L1_TeleportationMaze();
		long startTime = System.currentTimeMillis();
		answer = obj.pathLength(p0, p1, p2, p3, p4);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p5);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p5;
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
		int p2;
		int p3;
		int p4;
		int p5;
		// ----- test 1 -----
		p0 = new String[]{".."};
		p1 = 0;
		p2 = 0;
		p3 = 0;
		p4 = 1;
		p5 = 1;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{".",".","#","#",".","#",".",".","."};
		p1 = 7;
		p2 = 0;
		p3 = 1;
		p4 = 0;
		p5 = 5;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"...##...."};
		p1 = 0;
		p2 = 6;
		p3 = 0;
		p4 = 1;
		p5 = 4;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
				
		// ----- test 0 -----
		p0 = new String[]{".##.",".###",".###","...."};
		p1 = 0;
		p2 = 0;
		p3 = 3;
		p4 = 3;
		p5 = 4;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"#.",".#"};
		p1 = 0;
		p2 = 1;
		p3 = 1;
		p4 = 0;
		p5 = -1;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"......","#####.","#.###.","#####.","#.###.","#####.","#....."};
		p1 = 0;
		p2 = 0;
		p3 = 6;
		p4 = 1;
		p5 = 5;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"..................................................",
				"...............................................###",
				"...............................................###",
				".............................................##...",
				".............................................##...",
				};
		p1 = 49;
		p2 = 48;
		p3 = 1;
		p4 = 1;
		p5 = 94;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
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
