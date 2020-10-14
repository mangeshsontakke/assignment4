

/*17)concat two string if length of two string is equal.
    if length of one string is greater, then remove the character from 
    largest string and then add. The number of characters removed from 
    largest string is equal to smallest string's length
    for example: input 1="hello";
                 input 2="helloworld";
                 output="worldhello";
 */

public class Program17 {
	public static void main(String[] args) {
		// debug self
		String str1 = "hello";
		String str2 = "helloworld";
		String ans = "";
		
		if(str1.length() == str2.length())
		{
			ans = str1.concat(str2);
		}else if(str1.length()>str2.length())// if 1st str is greater then remove small str add them at end
		{
			ans = str1.substring(str2.length(), str1.length()).concat(str2);
						
		}else if(str1.length() < str2.length())// if 2nd str is greater then remove small str add them at end
		{
			ans = str2.substring(str1.length(), str2.length()).concat(str1);
		}
		System.out.println(ans);
	}
}
