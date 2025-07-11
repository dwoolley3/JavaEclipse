package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM777_Div1_L1_PreviousOccurrence
{
	public int findValue(int defaultValue, int query)
	{
		ArrayList<Integer> al = new ArrayList<>();
		int max = 1500000;
		int[] last = new int[max+1];
		int[] last2 = new int[max+1];
		for (int i = 0; i <= max; i++) {
			last[i] = -1;
			last2[i] = -2;
		}
		int ind = 0;
		al.add(0);
		last2[0] = last[0];
		last[0] = ind;
		
		int m = -1;
		
		for (int i = 0; i < max; i++) {
			int x = al.get(ind);			
			if (query == x ) {
				//System.out.println(m);
				return ind;
			}
			
			int nextx = defaultValue;
			if (x <= max && last2[x] >= 0) {
				nextx = last[x] - last2[x];				
			}
			ind++;
			if (nextx <= max) {
				al.add(nextx);
				last2[nextx] = last[nextx];
				last[nextx] = ind;
			} 
			

			if (nextx > m) m = nextx;
		}
		
		//for (int i = 0; i <= 7000; i++) {
		//	if (last[i] < 0) {
		//		System.out.println("i="+i);
		//		break;				
		//	}
		//}
		
		//System.out.println(m);
		return -1;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		SRM777_Div1_L1_PreviousOccurrence obj;
		int answer;
		obj = new SRM777_Div1_L1_PreviousOccurrence();
		long startTime = System.currentTimeMillis();
		answer = obj.findValue(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p2);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p2;
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
		int p1;
		int p2;
		
		// ----- test 0 -----
		p0 = 7;
		p1 = 0;
		p2 = 0;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 7;
		p1 = 2;
		p2 = 5;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 7;
		p1 = 47;
		p2 = 1261;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 47;
		p1 = 7;
		p2 = 66;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 47;
		p1 = 6763;
		p2 = 540153;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 47;
		p1 = 7000;
		p2 = 118212;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 47;
		p1 = 47;
		p2 = 1;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
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
