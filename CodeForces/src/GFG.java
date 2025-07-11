// Java program to calculate SHA-512 hash value
  
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
  
public class GFG {
    public static String encryptThisString(String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");
  
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
  
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
  
            // return the HashText
            return hashtext;
        }
  
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Driver code
    public static void main(String args[]) throws NoSuchAlgorithmException
    {
  
        System.out.println("HashCode Generated by SHA-512 for: ");
  
        String s1 = "GeeksForGeeks";
        System.out.println("\n" + s1 + " : " + encryptThisString(s1));
  
        String s2 = "hello world";
        System.out.println("\n" + s2 + " : " + encryptThisString(s2));
        
        // Generate authentication values for Codeforces API's (that require authentication)
        // Also https://emn178.github.io/online-tools/sha512.html can be used to convert to SHA512
		String timeString = System.currentTimeMillis()/1000 + ""; // 1659877427
		System.out.println("\n" + "timeInMillsDiv1000 = " + timeString);
		String apiKey = "986abe046df92a7279940006c48f478e98077aef";
		String secret = "5cfda8adebdf0355d7b51288811813e79ac18dc0";
		String sha512Hex = "654321/user.friends?apiKey="+apiKey+"&onlyOnline=false&time="+timeString+"#"+secret;
		
		System.out.println("\n" + sha512Hex + " : \n" + encryptThisString(sha512Hex));
    }
}