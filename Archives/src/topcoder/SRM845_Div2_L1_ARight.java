package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM845_Div2_L1_ARight
{
	public String modify(String S, int K)
	{
		String ans = "";
		ArrayList<Character> al = new ArrayList<>();
		ArrayList<String> as = new ArrayList<>();
		ArrayList<Integer> aPos = new ArrayList<>();
		int pos = 0;
		for (int i = 0; i < S.length(); i++) {
			String ss = "";
			while (S.charAt(i) == 'a') {
				ss += 'a';
				i++;
			}
			if (ss.equals("")) {
				al.add(S.charAt(i));
			} else {
				as.add(ss);
				aPos.add(pos + K);
				i--;
			}
			pos++;
		}
		int aPosInd = 0, aAdded = 0;
		for (int i = 0; i < al.size(); i++) {
			if (aPosInd < aPos.size() && aPos.get(aPosInd) == i + aAdded) {
				ans += as.get(aPosInd++);
				aAdded++;
			}
			ans += al.get(i);
		}
		while (aPosInd < aPos.size()) {
			ans += as.get(aPosInd++);
		}
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, int p1, boolean hasAnswer, String p2) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + p1);
		System.out.println("]");
		SRM845_Div2_L1_ARight obj;
		String answer;
		obj = new SRM845_Div2_L1_ARight();
		long startTime = System.currentTimeMillis();
		answer = obj.modify(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p2 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p2);
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
		String p2;
		
		// ----- test 0 -----
		p0 = "topcoder";
		p1 = 3;
		p2 = "topcoder";
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "bananas";
		p1 = 1;
		p2 = "bnanasa";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "aaaaabbbbb";
		p1 = 5;
		p2 = "bbbbbaaaaa";
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "abracadabrahocuspocus";
		p1 = 6;
		p2 = "brcdbrahoacauaspaocus";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "aardvark";
		p1 = 1;
		p2 = "raadvrak";
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "aardvark";
		p1 = 2;
		p2 = "rdaavrka";
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "aardaavaaark";
		p1 = 2;
		p2 = "rdaavraakaaa";
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "as";
		p1 = 1;
		p2 = "sa";
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "s";
		p1 = 1;
		p2 = "s";
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
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