package princeton;

/*************************************************************************
 *  Compilation:  javac PerfectBalance.java
 *  Execution:    java PerfectBalance < input.txt
 *  
 *  Read sequence of strings from standard input (no duplicates),
 *  and insert into a BST so that BST is perfectly balanced.
 *
 *  % java PerfectBalance
 *  P E R F C T B I N A R Y S R H 
 *  N E B A C H F I R R P R T S Y 
 *
 *************************************************************************/

import java.util.Arrays;

public class PerfectBalance {

    // precondition: a[] has no duplicates
    private static void perfect(BST bst, String[] a) {
        Arrays.sort(a);
        perfect(bst, a, 0, a.length - 1);
        StdOut.println();
    }

    // precondition: a[lo..hi] is sorted
    private static void perfect(BST bst, String[] a, int lo, int hi) {
        if (hi < lo) return;
        int mid = lo + (hi - lo) / 2;
        bst.put(a[mid], mid);
        StdOut.print(a[mid] + " ");
        perfect(bst, a, lo, mid-1);
        perfect(bst, a, mid+1, hi);
    }

    public static void main(String[] args) {
        String[] words = {"a","b","daa","da","es","s","ba"}; //StdIn.readAllStrings();
        BST<String, Integer> bst = new BST<String, Integer>();
        perfect(bst, words);
    }
}
