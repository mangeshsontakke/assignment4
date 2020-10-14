
/*20)swap the every 2 chrecters in the given string 
    If size is odd number then keep the last letter as it is.
    Ex:- input: forget
	 output: ofgrte
    Ex:- input  : NewYork
         output : eNYwrok
 */
	public class Program20 {
	public static String swap(String str ,int i ,int j){
		StringBuffer sb = new StringBuffer(str);
		sb.setCharAt(i,str.charAt(j));
		sb.setCharAt(j, str.charAt(i));
		return str.toString();
		
	}
	public static void main(String[] args) {
	
		//String str = "NewYork";
		String str = "forget";
		StringBuffer sb = new StringBuffer();
		int len = str.length();
		
		if(len%2 == 0)// for even string
		{
			for(int i=0; i<str.length()-1; i=i+2)//forget
			{
				char a = str.charAt(i);//0,2,4   f r e
				char b = str.charAt(i+1);//o g t
				sb.append(b).append(a);//ofgrte
			}System.out.println(sb);
		}else// for odd string
		{
			for(int i=0; i<str.length()-1; i=i+2)// 0,2.4 NewYork
			{
				char a = str.charAt(i);//N w o
				char b = str.charAt(i+1);//e Y r
				sb.append(b).append(a);//eNYwro
			}
			sb.append(str.charAt(len - 1));//eNYwrok
			System.out.println(sb);
		}
	}
}