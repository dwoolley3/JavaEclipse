package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R303_Div2_C
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R303_Div2_C().run();
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
		int n = in.nextInt();
		
		int[] x = new int[n];
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			h[i] = in.nextInt();
		}		
		int fell = 1, prevdir = -1;

		for (int i = 1; i < n; i++) {
			if (i == n-1) 
				fell++; //dir = 1
			else if (prevdir != 1 && h[i] < x[i] - x[i-1])
			{
				fell++;
				prevdir = -1;
			} else if (prevdir == 1 && h[i] < x[i] - x[i-1] - h[i-1])
			{
				fell++;
				prevdir = -1;
			} else if (x[i] + h[i] < x[i+1])
			{
				fell++;
				prevdir = 1;
			}
			else
				prevdir = 0;
		}
		
		out.println(fell);		
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
