package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM691_Div2_L1_Plusonegame
{
	public String getorder(String s)
	{
		String st = "";
		int cnt = 0;
		int[] a = new int[10];
		for (int i = 0; i < s.length(); i++)
		{
			char c= s.charAt(i);
			if (c == '+') cnt++;
			else a[c-'0']++;
		}
		
		for (int j = 0; j < a[0]; j++)
			st += "0";
		int lastdig = 0;
		for (int i = 1; i <= 9; i++)
		{
			if (a[i] > 0)
			{
				int min = Math.min(cnt, i - lastdig);
				for (int j = 0; j < min; j++)
					st += "+";
				cnt -= min;
				for (int j = 0; j < a[i]; j++)
					st += i + "";
				lastdig = i;
			}
		}
		for (int j = 0; j < cnt; j++)
			st += "+";
		
		return st;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, String p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM691_Div2_L1_Plusonegame obj;
		String answer;
		obj = new SRM691_Div2_L1_Plusonegame();
		long startTime = System.currentTimeMillis();
		answer = obj.getorder(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p1 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p1);
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
		String p1;
		
		// ----- test 0 -----
		p0 = "1++";
		p1 = "+1+";
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "549";
		p1 = "459";
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "++++++";
		p1 = "++++++";
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "+++++2+";
		p1 = "++2++++";
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "++++4++++200++2++1+6++++++";
		p1 = "00+1+22++4++6+++++++++++++";
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "++11199999";
		p1 = "+111+99999";
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
