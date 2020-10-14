
/*12)input string="hello", n=2
    output: lolo */

public class Program12 {
	public static void main(String[] args) {
		String str = "hello";
		int n = 2;
		String s1 = str.substring(str.length()-n,str.length());//lo
		System.out.println(s1+s1);
		
	}

}
