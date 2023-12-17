package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM610_Copy_3_of_TheMatrix
{

	public int MaxArea(String[] board)
	{		
		int numRows = board.length;
		int numCols = board[0].length();
		int maxArea = 1;
		
		for (int i1= 0; i1 < numRows; i1++) {
			for (int j1 =0; j1 < numCols; j1++) {
				for (int i2 = i1; i2 < numRows; i2++) {
					for (int j2 = j1; j2 < numCols; j2++) {
						if (chess(i1, j1, i2, j2, board)) {
							int area = (i2-i1+1) * (j2-j1+1);
							maxArea = Math.max(maxArea,area);
						}
					}
				}
			}
		}
		return maxArea;
	}
		
	public boolean chess(int x1, int y1, int x2, int y2, String[] board)
	{
		char o = board[x1].charAt(y1);
		
		for (int i = x1; i <= x2; i++) {
			if (board[i].charAt(y1) != o) return false;
			
			char u = o;
			for (int j = y1; j <= y2; j++) {
				if(board[i].charAt(j) != u) return false;
				u = (u == '1' ? '0' : '1');
			}
			o = (o == '1' ? '0' : '1');
		}
		return true;
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
		SRM610_Copy_3_of_TheMatrix obj;
		int answer;
		obj = new SRM610_Copy_3_of_TheMatrix();
		long startTime = System.currentTimeMillis();
		answer = obj.MaxArea(p0);
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
		p0 = new String[]{"1","0"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"0000"};
		p1 = 1;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"01"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"001","000","100"};
		p1 = 2;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new String[]{"0"};
		p1 = 1;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new String[]{"101","010"};
		p1 = 6;
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = new String[]{"101","011","101","010"};
		p1 = 8;
		all_right = KawigiEdit_RunTest(6, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = new String[]{
				"11001110011000110001111001001110110011010110001011",
				"10100100010111111011111001011110101111010011100001",
				"11101111001110100110010101101100011100101000010001",
				"01000010001010101100010011111000100100110111111000",
				"10110100000101100000111000100001011101111101010010",
				"00111010000011100001110110010011010110010011100100",
				"01100001111101001101001101100001111000111001101010",
				"11010000000011011010100010000000111011001001100101",
				"10100000000100010100100011010100110110110001000001",
				"01101010101100001100000110100110100000010100100010",
				"11010000001110111111011010011110001101100011100010",
				"11101111000000011010011100100001100011111111110111",
				"11000001101100100011000110111010011001010100000001",
				"00100001111001010000101101100010000001100100001000",
				"01001110110111101011010000111111101011000110010111",
				"01001010000111111001100000100010101100100101010100",
				"11111101001101110011011011011000111001101100011011",
				"10000100110111000001110110010000000000111100101101",
				"01010011101101101110000011000110011111001111011100",
				"01101010011111010000011001111101011010011100001101",
				"11011000011000110010101111100000101011011111101100",
				"11100001001000110010100011001010101101001010001100",
				"11011011001100111101001100111100000101011101101011",
				"11110111100100101011100101111101000111001111110111",
				"00011001100110111100111100001100101001111100001111",
				"10001111100101110111001111100000000011110000100111",
				"10101010110110100110010001001010000111100110100011",
				"01100110100000001110101001101011001010001101110101",
				"10110101110100110110101001100111110000101111100110",
				"01011000001001101110100001101001110011001001110001",
				"00100101010001100110110101001010010100001011000011",
				"00011101100100001010100000000011000010100110011100",
				"11001001011000000101111111000000110010001101101110",
				"10101010110110010000010011001100110101110100111011",
				"01101001010111010001101000100011101001110101000110",
				"00110101101110110001110101110010100100110000101101",
				"11010101000111010011110011000001101111010011110011",
				"10010000010001110011011101001110110010001100011100",
				"00111101110001001100101001110100110010100110110000",
				"00010011011000101000100001101110111100100000010100",
				"01101110001101000001001000001011101010011101011110",
				"00000100110011001011101011110011011101100001110111",
				"00110011110000011001011100001110101010100110010110",
				"00111001010011011111010100000100100000101101110001",
				"10101101101110111110000011111011001011100011110001",
				"00101110010101111000001010110100001110111011100011",
				"01111110010100111010110001111000111101110100111011"};
		p1 = 12;
		all_right = KawigiEdit_RunTest(7, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = new String[]{
				"1100111001100011000111100100111011001101011000101111001110011000110001111001001110110011010110001011",
				"1010010001011111101111100101111010111101001110000100101110010101111000001010110100001110111011100011",
				"1110111100111010011001010110110001110010100001000111001110011000110001111001001110110011010110001011",
				"0100001000101010110001001111100010010011011111100000110101101110110001110101110010100100110000101101",
				"1011010000010110000011100010000101110111110101001011001110011000110001111001001110110011010110001011",
				"0011101000001110000111011001001101011001001110010011001110011000110001111001001110110011010110001011",
				"0110000111110100110100110110000111100011100110101000110101101110110001110101110010100100110000101101",
				"1101000000001101101010001000000011101100100110010111001110011000110001111001001110110011010110001011",
				"1010000000010001010010001101010011011011000100000100101110010101111000001010110100001110111011100011",
				"0110101010110000110000011010011010000001010010001011001110011000110001111001001110110011010110001011",
				"1101000000111011111101101001111000110110001110001011001110011000110001111001001110110011010110001011",
				"1110111100000001101001110010000110001111111111011100101110010101111000001010110100001110111011100011",
				"1100000110110010001100011011101001100101010000000111001110011000110001111001001110110011010110001011",
				"0010000111100101000010110110001000000110010000100000110101101110110001110101110010100100110000101101",
				"0100111011011110101101000011111110101100011001011111001110011000110001111001001110110011010110001011",
				"0100101000011111100110000010001010110010010101010000110101101110110001110101110010100100110000101101",
				"1111110100110111001101101101100011100110110001101111001110011000110001111001001110110011010110001011",
				"1000010011011100000111011001000000000011110010110100110101101110110001110101110010100100110000101101",
				"0101001110110110111000001100011001111100111101110011001110011000110001111001001110110011010110001011",
				"0110101001111101000001100111110101101001110000110100101110010101111000001010110100001110111011100011",
				"1101100001100011001010111110000010101101111110110011001110011000110001111001001110110011010110001011",
				"1110000100100011001010001100101010110100101000110000110101101110110001110101110010100100110000101101",
				"1101101100110011110100110011110000010101110110101111001110011000110001111001001110110011010110001011",
				"1111011110010010101110010111110100011100111111011111001110011000110001111001001110110011010110001011",
				"0001100110011011110011110000110010100111110000111100110101101110110001110101110010100100110000101101",
				"1000111110010111011100111110000000001111000010011100110101101110110001110101110010100100110000101101",
				"1010101011011010011001000100101000011110011010001111001110011000110001111001001110110011010110001011",
				"0110011010000000111010100110101100101000110111010100110101101110110001110101110010100100110000101101",
				"1011010111010011011010100110011111000010111110011011001110011000110001111001001110110011010110001011",
				"0101100000100110111010000110100111001100100111000100101110010101111000001010110100001110111011100011",
				"0010010101000110011011010100101001010000101100001100110101101110110001110101110010100100110000101101",
				"0001110110010000101010000000001100001010011001110011001110011000110001111001001110110011010110001011",
				"1100100101100000010111111100000011001000110110111011001110011000110001111001001110110011010110001011",
				"1010101011011001000001001100110011010111010011101100110101101110110001110101110010100100110000101101",
				"0110100101011101000110100010001110100111010100011011001110011000110001111001001110110011010110001011",
				"0011010110111011000111010111001010010011000010110100110101101110110001110101110010100100110000101101",
				"1101010100011101001111001100000110111101001111001100110101101110110001110101110010100100110000101101",
				"1001000001000111001101110100111011001000110001110011001110011000110001111001001110110011010110001011",
				"0011110111000100110010100111010011001010011011000011001110011000110001111001001110110011010110001011",
				"0001001101100010100010000110111011110010000001010011001110011000110001111001001110110011010110001011",
				"0110111000110100000100100000101110101001110101111011001110011000110001111001001110110011010110001011",
				"0000010011001100101110101111001101110110000111011100110101101110110001110101110010100100110000101101",
				"0011001111000001100101110000111010101010011001011011001110011000110001111001001110110011010110001011",
				"0011100101001101111101010000010010000010110111000100110101101110110001110101110010100100110000101101",
				"1010110110111011111000001111101100101110001111000100101110010101111000001010110100001110111011100011",
				"0010111001010111100000101011010000111011101110001100110101101110110001110101110010100100110000101101",
				"0111111001010011101011000111100011110111010011101100101110010101111000001010110100001110111011100011",
				"1010110110111011111000001111101100101110001111000100110101101110110001110101110010100100110000101101",
				"0010111001010111100000101011010000111011101110001100101110010101111000001010110100001110111011100011",
				"0111111001010011101011000111100011110111010011101100101110010101111000001010110100001110111011100011",
				"1100111001100011000111100100111011001101011000101111001110011000110001111001001110110011010110001011",
				"1010010001011111101111100101111010111101001110000100101110010101111000001010110100001110111011100011",
				"1110111100111010011001010110110001110010100001000111001110011000110001111001001110110011010110001011",
				"0100001000101010110001001111100010010011011111100000110101101110110001110101110010100100110000101101",
				"1011010000010110000011100010000101110111110101001011001110011000110001111001001110110011010110001011",
				"0011101000001110000111011001001101011001001110010011001110011000110001111001001110110011010110001011",
				"0110000111110100110100110110000111100011100110101000110101101110110001110101110010100100110000101101",
				"1101000000001101101010001000000011101100100110010111001110011000110001111001001110110011010110001011",
				"1010000000010001010010001101010011011011000100000100101110010101111000001010110100001110111011100011",
				"0110101010110000110000011010011010000001010010001011001110011000110001111001001110110011010110001011",
				"1101000000111011111101101001111000110110001110001011001110011000110001111001001110110011010110001011",
				"1110111100000001101001110010000110001111111111011100101110010101111000001010110100001110111011100011",
				"1100000110110010001100011011101001100101010000000111001110011000110001111001001110110011010110001011",
				"0010000111100101000010110110001000000110010000100000110101101110110001110101110010100100110000101101",
				"0100111011011110101101000011111110101100011001011111001110011000110001111001001110110011010110001011",
				"0100101000011111100110000010001010110010010101010000110101101110110001110101110010100100110000101101",
				"1111110100110111001101101101100011100110110001101111001110011000110001111001001110110011010110001011",
				"1000010011011100000111011001000000000011110010110100110101101110110001110101110010100100110000101101",
				"0101001110110110111000001100011001111100111101110011001110011000110001111001001110110011010110001011",
				"0110101001111101000001100111110101101001110000110100101110010101111000001010110100001110111011100011",
				"1101100001100011001010111110000010101101111110110011001110011000110001111001001110110011010110001011",
				"1110000100100011001010001100101010110100101000110000110101101110110001110101110010100100110000101101",
				"1101101100110011110100110011110000010101110110101111001110011000110001111001001110110011010110001011",
				"1111011110010010101110010111110100011100111111011111001110011000110001111001001110110011010110001011",
				"0001100110011011110011110000110010100111110000111100110101101110110001110101110010100100110000101101",
				"1000111110010111011100111110000000001111000010011100110101101110110001110101110010100100110000101101",
				"1010101011011010011001000100101000011110011010001111001110011000110001111001001110110011010110001011",
				"0110011010000000111010100110101100101000110111010100110101101110110001110101110010100100110000101101",
				"1011010111010011011010100110011111000010111110011011001110011000110001111001001110110011010110001011",
				"0101100000100110111010000110100111001100100111000100101110010101111000001010110100001110111011100011",
				"0010010101000110011011010100101001010000101100001100110101101110110001110101110010100100110000101101",
				"0001110110010000101010000000001100001010011001110011001110011000110001111001001110110011010110001011",
				"1100100101100000010111111100000011001000110110111011001110011000110001111001001110110011010110001011",
				"1010101011011001000001001100110011010111010011101100110101101110110001110101110010100100110000101101",
				"0110100101011101000110100010001110100111010100011011001110011000110001111001001110110011010110001011",
				"0011010110111011000111010111001010010011000010110100110101101110110001110101110010100100110000101101",
				"1101010100011101001111001100000110111101001111001100110101101110110001110101110010100100110000101101",
				"1001000001000111001101110100111011001000110001110011001110011000110001111001001110110011010110001011",
				"0011110111000100110010100111010011001010011011000011001110011000110001111001001110110011010110001011",
				"0001001101100010100010000110111011110010000001010011001110011000110001111001001110110011010110001011",
				"0110111000110100000100100000101110101001110101111011001110011000110001111001001110110011010110001011",
				"0000010011001100101110101111001101110110000111011100110101101110110001110101110010100100110000101101",
				"0011001111000001100101110000111010101010011001011011001110011000110001111001001110110011010110001011",
				"0011100101001101111101010000010010000010110111000100110101101110110001110101110010100100110000101101",
				"1010110110111011111000001111101100101110001111000100101110010101111000001010110100001110111011100011",
				"0010111001010111100000101011010000111011101110001100110101101110110001110101110010100100110000101101",
				"0111111001010011101011000111100011110111010011101100101110010101111000001010110100001110111011100011",
				"1010110110111011111000001111101100101110001111000100110101101110110001110101110010100100110000101101",
				"0010111001010111100000101011010000111011101110001100101110010101111000001010110100001110111011100011",
				"0111111001010011101011000111100011110111010011101100101110010101111000001010110100001110111011100011"};
		p1 = 30;
		all_right = KawigiEdit_RunTest(7, p0, true, p1) && all_right;
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
