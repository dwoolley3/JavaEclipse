package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM466_Div2_L1_LotteryTicket
{
	public String buy(int price, int b1, int b2, int b3, int b4)
	{
        int[] b = {b1,b2,b3,b4};
        for (int i = 0; i < 16; i++)
        {
            int k = i;
            int sum = 0;
            for (int j = 0; j < 4; j++)
            {
                //if ((i & (1 << j)) > 0) sum += b[j];
                if (k % 2 == 1) sum += b[j];
                k /= 2;
            }
            if (sum == price)
                return "POSSIBLE";
        }
        return "IMPOSSIBLE";
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, int p4, boolean hasAnswer, String p5) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3 + "," + p4);
		System.out.println("]");
		SRM466_Div2_L1_LotteryTicket obj;
		String answer;
		obj = new SRM466_Div2_L1_LotteryTicket();
		long startTime = System.currentTimeMillis();
		answer = obj.buy(p0, p1, p2, p3, p4);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p5 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p5);
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
		int p3;
		int p4;
		String p5;
		
		// ----- test 0 -----
		p0 = 10;
		p1 = 1;
		p2 = 5;
		p3 = 10;
		p4 = 50;
		p5 = "POSSIBLE";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 15;
		p1 = 1;
		p2 = 5;
		p3 = 10;
		p4 = 50;
		p5 = "POSSIBLE";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 65;
		p1 = 1;
		p2 = 5;
		p3 = 10;
		p4 = 50;
		p5 = "POSSIBLE";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 66;
		p1 = 1;
		p2 = 5;
		p3 = 10;
		p4 = 50;
		p5 = "POSSIBLE";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1000;
		p1 = 999;
		p2 = 998;
		p3 = 997;
		p4 = 996;
		p5 = "IMPOSSIBLE";
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 20;
		p1 = 5;
		p2 = 5;
		p3 = 5;
		p4 = 5;
		p5 = "POSSIBLE";
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 2;
		p1 = 1;
		p2 = 5;
		p3 = 10;
		p4 = 50;
		p5 = "IMPOSSIBLE";
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, p3, p4, true, p5) && all_right;
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
