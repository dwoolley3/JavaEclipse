package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM749_Div1_L1_FightMonsterDiv1_byPetr2
{

	public long fightTime(long hp, long attack, int level, long duration)
	{
		long increment = attack / 100 * level;
		long noMagicTime = solveNoMagic(hp, attack, increment);
		long left = -1;
		long right = noMagicTime;
		while (right - left > 1) {
			long middle = (left + right)  / 2;
			long first = attack;
			long last = attack + increment * (middle - 1);
			long exact = (first + last) * middle / 2;
			long extra = solveNoMagic(hp - exact, (last + increment) * 5, increment * 5);
			if (extra <= duration) {
				right = middle;
			} else {
				left = middle;
			}
		}
		{
			long middle = right;
			long first = attack;
			long last = attack + increment * (middle - 1);
			long exact = (first + last) * middle / 2;
			long extra = solveNoMagic(hp - exact, (last + increment) * 5, increment * 5);
			return Math.min(noMagicTime,  middle + 1 + extra);
		}
	}
	
	private long solveNoMagic(long hp, long base, long increment) {
		long left = -1;
		long right = hp / base + 1;
		while (right - left > 1) {
			long middle = (left + right)  / 2;
			long first = base;
			long last = base + increment * (middle - 1);
			double approx = (first + last) * (double) middle / 2;
			long exact = (first + last) * middle / 2;
			if (approx > hp * 10 || exact >= hp) {
				right = middle;
			} else {
				left = middle;
			}
		}
		return right;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, long p0, long p1, int p2, long p3, boolean hasAnswer, long p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		SRM749_Div1_L1_FightMonsterDiv1_byPetr2 obj;
		long answer;
		obj = new SRM749_Div1_L1_FightMonsterDiv1_byPetr2();
		long startTime = System.currentTimeMillis();
		answer = obj.fightTime(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p4);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p4;
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
		
		long p0;
		long p1;
		int p2;
		long p3;
		long p4;
		
		// ----- test 0 -----
		p0 = 201L;
		p1 = 100L;
		p2 = 10;
		p3 = 10L;
		p4 = 2L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 74900L;
		p1 = 100L;
		p2 = 0;
		p3 = 2L;
		p4 = 742L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1000000000000L;
		p1 = 1000000000000L;
		p2 = 100;
		p3 = 1000000000000L;
		p4 = 1L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1338L;
		p1 = 100L;
		p2 = 1;
		p3 = 2L;
		p4 = 6L;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1000000000000L;
		p1 = 1000000L;
		p2 = 67;
		p3 = 5000000000L;
		p4 = 773L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
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
