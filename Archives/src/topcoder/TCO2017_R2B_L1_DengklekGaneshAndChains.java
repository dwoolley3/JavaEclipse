package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class TCO2017_R2B_L1_DengklekGaneshAndChains
{
	public String getBestChains(String[] chains, int[] lengths)
	{
		int n = chains.length, k = chains[0].length(), m = lengths.length;
		for (int i = 0; i < n; i++)
		{
			String[] c2 = new String[k];
			String s = chains[i];
			for (int j = 0; j < k; j++)
			{
				c2[j] = s.substring(1,k) + s.substring(0,1);
				s = c2[j];
			}
			Arrays.sort(c2);
			chains[i] = c2[k-1];  //lex largest
		}
		
		boolean[] used = new boolean[n];
		String ans = "";
		for (int i = 0; i < m; i++)
		{
			String best = "";
			int bestj = -1;
			int extract = lengths[i];
			for (int j = 0; j < n; j++)
				if (!used[j])
				{
					String st = chains[j].substring(0,extract);
					if (st.compareTo(best) > 0)
					{
						best = st;
						bestj = j;
					}
					else if (st.compareTo(best) == 0 
							&& chains[j].compareTo(chains[bestj]) < 0)
					{
						best = st;
						bestj = j;
					}
				}
			ans += best;
			used[bestj] = true;
		}
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, int[] p1, boolean hasAnswer, String p2) {
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
			System.out.print(p1[i]);
		}
		System.out.print("}");
		System.out.println("]");
		TCO2017_R2B_L1_DengklekGaneshAndChains obj;
		String answer;
		obj = new TCO2017_R2B_L1_DengklekGaneshAndChains();
		long startTime = System.currentTimeMillis();
		answer = obj.getBestChains(p0, p1);
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
		
		String[] p0;
		int[] p1;
		String p2;
		
		// ----- test 0 -----
		p0 = new String[]{"topc","oder","open","twob"};
		p1 = new int[]{2,1,3};
		p2 = "wotrod";
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"ssh","she","see","sea"};
		p1 = new int[]{2,3,2,3};
		p2 = "ssshesesee";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"wri","ter","who","are","you"};
		p1 = new int[]{3};
		p2 = "you";
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"harus","imfyo"};
		p1 = new int[]{5,5};
		p2 = "yoimfushar";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"azb"};
		p1 = new int[]{3};
		p2 = "zba";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"b"};
		p1 = new int[]{1};
		p2 = "b";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"sshss","shess","seess","seass"};
		p1 = new int[]{3,4,3,4};
		p2 = "sssssssssssssh";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"aab","abc","bca","aac"};
		p1 = new int[]{1,2,1,2};
		p2 = "ccacba";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"bza","daz","zza","zaa","cza","zdb"};
		p1 = new int[]{1,1,2,3,3};
		p2 = "zzzzzdbzda";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"bzacza","dazcaz","zzaazb","zaaazbb","czazzb"};
		p1 = new int[]{1,1,2,3};
		p2 = "zzzzzzb";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
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
