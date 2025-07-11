package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM844_Div2_L2_MemoryGameDemo
{
	public int[] demo(int N, String cards, String remove)
	{
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] al = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			al[i] = new ArrayList<Integer>();
		}
		int cn = cards.length();
		for (int i = 0; i < cn; i++) {
			char c = cards.charAt(i);
			int ind = c-'A';
			al[ind].add(i);
		}
		
		int rn = remove.length();
		int[] ans = new int[rn*3];
		int ansInd = 0;
		
		int lastN = N;
		int Ncnt = 0;
		for (int i = 0; i < rn; i++) {
			if (remove.charAt(i) == 'Y') {
				lastN--;
				ans[ansInd++] = al[lastN].get(0);
				ans[ansInd++] = al[lastN].get(1);
				ans[ansInd++] = al[lastN].get(2);
			} else {
				if (Ncnt % 2 == 0) {
					ans[ansInd++] = al[0].get(0);
					ans[ansInd++] = al[0].get(1);
					ans[ansInd++] = al[1].get(0);
				} else {
					ans[ansInd++] = al[0].get(0);
					ans[ansInd++] = al[1].get(0);
					ans[ansInd++] = al[1].get(1);
				}
				Ncnt++;
			}
		}
		
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, String p1, String p2, boolean hasAnswer, int[] p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "\"" + p1 + "\"" + "," + "\"" + p2 + "\"");
		System.out.println("]");
		SRM844_Div2_L2_MemoryGameDemo obj;
		int[] answer;
		obj = new SRM844_Div2_L2_MemoryGameDemo();
		long startTime = System.currentTimeMillis();
		answer = obj.demo(p0, p1, p2);
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
		
		int p0;
		String p1;
		String p2;
		int[] p3;
		
		// ----- test 0 -----
		p0 = 3;
		p1 = "AAABBBCCC";
		p2 = "NNNN";
		p3 = new int[]{0,3,6,0,3,7,1,3,4,2,5,6};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = "ABABCCBAC";
		p2 = "YN";
		p3 = new int[]{0,2,7,4,1,3};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 6;
		p1 = "FEABDCDEACFFADCEBB";
		p2 = "YNYNNYY";
		p3 = new int[]{2,8,12,5,3,16,3,16,17,4,5,9,5,4,6,5,9,14,4,6,13};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = "AABABB";
		p2 = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
		p3 = new int[]{0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = "AABABCBCC";
		p2 = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNYNNN";
		p3 = new int[]{0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,5,7,8,0,1,2,0,2,4,0,1,2};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 26;
		p1 = "AABABCBCCDDDEEEFFFGGGHHHIIIJJJKKKLLLMMMNNNOOOPPPQQQRRRSSSTTTUUUVVVWWWXXXYYYZZZ";
		p2 = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNYNYNNN";
		p3 = new int[]{0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,0,1,2,0,2,4,75,76,77,0,1,2,72,73,74,0,2,4,0,1,2,0,2,4};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
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
