package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class VK_Cup_2012_QR1_C
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new VK_Cup_2012_QR1_C().run();
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
		ArrayList<String> pwd = new ArrayList<String>();
		pwd.add("/");
		for (int i = 0; i < n; i++) 
		{
			String s = in.next();
			if (s.equals("pwd"))
			{
				for (String t: pwd)
					out.print(t);
				out.println();
			}
			else
			{
				String p = in.next();
				if (p.charAt(0) == '/')
				{
					pwd.clear();
					pwd.add("/");
				}

				String st[] = p.split("/");
				for (String d : st)
					if (d.equals(".."))
					{
						pwd.remove(pwd.size()-1);
						pwd.remove(pwd.size()-1);
					}
					else if (!d.equals(""))
					{
						pwd.add(d);
						pwd.add("/");
					}
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
