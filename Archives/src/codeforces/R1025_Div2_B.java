package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R1025_Div2_B
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R1025_Div2_B().run();
	}
	
	void run()
	{		
		in = new FastReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}
	
	void solve()
	{
		int t = in.nextInt();
		for (int T = 0; T < t; T++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();						

			int n2 = n, m2 = m;
			if (n - (a-1) > a) {
				n2 = a;
			} else  {
				n2 = n-(a-1);
			} 
			if (m - (b-1) > b) {
				m2 = b;
			} else {
				m2 = m - (b-1);
			}
			
			int bestDuel = Integer.MAX_VALUE;
			
			int duel = 1;
			int orign = n, origm = m;
			n = n2;
			m = origm;			
			while (n > 1) {n=(n+1)/2; duel++;}
			while (m > 1) {m=(m+1)/2; duel++;}
			bestDuel = Math.min(duel, bestDuel);
			
			duel = 1;
			n = orign;
			m = m2;
			while (n > 1) {n=(n+1)/2; duel++;}
			while (m > 1) {m=(m+1)/2; duel++;}
			bestDuel = Math.min(duel, bestDuel);
			
			out.println(bestDuel);
		}
	}

	//-----------------------------------------------------
	void runWithFiles() {
		in = new FastReader(new File("input.txt"));
		try {
			out = new PrintWriter(new File("output.txt"));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		solve();
		out.close();
	}
	
	class FastReader
	{
	    BufferedReader br;
	    StringTokenizer tokenizer;
	    
	    public FastReader(InputStream stream)
	    {
	        br = new BufferedReader(new InputStreamReader(stream));
	        tokenizer = null;
	    }
		public FastReader(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
				tokenizer = null;
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	    
	    private String next() {
	        while (tokenizer == null || !tokenizer.hasMoreTokens())
	            try {
	            	tokenizer = new StringTokenizer(br.readLine());
	            }
	            catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        return tokenizer.nextToken();
	    }
		public String nextLine() {
			try	{
				return br.readLine();
			}
			catch(Exception e) {
				throw(new RuntimeException());
			}
		}

	    int nextInt() {
	        return Integer.parseInt(next());
	    }
	    long nextLong() {
	        return Long.parseLong(next());
	    }
	    double nextDouble() {
	        return Double.parseDouble(next());
	    }	    
	    BigInteger nextBigInteger() {
	        return new BigInteger(next());
	    }
	    BigDecimal nextBigDecimal() {
	        return new BigDecimal(next());
	    }
	}
}
