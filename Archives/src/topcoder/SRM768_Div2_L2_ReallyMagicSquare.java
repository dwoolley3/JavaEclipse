package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM768_Div2_L2_ReallyMagicSquare
{
	public int[] reconstruct(int[] topRow, int[] mainDiagonal)
	{
		int n = topRow.length;
		if (n == 1) return topRow;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			a[0][i] = topRow[i];
			a[i][i] = mainDiagonal[i];
		}
		
		for (int i = 1; i < n; i++) 
			for (int j = 0; j < n; j++)
			{
				int col = i-j; if (col < 0) col += n;
				int col1 = i-j-1;
					if (col1 < 0) col1 +=n;
					else if (col1 >= n) col1 -=n;
						
				if (i != col1) {
					a[i][col1] = a[i-1][col1] + a[i][col] - a[i-1][col];
				}
		}
			
		int[] ans = new int[n*n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				ans[i*n+j] = a[i][j];
		
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, int[] p2) {
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
		SRM768_Div2_L2_ReallyMagicSquare obj;
		int[] answer;
		obj = new SRM768_Div2_L2_ReallyMagicSquare();
		long startTime = System.currentTimeMillis();
		answer = obj.reconstruct(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p2.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p2[i]);
			}
			System.out.println("}");
		}
		System.out.println("Your answer:");
		System.out.print("\t" + "{");
		for (int i = 0; answer.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(answer[i]);
		}
		System.out.println("}");
		if (hasAnswer) {
			if (answer.length != p2.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p2[i]) {
						res = false;
					}
				}
			}
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
		int[] p2;
		
		// ----- test 0 -----
		p0 = new int[]{140,80,160,60};
		p1 = new int[]{140,30,120,50};
		p2 = new int[]{140,80,160,60,90,30,110,10,100,40,120,20,130,70,150,50};
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,7};
		p1 = new int[]{1,4};
		p2 = new int[]{1,7,-2,4};
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{47,47,47,47,47};
		p1 = new int[]{47,47,47,47,47};
		p2 = new int[]{47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47};
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,4,5};
		p1 = new int[]{1,2,3};
		p2 = new int[]{1,4,5,-1,2,3,-1,2,3};
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
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
