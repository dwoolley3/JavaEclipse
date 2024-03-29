package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM687_Div2_L2_Quacking
{
	public int quack(String s)
	{
		int n = s.length();
		String[] a = new String[n]; 
		int last = 0;
		
		for (int i = 0; i < n; i++)
		{
			char c = s.charAt(i);
			int ind = "quack".indexOf(c);
			boolean ok = false;
			for (int j = 0; j < last && !ok; j++)
			{
				char lastc = a[j].charAt(a[j].length() - 1);
				int ind2 = "quack".indexOf(lastc);
				if (ind == ind2 + 1 || (ind == 0 && ind2 == 4))
				{
					a[j] += c;
					ok = true;
				}
			}
			if (!ok && ind == 0)
			{
				a[last] = c+"";
				last++;
				ok = true;
			}
			if (!ok) return -1;
		}
		
		for (int i = 0; i < last; i++)
			if (a[i].length() % 5 != 0) return -1;
		
		return last;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM687_Div2_L2_Quacking obj;
		int answer;
		obj = new SRM687_Div2_L2_Quacking();
		long startTime = System.currentTimeMillis();
		answer = obj.quack(p0);
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
		p0 = "quqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackck";
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------";
		
		// ----- test 0 -----
		p0 = "quqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackckquqacukqauackck";
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------";

		
		// ----- test 0 -----
		p0 = "quqacukqauackckqquuaacck";
		p1 = -1;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		

		// ----- test 0 -----
		p0 = "quqacukqauackck";
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "kcauq";
		p1 = -1;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "quackquackquackquackquackquackquackquackquackquack";
		p1 = 1;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "qqqqqqqqqquuuuuuuuuuaaaaaaaaaacccccccccckkkkkkkkkk";
		p1 = 10;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "quqaquuacakcqckkuaquckqauckack";
		p1 = 3;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "quackqauckquack";
		p1 = -1;
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
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
