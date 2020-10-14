

/*2)input="hello"
    output="hlo"; Alternative positions...
 */
public class Program02 {

	public static void main(String[] args) {
		String str = "hello";
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length();i++)// length = 5
		{
			if(i%2==0)// for alternate i use even position
			{
				sb.append(str.charAt(i));//hlo
			}
		}System.out.println(sb.toString());
	}
}
