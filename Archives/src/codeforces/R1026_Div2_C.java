package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R1026_Div2_C
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R1026_Div2_C().run();
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
			
			int[] d = new int[n];
			for (int i = 0; i < n; i++) {
				d[i] = in.nextInt();
			}
			int[] l = new int[n];
			int[] r = new int[n];
			int min = 0, max = 0;
			int ans = 0;
			for (int i = 0; i < n; i++) {
				l[i] = in.nextInt();
				r[i] = in.nextInt();
				if (d[i] == -1) {
					max++;
				} else if (d[i] == 1) {
					min++;
					max++;
				} else //d[i] == 0
				{}
				if (l[i] < min && r[i] >= min && r[i] <= max) {
					min = l[i];ans = -1;
				}
			}
			
			if (ans == -1) {
				out.println(-1);
			} else {
				out.println(n);
			}
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
