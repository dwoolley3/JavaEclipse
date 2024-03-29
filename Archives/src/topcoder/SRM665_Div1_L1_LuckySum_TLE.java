package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM665_Div1_L1_LuckySum_TLE
{
	public long construct(String note)
	{
		int n = note.length();
		long num = 0;
		
		ArrayList<Long> al = new ArrayList<Long>();
		for (int i = 1; i <= 14; i++)
			for (int mask = 0; mask < (1 << i); mask++)
			{
				num = 0;				
				for (int j = 0; j < i; j++)
					if ((mask & (1 << j)) == 0)
						num = num*10 + 4;
					else 
						num = num*10 + 7;
				al.add(num);
			}
			
		Collections.sort(al);
		
		long minSum = Long.MAX_VALUE;
		for (int i = 0; i < al.size(); i++)
		{
			String numSt = al.get(i) + "";
			if (numSt.length() == n || numSt.length() == n-1)
			{
				for (int j = 0; j < al.size(); j++)
				{
					long sum = al.get(i) + al.get(j);
					String sumSt = sum + "";
					if (sumSt.length() > n) break;
					if (sumSt.length() < n) continue;
					boolean ok = true;
					for (int k = 0; k < n; k++)
					{
						char c = note.charAt(k);					
						if (c != '?' && c != sumSt.charAt(k))
						{
							ok = false;
							break;
						}
					}
					if (ok && sum < minSum)
						minSum = sum;
				}
			}
		}
		
		if (minSum < Long.MAX_VALUE)
			return minSum;
		
//		for (int i = 0; i < 20; i++)
//			for (int j = 0; j < 20; j++)
//				System.out.println(al.get(i) + al.get(j));
		

		return -1;

	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, long p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM665_Div1_L1_LuckySum_TLE obj;
		long answer;
		obj = new SRM665_Div1_L1_LuckySum_TLE();
		long startTime = System.currentTimeMillis();
		answer = obj.construct(p0);
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
		long p1;
		
//		// ----- test 4 -----
//		p0 = "7?????????????";
//		p1 = 74444444444448L;
//		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
//		// ------------------
		
		// ----- test 4 -----
		p0 = "??47??????";
		p1 = 4447444448L;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = "?";
		p1 = 8L;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "?1";
		p1 = 11L;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "4?8";
		p1 = 448L;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "2??";
		p1 = -1L;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "??????????????";
		p1 = 11888888888888L;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
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
