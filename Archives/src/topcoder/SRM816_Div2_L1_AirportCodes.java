package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM816_Div2_L1_AirportCodes
{
	public String[] name(String[] airports)
	{

		HashMap<String, Integer> hm = new HashMap<>();
		for (String a : airports) {
			int n = a.length();
			for (int i = 0; i < n-2; i++)
				for (int j = i+1; j < n-1; j++)
					for (int k = j+1; k < n; k++) {
						String s = "" + a.charAt(i) + a.charAt(j) + a.charAt(k);
						int num = 0;
						if (hm.get(s) != null) num = hm.get(s);
						hm.put(s,++num);
					}			
		}
				
		int ind = 0;
		String[] ans = new String[airports.length];
		for (String a : airports) {
			
			HashMap<String, Integer> hmAir = new HashMap<>();
			int n = a.length();
			for (int i = 0; i < n-2; i++)
				for (int j = i+1; j < n-1; j++)
					for (int k = j+1; k < n; k++) {
						String s = "" + a.charAt(i) + a.charAt(j) + a.charAt(k);
						int num = 0;
						if (hmAir.get(s) != null) num = hmAir.get(s);
						hmAir.put(s,++num);
					}

			boolean found = false;
			for (int i = 0; i < n-2 && !found; i++)
				for (int j = i+1; j < n-1 && !found; j++)
					for (int k = j+1; k < n && !found; k++) {
						String s = "" + a.charAt(i) + a.charAt(j) + a.charAt(k);
						int x = hmAir.get(s) != null ? hmAir.get(s) : 0;
						if (x > 0 && x == hm.get(s)) {
							ans[ind] = s;
							found = true;
						}
					}
			if (!found) ans[ind] = "";
			ind++;			
		}
		return ans;		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, boolean hasAnswer, String[] p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM816_Div2_L1_AirportCodes obj;
		String[] answer;
		obj = new SRM816_Div2_L1_AirportCodes();
		long startTime = System.currentTimeMillis();
		answer = obj.name(p0);
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
		
		String[] p0;
		String[] p1;
		
		// ----- test 0 -----
		p0 = new String[]{"FRANKFURT","ZURICH","LONDONHEATHROW"};
		p1 = new String[]{"FRA","ZRH","LHR"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"NEWYORK","NEWJERSEY","NEWPORT","NEUSTADT"};
		p1 = new String[]{"NEK","NEJ","NEP","NEU"};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"NEWYORK","NEWYORK","NEWARK"};
		p1 = new String[]{"","","NEA"};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"ULM","FEZ","ELY","JERUSALEM"};
		p1 = new String[]{"","FEZ","ELY","JER"};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new String[]{"FRANKFURT","ZURICH","AAAAAA"};
		p1 = new String[]{"FRA","ZUR","AAA"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new String[]{"FRANKFURT","ZURICH","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"};
		p1 = new String[]{"FRA","ZUR","AAA", "BBB"};
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