import java.util.StringTokenizer;

/*5)count the number of words in the string
	    Input string="i work in cognizant.";
	    output=4; */

public class Program05 {
	
		public static void main(String[] args) {
		String s="i work in cognizant.";
	   StringTokenizer st=new StringTokenizer(s," ");
	   System.out.println(st.countTokens());
		
	
	}

}
