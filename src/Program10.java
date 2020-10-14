
/*10)input --String input1 ="xaXafxsd"
    output--String output1="aXafsdxx"
    operation-- remove the character "x"(only lower case) from string and place at the end
 */
public class Program10 {
	
	public static void main(String[] args) {
		String str="xaXafxsd";
		StringBuffer sb=new StringBuffer(str);
		int j=0;
		
		for(int i=0;i<sb.length();i++)// 
			if(sb.charAt(i)=='x')
			{
				sb.deleteCharAt(i);// remove first x into string
				j++;// count how many time remove x into string
			}
		for(int i=0;i<j;i++)// 
			sb.append('x');// append x at end as per count	
			System.out.println(sb.toString());
		}
}
	
