package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class TCO2018_Argentina_L1_ArmySize
{
	public String[] getSum(String[] units)
	{
		String[] hero = {"Few", "Several", "Pack", "Lots", "Horde", "Throng", 
				"Swarm", "Zounds", "Legion"};
		int[] hmin = {1,5,10,20,50,100,250,500,1000};
		int[] hmax = {4,9,19,49,99,249,499,999,10000};
		
		int n = units.length;
		int summin = 0, summax = 0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < hero.length; j++)
				if (hero[j].equals(units[i])) {
					summin += hmin[j];
					summax += hmax[j];
				}		
		}
		
		ArrayList<String> al = new ArrayList<>();
		for (int j = 0; j < hero.length; j++) 
		{
			if (hmin[j] <= summax && hmax[j] >= summin)
				al.add(hero[j]);				
		}
		String[] ans = new String[al.size()];
		for (int i = 0; i < al.size(); i++)
			ans[i] = al.get(i);
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
		TCO2018_Argentina_L1_ArmySize obj;
		String[] answer;
		obj = new TCO2018_Argentina_L1_ArmySize();
		long startTime = System.currentTimeMillis();
		answer = obj.getSum(p0);
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
		p0 = new String[]{"Lots","Lots"};
		p1 = new String[]{"Lots","Horde"};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"Throng","Few","Few"};
		p1 = new String[]{"Throng","Swarm"};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"Few","Few","Few","Few","Several"};
		p1 = new String[]{"Several","Pack","Lots"};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"Swarm","Pack","Horde"};
		p1 = new String[]{"Swarm","Zounds"};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new String[]{"Horde","Horde","Zounds","Pack"};
		p1 = new String[]{"Zounds","Legion"};
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new String[]{"Legion","Horde","Swarm","Several"};
		p1 = new String[]{"Legion"};
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
		// ------------------
				
		// ----- test 5 -----
		p0 = new String[]{"Legion","Legion","Legion","Legion","Legion","Legion","Legion"};
		p1 = new String[]{"Legion"};
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
