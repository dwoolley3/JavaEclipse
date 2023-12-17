package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM782_Div2_L2_TrivialWordSearch
{
	public String[] construct(String w)
	{
		int n = w.length();
		if (n == 1) return new String[] {w};
		if (n == 2) return new String[] {};
		int[] cnt = new int[26];
		for (int i = 0; i < n; i++) {
			cnt[w.charAt(i) - 'A']++;
		}
		int min = 11, mini = 100;
		for (int i = 0; i < 26; i++) {
			if (cnt[i] > 0 && cnt[i] < min) {
				min = cnt[i];
				mini = i;
			}
		}
		if (min == n) {
			return new String[] {};
		}
		
		String[] s = new String[n];
		s[0] = w;
		String row = "";
		for (int i = 0; i < n; i++) {
			row += (char)('A' + mini); 
		}
		for (int i = 1; i < n; i++) {
			s[i] = row;
		}
		return s;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, String[] p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM782_Div2_L2_TrivialWordSearch obj;
		String[] answer;
		obj = new SRM782_Div2_L2_TrivialWordSearch();
		long startTime = System.currentTimeMillis();
		answer = obj.construct(p0);
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
		
		String p0;
		String[] p1;
		
		// ----- test 0 -----
		p0 = "DOG";
		p1 = new String[]{"DGOODDO","DODGOGG","DGOODDD","GOOGDGO","GOGGOGD","DOOGDOO","OOGGOOD"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "ABBA";
		p1 = new String[]{"BABA","AABB","ABAA","ABAB"};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "TOPCODER";
		p1 = new String[]{"TOPTOPTOPTOP","TOPTORTOPTOP","TOPTOETOPTOP","TOPTODTOPTOP","TOPTOOTOPTOP","TOPTOCTOPTOP","TOPTOPTOPTOP","TOPTOOTOPTOP","TOPTOTTOPTOP","TOPTOPTOPTOP","TOPTOPTOPOOP","TOPTOPTOPTOP"};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "XXXXX";
		p1 = new String[]{};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "E";
		p1 = new String[]{"E"};
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "ZZ";
		p1 = new String[]{};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "AB";
		p1 = new String[]{};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "ZZA";
		p1 = new String[]{"ZZA","AAA","AAA"};
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
