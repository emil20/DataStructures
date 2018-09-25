package strings;

public class ReverseString {
    //pass an input string
   public static void main(String[] args) {
      String s = args[0];

      char[] c = s.toCharArray();
      int n = c.length - 1;
      for(int i = 0; i <= n/2; i++) {
//	System.out.print(c[i]+" "+c[n-i]);
	if(c[i] == c[n-i]) 
          continue;
         c[i] = (char) (c[i] ^ c[n-i]);
	 c[n - i] = (char) (c[i] ^ c[n - i]);
         c[i] = (char) (c[i] ^ c[n - i]);
//	System.out.println(c[i]+" "+c[n-i]);
      }
	System.out.println(new String(c));
   }

}