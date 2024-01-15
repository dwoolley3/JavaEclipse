package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R920_Div3_D2
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R920_Div3_D2().run();
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
			
			int[] a = new int[n];
			for (int i = 0; i < n; i++) 
				a[i] = in.nextInt();
			
			int[] b = new int[m];
			for (int i = 0; i < m; i++) 
				b[i] = in.nextInt();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			long dif = 0;
			int left = 0, right = m-1, ai;
			int aleft = 0, aright = n-1;
			for (int i = 0; i < n; i++) {
				if (aleft%2 == 0) 
					ai = a[aleft/2]; 
				else 
					ai = a[n-1 - (aleft/2)];
				int le1 = Math.abs(ai - b[left]);
				int ri1 = Math.abs(ai - b[right]);
				
				if (aright%2 == 0) 
					ai = a[aright/2]; 
				else 
					ai = a[n-1 - (aright/2)];
				int le2 = Math.abs(ai - b[left]);
				int ri2 = Math.abs(ai - b[right]);
				
				if (le1 > ri1 && le1 > le2 && le1 > ri2) {
					aleft++;
					left++;
					dif += le1;
				}
				else if (ri1 > le1 && ri1 > le2 && ri1 > ri2) {
					aleft++;
					right--;
					dif += ri1;
				}
				else if (le2 > ri1 && le2 > le1 && le2 > ri2) {
					aright--;
					left++;
					dif += le2;
				}
				else {
					aright--;
					right--;
					dif += ri2;
				}
			}

			out.println(dif);
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
