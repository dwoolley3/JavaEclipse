package topcoder;
import java.util.Arrays;

//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM513_Div2_L1_TrainingCamp
{
	public String[] determineSolvers(String[] attendance, String[] problemTopics)
	{
        int n = attendance.length;
        String[] ret = new String[n];
        Arrays.fill(ret,  "");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < problemTopics.length; j++)
            {
                boolean ok = true;
                for (int k = 0; k < problemTopics[0].length(); k++)
                    if (attendance[i].charAt(k) == '-' && problemTopics[j].charAt(k) == 'X')
                        ok = false;
                if (ok) 
                    ret[i] += "X";
                else
                    ret[i] += "-";
            }
        return ret;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, String[] p1, boolean hasAnswer, String[] p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p1[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM513_Div2_L1_TrainingCamp obj;
		String[] answer;
		obj = new SRM513_Div2_L1_TrainingCamp();
		long startTime = System.currentTimeMillis();
		answer = obj.determineSolvers(p0, p1);
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
				System.out.print("\"" + p2[i] + "\"");
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
			if (answer.length != p2.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (!answer[i].equals(p2[i])) {
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
		String[] p2;
		
		// ----- test 0 -----
		p0 = new String[]{"XXX","XXX","XX-"};
		p1 = new String[]{"---","XXX","-XX","XX-"};
		p2 = new String[]{"XXXX","XXXX","X--X"};
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"-XXXX","----X","XXX--","X-X-X"};
		p1 = new String[]{"X---X","-X---","XXX--","--X--"};
		p2 = new String[]{"-X-X","----","-XXX","X--X"};
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"-----","XXXXX"};
		p1 = new String[]{"XXXXX","-----","--X-X"};
		p2 = new String[]{"-X-","XXX"};
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"-","X","X","-","X"};
		p1 = new String[]{"-","X"};
		p2 = new String[]{"X-","XX","XX","X-","XX"};
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new String[]{"X----X--X","X--X-X---","--X-X----","XXXX-X-X-","XXXX--XXX"};
		p1 = new String[]{"X----X-X-","-----X---","-X----X-X","-X-X-X---","-----X---","X-------X"};
		p2 = new String[]{"-X--XX","-X--X-","------","XX-XX-","--X--X"};
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
