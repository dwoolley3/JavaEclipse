package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;

//*** Does not work for 1 test case; use exhaustive mask instead

public class TCO2014_R1B_L2_bad_WolvesAndSheep
{
	public int getmin(String[] field)
	{
		int rows = field.length;
		int cols = field[0].length();
		int cnt = 0;
		
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		boolean[] hasW = new boolean[cols];
		boolean[] hasS = new boolean[cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				char ch = field[i].charAt(j);
				hasW[j] = hasW[j] || (ch == 'W');
				hasS[j] = hasS[j] || (ch == 'S');
				if (hasW[j] && hasS[j])
				{
					r.add(i);
					System.out.println("row " + i);
					for (int k = 0; k < cols; k++)
					{
						ch = field[i].charAt(k);
						hasW[k] = (ch == 'W');
						hasS[k] = (ch == 'S');
					}
					break;
				}
			}
		}
		cnt += r.size();
		
		hasW = new boolean[rows];
		hasS = new boolean[rows];
		for (int i = 0; i < cols; i++)
			for (int j = 0; j < rows; j++)
			{
				char ch = field[j].charAt(i);
				hasW[j] = hasW[j] || (ch == 'W');
				hasS[j] = hasS[j] || (ch == 'S');
				if (hasW[j] && hasS[j])
				{
					c.add(i);
					System.out.println("col " + i);
					for (int k = 0; k < rows; k++)
					{
						ch = field[k].charAt(i);
						hasW[k] = (ch == 'W');
						hasS[k] = (ch == 'S');
					}
					break;
				}
			}
		cnt += c.size();
		return cnt;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		TCO2014_R1B_L2_bad_WolvesAndSheep obj;
		int answer;
		obj = new TCO2014_R1B_L2_bad_WolvesAndSheep();
		long startTime = System.currentTimeMillis();
		answer = obj.getmin(p0);
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
		
		String[] p0;
		int p1;
		
		// ----- test 0 -----
		p0 = new String[]{"W.WSS","WW.S.",".SSS.","SSS.S",".SS.S"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{".....",".....","....."};
		p1 = 0;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{".SS","...","S..","W.W"};
		p1 = 1;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"WWWSWWSSWWW","WWSWW.SSWWW","WS.WSWWWWS."};
		p1 = 10;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new String[]{".W.S.W.W","W.W.S.W.",".S.S.W.W","S.S.S.W.",".S.W.W.S","S.S.W.W.",".W.W.W.S","W.W.S.S."};
		p1 = 7;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new String[]{"W.SSWWSSSW.SS",".SSSSW.SSWWWW",".WWWWS.WSSWWS","SS.WSS..W.WWS","WSSS.SSWS.W.S","WSS.WS...WWWS","S.WW.S.SWWWSW","WSSSS.SSW...S","S.WWSW.WWSWSW",".WSSS.WWSWWWS","..SSSS.WWWSSS","SSWSWWS.W.SSW","S.WSWS..WSSS.","WS....W..WSS."};
		p1 = 24;
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = new String[]{"WW..SS","WW..SS","......","......","SS..WW","SS..WW"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(6, p0, true, p1) && all_right;
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
