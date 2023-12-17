package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM633_Div2_L1_Target
{
	public String[] draw(int n)
	{
		int[][] a = new int[49][49];
		for (int i = n; i >= 1; i-=4)
		{
			int st = (n-i)/2, en = st + i-1;
			for (int j=st; j <= en; j++) 
			{
				if (j == st || j == en)
					for (int k=st; k <= en; k++) a[j][k] = 1;
				else
				{
					a[j][st] = 1;
					a[j][en] = 1;
				}
			}
		}
		
		String[] s = new String[n];
		for (int i = 0; i < n; i++)
		{
			s[i] = "";		
			for (int j = 0; j < n; j++)
				if (a[i][j] == 1)
					s[i] += "#";
				else
					s[i] += " ";
		}
		
		return s;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, boolean hasAnswer, String[] p1) {
		System.out.print("Test " + testNum + ": [" + p0);
		System.out.println("]");
		SRM633_Div2_L1_Target obj;
		String[] answer;
		obj = new SRM633_Div2_L1_Target();
		long startTime = System.currentTimeMillis();
		answer = obj.draw(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p1.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print("\"" + p1[i] + "\"");
			}
			System.out.println("}");
		}
		System.out.println("Your answer:");
		System.out.print("\t" + "{");
		for (int i = 0; answer.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + answer[i] + "\"");
		}
		System.out.println("}");
		if (hasAnswer) {
			if (answer.length != p1.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (!answer[i].equals(p1[i])) {
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
		
		int p0;
		String[] p1;
		
		// ----- test 0 -----
		p0 = 5;
		p1 = new String[]{"#####","#   #","# # #","#   #","#####"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 9;
		p1 = new String[]{"#########","#       #","# ##### #","# #   # #","# # # # #","# #   # #","# ##### #","#       #","#########"};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 13;
		p1 = new String[]{"#############","#           #","# ######### #","# #       # #","# # ##### # #","# # #   # # #","# # # # # # #","# # #   # # #","# # ##### # #","# #       # #","# ######### #","#           #","#############"};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 17;
		p1 = new String[]{"#################","#               #","# ############# #","# #           # #","# # ######### # #","# # #       # # #","# # # ##### # # #","# # # #   # # # #","# # # # # # # # #","# # # #   # # # #","# # # ##### # # #","# # #       # # #","# # ######### # #","# #           # #","# ############# #","#               #","#################"};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
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
