package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM766_Div2_L1_Alibi
{
	public String findMurderer(String murderRoom, int murderTime, int[] eventTime, 
			String[] eventPerson, String[] eventRoom)
	{
		String ans = "";
		int n = eventTime.length;
		//String[] rooms = {"Hall","Kitchen", "Ballroom", "Conservatory", "Cellar", "Library", "Lounge", "Study"};
		String[] sus = {"White","Green","Peacock","Plum","Scarlett","Mustard"};
		
		HashSet<String> inMurderRoom = new HashSet<>();
		if (murderRoom.equals("Hall")) {
			for (int i = 0; i < sus.length; i++)
				inMurderRoom.add(sus[i]);
		}
		for (int i = 0; i < n && eventTime[i] <= murderTime; i++) {
			if (eventRoom[i].equals(murderRoom)) 
				inMurderRoom.add(eventPerson[i]);
			else
				inMurderRoom.remove(eventPerson[i]);
		}
		
		if (inMurderRoom.size() == 1) {
			Iterator<String> itr=inMurderRoom.iterator(); 
			while (itr.hasNext()) {
				ans = itr.next();
			}
		}
		
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, int p1, int[] p2, String[] p3, String[] p4, boolean hasAnswer, String p5) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + p1 + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p2[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p3.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p3[i] + "\"");
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p4.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p4[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM766_Div2_L1_Alibi obj;
		String answer;
		obj = new SRM766_Div2_L1_Alibi();
		long startTime = System.currentTimeMillis();
		answer = obj.findMurderer(p0, p1, p2, p3, p4);
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
		
		String p0;
		int p1;
		int[] p2;
		String[] p3;
		String[] p4;
		String p5;
		
		// ----- test 0 -----
		p0 = "Library";
		p1 = 10;
		p2 = new int[]{5,7,9};
		p3 = new String[]{"Plum","Scarlett","Plum"};
		p4 = new String[]{"Library","Library","Cellar"};
		p5 = "Scarlett";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "Library";
		p1 = 10;
		p2 = new int[]{};
		p3 = new String[]{};
		p4 = new String[]{};
		p5 = "";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "Library";
		p1 = 8;
		p2 = new int[]{5,7,9};
		p3 = new String[]{"Plum","Scarlett","Plum"};
		p4 = new String[]{"Library","Library","Cellar"};
		p5 = "";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "Hall";
		p1 = 11;
		p2 = new int[]{2,4,6,8,10,12};
		p3 = new String[]{"White","Green","Peacock","Plum","Scarlett","Mustard"};
		p4 = new String[]{"Kitchen","Ballroom","Conservatory","Library","Lounge","Study"};
		p5 = "Mustard";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "Library";
		p1 = 10;
		p2 = new int[]{3,7};
		p3 = new String[]{"Plum","Plum"};
		p4 = new String[]{"Library","Library"};
		p5 = "Plum";
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, p4, true, p5) && all_right;
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