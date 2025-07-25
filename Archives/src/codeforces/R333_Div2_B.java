package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R333_Div2_B
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R333_Div2_B().run();
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
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
			a[i] = in.nextInt();
		
		int longest = 1;
		int min = a[0], max = a[0], cnt = 1;
		int lastInd = 0;
		for (int i = 1; i < n; i++)
		{
			if (a[i] != a[i-1])
			{
				if (min == max)
				{
					cnt++;
					if (a[i] < min) 
						min = a[i];
					else
						max = a[i];
				}
				else
				{
					if (a[i] < min)
					{
						longest = Math.max(longest,cnt);
						cnt = i - lastInd + 1;
						min = a[i];
						max = a[i]+1;
					}
					else if (a[i] > max)
					{
						longest = Math.max(longest,cnt);
						cnt = i - lastInd + 1;
						max = a[i];
						min = a[i]-1;
					}
					else cnt++;
				}
				lastInd = i;
			}
			else
				cnt++;
			longest = Math.max(longest,cnt);
		}
		out.println(longest);		
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
