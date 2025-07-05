package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R1027_Div3_F
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R1027_Div3_F().run();
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
			int x = in.nextInt();
			int y = in.nextInt();
			int k = in.nextInt();
			
			ArrayList<Integer> pfx = new ArrayList<Integer>();
			ArrayList<Integer> pfy = new ArrayList<Integer>();
			HashMap<Integer, Integer> pfxCnt = new HashMap<Integer,Integer>();
			HashMap<Integer, Integer> pfyCnt = new HashMap<Integer,Integer>();
			int x2 = x, y2 = y;
			for (int i = 2; i <= x2; i++) {
				if (x2 % i == 0) {
					pfx.add(i);
					int cnt = pfxCnt.containsKey(i) ? pfxCnt.get(i) : 0;
					pfxCnt.put(i, cnt + 1);
					x2 /= i;
					i--;
				}
			}
			for (int i = 2; i <= y2; i++) {
				if (y2 % i == 0) {					
					pfy.add(i);
					int cnt = pfyCnt.containsKey(i) ? pfyCnt.get(i) : 0;
					pfyCnt.put(i, cnt + 1);
					y2 /= i;
					i--;
				}
			}
			int op = 0;
			boolean impossible = false;
			for (int i = 0; i < pfx.size(); i++) {
				Integer ex = pfx.get(i);
				if (pfy.contains(ex)) {
					int dif = Math.max(pfyCnt.get(ex) - pfxCnt.get(ex), 0);
					if (dif > 0) {
						if (ex <= k) {
							op += dif;
						} else {
							impossible = true;
						}
					}
				}
				else { // if (!pfy.contains(ex)) 
					if (ex <= k) {
						op++;
					} else {
						impossible = true;
					}
				} 
			}
			for (int i = 0; i < pfy.size(); i++) {
				Integer ey = pfy.get(i);
				if (pfx.contains(ey)) {
					int dif = Math.max(pfxCnt.get(ey) - pfyCnt.get(ey), 0);
					if (dif > 0) {
						if (ey <= k) {
							op += dif;
						} else {
							impossible = true;
						}
					}
				} else { // if (!pfx.contains(ey)) {
					if (ey <= k) {
						op++;
					} else {
						impossible = true;
					}
				}
			}
			if (impossible) {
				out.println(-1);
			} else {			
				out.println(op);
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
