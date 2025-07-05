package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R1027_Div3_D
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R1027_Div3_D().run();
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
			
			int[] x = new int[n];
			int[] y = new int[n];
			int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE, maxx=0, maxy = 0;
			int minx2 = Integer.MAX_VALUE, miny2 = Integer.MAX_VALUE, maxx2=0, maxy2 = 0;
			
			for (int i = 0; i < n; i++) { 
				x[i] = in.nextInt();
				y[i] = in.nextInt();
				if (x[i] <= minx) {
					minx2 = minx;
					minx = x[i];					
				} else {
					if (x[i] < minx2) minx2 = x[i];
				}
				if (y[i] <= miny) {
					miny2 = miny;
					miny = y[i];					
				} else {
					if (y[i] < miny2) miny2 = y[i];
				}
				
				if (x[i] >= maxx) {
					maxx2 = maxx;
					maxx = x[i];					
				} else {
					if (x[i] > maxx2) maxx2 = x[i];
				}
				if (y[i] >= maxy) {
					maxy2 = maxy;
					maxy = y[i];					
				} else {
					if (y[i] > maxy2) maxy2 = y[i];
				}
			}
			
			long area, minArea = Long.MAX_VALUE;
			if (n == 1) {
				out.println(1);
			} else {		
				for (int i = 0; i < n; i++) { 
					int minx3 = minx, maxx3 = maxx, miny3 = miny, maxy3 = maxy;
					if (x[i] == minx) {
						minx3 = minx2;
					}
					if (x[i] == maxx) {
						maxx3 = maxx2;
					}
					if (y[i] == miny) {
						miny3 = miny2;
					}
					if (y[i] == maxy) {
						maxy3 = maxy2;
					}
					int xLen = (maxx3 - minx3) + 1;
					int yLen = (maxy3 - miny3) + 1;
					area = 1L * xLen * yLen;
					if (area < n) {
						if (xLen > yLen) {
							area = 1L * (xLen + 1) * yLen;
						} else {
							area = 1L * xLen * (yLen + 1);
						}								
					}						
					minArea = Math.min(minArea, area);
				}
				out.println(minArea);				
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
