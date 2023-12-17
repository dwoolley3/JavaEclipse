package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM151_Div2_L2_Birthday
{
	public String getNext(String date, String[] birthdays)
	{
        int n = birthdays.length;
        Arrays.sort(birthdays);
        for (int i = 0; i < n; i++)
        {
            String bday = birthdays[i].substring(0, 5);
            if (bday.compareTo(date) >= 0)  //bday >= date
                return bday;
        }
        return birthdays[0].substring(0,5);
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, String[] p1, boolean hasAnswer, String p2) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p1[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM151_Div2_L2_Birthday obj;
		String answer;
		obj = new SRM151_Div2_L2_Birthday();
		long startTime = System.currentTimeMillis();
		answer = obj.getNext(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p2 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p2);
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
		String[] p1;
		String p2;
		
		// ----- test 0 -----
		p0 = "06/17";
		p1 = new String[]{"02/17 Wernie","10/12 Stefan"};
		p2 = "10/12";
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "06/17";
		p1 = new String[]{"10/12 Stefan"};
		p2 = "10/12";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "02/17";
		p1 = new String[]{"02/17 Wernie","10/12 Stefan"};
		p2 = "02/17";
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "12/24";
		p1 = new String[]{"10/12 Stefan"};
		p2 = "10/12";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "01/02";
		p1 = new String[]{"02/17 Wernie","10/12 Stefan","02/17 MichaelJordan","10/12 LucianoPavarotti","05/18 WilhelmSteinitz"};
		p2 = "02/17";
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
