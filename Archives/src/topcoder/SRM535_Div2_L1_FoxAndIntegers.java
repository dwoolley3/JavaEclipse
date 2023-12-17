package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM535_Div2_L1_FoxAndIntegers
{
	public int[] get(int AminusB, int BminusC, int AplusB, int BplusC)
	{
		for(int a= -30; a <= 30; a++)
            for (int b= -30; b <= 30; b++)
                for (int c= -30; c <= 30; c++)
                    if (AminusB == a - b
                        && BminusC == b - c
                        && AplusB == a + b
                        && BplusC == b + c)
                    {
                        return new int[] {a,b,c};
                    }

        return new int[]{};
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, int[] p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		SRM535_Div2_L1_FoxAndIntegers obj;
		int[] answer;
		obj = new SRM535_Div2_L1_FoxAndIntegers();
		long startTime = System.currentTimeMillis();
		answer = obj.get(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p4.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p4[i]);
			}
			System.out.println("}");
		}
		System.out.println("Your answer:");
		System.out.print("\t" + "{");
		for (int i = 0; answer.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(answer[i]);
		}
		System.out.println("}");
		if (hasAnswer) {
			if (answer.length != p4.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p4[i]) {
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
		int p1;
		int p2;
		int p3;
		int[] p4;
		
		// ----- test 0 -----
		p0 = 1;
		p1 = -2;
		p2 = 3;
		p3 = 4;
		p4 = new int[]{2,1,3};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 0;
		p1 = 0;
		p2 = 5;
		p3 = 5;
		p4 = new int[]{};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 10;
		p1 = -23;
		p2 = -10;
		p3 = 3;
		p4 = new int[]{0,-10,13};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = -27;
		p1 = 14;
		p2 = 13;
		p3 = 22;
		p4 = new int[]{};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 30;
		p1 = 30;
		p2 = 30;
		p3 = -30;
		p4 = new int[]{30,0,-30};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
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
