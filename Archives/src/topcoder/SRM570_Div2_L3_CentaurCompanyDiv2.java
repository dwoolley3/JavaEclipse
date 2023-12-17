package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


class Node
{
    public Node()
    {
        Nodes = new ArrayList<Node>();
    }
    public void Add(Node n)
    {
        Nodes.add(n);
    }
    public ArrayList<Node> Nodes;
}

public class SRM570_Div2_L3_CentaurCompanyDiv2
{
	public long count(int[] a, int[] b)
	{
        Node[] s = new Node[a.length + 1];

        for (int i = 0; i < s.length; i++)
            s[i] = new Node();

        for (int i = 0; i < a.length; i++)
        {
            s[a[i] - 1].Add(s[b[i] - 1]);
            s[b[i] - 1].Add(s[a[i] - 1]);
        }

        CutNodes(s[0]);
        long[] res = CountNodes(s[0]);
        return res[0] + res[1];	
	}
    private long[] CountNodes(Node root)
    {
        long[] res = new long[] { 1, 1 };
        for (Node n : root.Nodes)
        {
            long[] nRes = CountNodes(n);
            res[0] += nRes[0] + nRes[1] - 1;
            res[1] *= (nRes[1] + 1);
        }
        return res;
    }
    void CutNodes(Node root)
    {
        for (Node n : root.Nodes)
        {
            n.Nodes.remove(root);
            CutNodes(n);
        }
    }    
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, long p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
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
		SRM570_Div2_L3_CentaurCompanyDiv2 obj;
		long answer;
		obj = new SRM570_Div2_L3_CentaurCompanyDiv2();
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
		
		int[] p0;
		int[] p1;
		long p2;
		
		// ----- test 0 -----
		p0 = new int[]{1};
		p1 = new int[]{2};
		p2 = 4L;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{2,2};
		p1 = new int[]{1,3};
		p2 = 7L;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{1,2,3,4,5,6,7,8,9};
		p1 = new int[]{2,3,4,5,6,7,8,9,10};
		p2 = 56L;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		p1 = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
		p2 = 1125899906842675L;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{10,7,2,5,6,2,4,9,7};
		p1 = new int[]{8,10,10,4,1,6,2,2,3};
		p2 = 144L;
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
