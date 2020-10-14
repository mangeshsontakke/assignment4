

/*19) In a string check whether all the vowels are present
    if yes return 1 else 2.
    ex: String 1="education"
        output=1. */

public class Program19 {
	public static void main(String[] args) {
		String str1 = "Edcation";
		boolean b = false;
		String str = str1.toLowerCase();// 
		
			if(str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u"))
			{
				b = true;
			}else{
				b = false;
			}
		
		if(b == true)
		{
			System.out.println(1);
		}else
		{
			System.out.println(2);
		}
	}
}