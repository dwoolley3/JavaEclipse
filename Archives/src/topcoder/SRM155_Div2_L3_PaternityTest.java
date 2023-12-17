package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM155_Div2_L3_PaternityTest
{
	public int[] possibleFathers(String child, String mother, String[] men)
	{
        //At least half of the characters in mother match the 
        //characters in the corresponding positions in child.
        //Thus, implication is that father matches in CORRESPONDING
        //positions, which makes the problem much easier!
        int n = child.length();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int mi = 0; mi < men.length; mi++)
        {
            String m = mother, f = men[mi];
            boolean good = true;
            int fcount = 0;
            for (int i = 0; i < n; i++)
            {
                char c = child.charAt(i);
                if (f.charAt(i) == c)
                    fcount++;
                else if (m.charAt(i) != c)
                    good = false;
            }
            if (good && fcount >= n/2)
                ans.add(mi);
        }

        //C#: return ans.ToArray();  //ArrayList<Integer> ans
        int[] ret = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) ret[i] = ans.get(i);
        return ret;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, String p1, String[] p2, boolean hasAnswer, int[] p3) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + "\"" + p1 + "\"" + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p2[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM155_Div2_L3_PaternityTest obj;
		int[] answer;
		obj = new SRM155_Div2_L3_PaternityTest();
		long startTime = System.currentTimeMillis();
		answer = obj.possibleFathers(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p3.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p3[i]);
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
			if (answer.length != p3.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p3[i]) {
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
		
		String p0;
		String p1;
		String[] p2;
		int[] p3;
		
		// ----- test 0 -----
		p0 = "ABCD";
		p1 = "AXCY";
		p2 = new String[]{"SBTD","QRCD"};
		p3 = new int[]{0};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "ABCD";
		p1 = "ABCX";
		p2 = new String[]{"ABCY","ASTD","QBCD"};
		p3 = new int[]{1,2};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "ABABAB";
		p1 = "ABABAB";
		p2 = new String[]{"ABABAB","ABABCC","ABCCDD","CCDDEE"};
		p3 = new int[]{0,1};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "YZGLSYQT";
		p1 = "YUQRWYQT";
		p2 = new String[]{"YZQLDPWT","BZELSWQM","OZGPSFKT","GZTKFYQT","WQJLSMQT"};
		p3 = new int[]{};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "WXETPYCHUWSQEMKKYNVP";
		p1 = "AXQTUQVAUOSQEEKCYNVP";
		p2 = new String[]{"WNELPYCHXWXPCMNKDDXD","WFEEPYCHFWDNPMKKALIW","WSEFPYCHEWEFGMPKIQCK","WAEXPYCHAWEQXMSKYARN","WKEXPYCHYWLLFMGKKFBB"};
		p3 = new int[]{1,3};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
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
