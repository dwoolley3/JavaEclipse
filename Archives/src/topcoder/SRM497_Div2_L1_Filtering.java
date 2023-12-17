package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM497_Div2_L1_Filtering
{
	public int[] designFilter(int[] sizes, String outcome)
	{
        int n = sizes.length, i;
        int min = 999, max = 0;
        for (i = 0; i < n; i++)
            if (outcome.charAt(i) == 'A')
            {
                min = Math.min(min, sizes[i]);
                max = Math.max(max, sizes[i]);
            }

        for (i = 0; i < n; i++)
            if (outcome.charAt(i) == 'R')
                if (sizes[i] >= min && sizes[i] <= max)
                    return new int[0];

        return new int[] { min, max };
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, String p1, boolean hasAnswer, int[] p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + "\"" + p1 + "\"");
		System.out.println("]");
		SRM497_Div2_L1_Filtering obj;
		int[] answer;
		obj = new SRM497_Div2_L1_Filtering();
		long startTime = System.currentTimeMillis();
		answer = obj.designFilter(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p2.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p2[i]);
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
			if (answer.length != p2.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p2[i]) {
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
		
		int[] p0;
		String p1;
		int[] p2;
		
		// ----- test 0 -----
		p0 = new int[]{3,4,5,6,7};
		p1 = "AAAAA";
		p2 = new int[]{3,7};
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{3,4,5,6,7};
		p1 = "AARAA";
		p2 = new int[]{};
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{3,4,5,6,7};
		p1 = "RAAAA";
		p2 = new int[]{4,7};
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{68,57,7,41,76,53,43,77,84,52,34,48,27,75,36};
		p1 = "RARRRARRRARARRR";
		p2 = new int[]{48,57};
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{26,81,9,14,43,77,55,57,12,34,29,79,40,25,50};
		p1 = "ARAAARRARARARAA";
		p2 = new int[]{};
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
