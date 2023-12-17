package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM708_Div2_L2_BuildingStrings
{
	public String[] findAny(int K)
	{
		String n1250 = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy";
		ArrayList<String> s = new ArrayList<String>();
		while (K >= 1250)
		{
			K -= 1250;
			s.add(n1250);
		}
		String n1000 = "aabbccddeeffgghhiijjkkllmmnnoopqrstuvwxy";
		if (K >= 1000)
		{
			K -= 1000;
			s.add(n1000);
		}
		
		String s50 = "";
		char let = 'a';
		while (K >= 50)
		{
			K -= 50;
			s50 += (let + "");
			let++;
		}
		if (s50.length() > 0)
		{
			let--;
			while (s50.length() < 50)
				s50 += (let + "");
			s.add(s50);
		}
		
		String n25 = "aaaaaaaaaaaaaaaaaaaaaaaaa";
		if (K >= 25)
		{
			K -= 25;
			s.add(n25);
		}
		
		let = 'a';
		String s25b = "";
		while (K >= 1)
		{
			K -= 1;
			s25b += (let + "");
		}
		if (s25b.length() > 0)
			s.add(s25b);

		int n = s.size();
		String[] st = new String[n];
		for (int i = 0; i < n; i++)
			st[i] = s.get(i);
			
		return st; 
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, boolean hasAnswer, String[] p1) {
		System.out.print("Test " + testNum + ": [" + p0);
		System.out.println("]");
		SRM708_Div2_L2_BuildingStrings obj;
		String[] answer;
		obj = new SRM708_Div2_L2_BuildingStrings();
		long startTime = System.currentTimeMillis();
		answer = obj.findAny(p0);
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
		p0 = 49;
		p1 = new String[]{"little","limak"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 15;
		p1 = new String[]{"azz","xyz"};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 704;
		p1 = new String[]{"aaaaaaaaaa","abcdefghijklmnopqrstuvwxyz","aabbcc"};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 37521;
		p1 = new String[]{"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvww" +
				"xxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy","abcd","aa","a","a","a"};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1;
		p1 = new String[]{"a"};
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		
		// ----- test 0 -----
		p0 = 49999;
		p1 = new String[]{"little","limak"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		
		// ----- test 0 -----
		p0 = 1249;
		p1 = new String[]{"little","limak"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
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
