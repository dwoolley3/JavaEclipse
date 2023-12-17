//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class dfs_SRM578_Div1_L1_GooseInZooDivOne
{
    boolean[][] u = new boolean[55][55];
    int d;
    int cnt, r, c;
    String[] f;
    int MOD = (int)1e9 + 7; // 1000000007;
    
	public int count(String[] field, int dist)
	{
        f = field;
        r = f.length;
        c = f[0].length();
        d = dist;
        int e = 0, o = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
            {
                if (f[i].charAt(j) == 'v' && !u[i][j])
                {
                    cnt = dfs(i, j);
                    if (cnt % 2 == 0) e++; else o++;
                }
            }

        int ans = 1;
        for (int i = 0; i < e; i++)   ans = (ans*2) % MOD;
        //Subtract 1 from odd; 1 set is predetermined based on # of 
        //odd sets having geese; if even # then set has no geese;
        //if odd # then set has geese to make total geese even.
        for (int i = 0; i < o-1; i++) ans = (ans*2) % MOD;
        ans--;
        if (ans < 0) ans += MOD;
        return ans;
	}
	
    public int dfs(int x, int y)
    {
        if (u[x][y]) return 0;
        u[x][y] = true;
        cnt = 1;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (f[i].charAt(j) == 'v' && !u[i][j])
                {
                    int dd = Math.abs(x - i) + Math.abs(y - j);
                    if (dd <= d) 
                        cnt += dfs(i, j);
                }
        return cnt;
    }
    
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, int p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}" + "," + p1);
		System.out.println("]");
		dfs_SRM578_Div1_L1_GooseInZooDivOne obj;
		int answer;
		obj = new dfs_SRM578_Div1_L1_GooseInZooDivOne();
		long startTime = System.currentTimeMillis();
		answer = obj.count(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p2);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p2;
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
		int p2;
		
		// ----- test 0 -----
		p0 = new String[]{"vvv"};
		p1 = 0;
		p2 = 3;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"."};
		p1 = 100;
		p2 = 0;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"vvv"};
		p1 = 1;
		p2 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"v.v..................v............................",".v......v..................v.....................v","..v.....v....v.........v...............v......v...",".........vvv...vv.v.........v.v..................v",".....v..........v......v..v...v.......v...........","...................vv...............v.v..v.v..v...",".v.vv.................v..............v............","..vv.......v...vv.v............vv.....v.....v.....","....v..........v....v........v.......v.v.v........",".v.......v.............v.v..........vv......v.....","....v.v.......v........v.....v.................v..","....v..v..v.v..............v.v.v....v..........v..","..........v...v...................v..............v","..v........v..........................v....v..v...","....................v..v.........vv........v......","..v......v...............................v.v......","..v.v..............v........v...............vv.vv.","...vv......v...............v.v..............v.....","............................v..v.............." +
				"...v",".v.............v.......v..........................","......v...v........................v..............",".........v.....v..............vv..................","................v..v..v.........v....v.......v....","........v.....v.............v......v.v............","...........v....................v.v....v.v.v...v..","...........v......................v...v...........","..........vv...........v.v.....................v..",".....................v......v............v...v....",".....vv..........................vv.v.....v.v.....",".vv.......v...............v.......v..v.....v......","............v................v..........v....v....","................vv...v............................","................v...........v........v...v....v...","..v...v...v.............v...v........v....v..v....","......v..v.......v........v..v....vv..............","...........v..........v........v.v................","v.v......v................v....................v..",".v........v............................." +
				"...v......","............................v...v.......v.........","........................vv.v..............v...vv..",".......................vv........v.............v..","...v.............v.........................v......","....v......vv...........................v.........","....vv....v................v...vv..............v..","..................................................","vv........v...v..v.....v..v..................v....",".........v..............v.vv.v.............v......",".......v.....v......v...............v.............","..v..................v................v....v......",".....v.....v.....................v.v......v......."};
		p1 = 3;
		p2 = 898961330;
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
