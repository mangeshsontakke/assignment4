

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/*9)input1-- Hello*world
    output-- boolean(true or false)
    operation-- if the character before and after * are same return true else false
                if there in no star in the string return false(Ignore case)
 */

public class Program09 {
	public static void main(String[] args)throws NoSuchElementException {
		String str = "Hello*yrld";
		StringTokenizer st = new StringTokenizer(str,"*");
		String s1 = st.nextToken();//Hello
		String s2 = st.nextToken();//world
		String s3 = s1.substring(s1.length()-1);// pointing to the 'o'
		String s4 = s2.substring(0,1);//w
		boolean b = false;
		
		if(s3.contains(s4.toLowerCase()))// for ignore case i use here toLowerCase()
			b = true;
		else
			b = false;
		System.out.println(b);
	}

}
