
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

	/*1)INPUT1= helloworld
   INPUT2= 2. delete the char,if rpted twice.
   if occurs more than twice,leave the first occurence and delete the duplicate
   O/P= helwrd;
 */
public class Program01 {
	public static void main(String[] args) {
		String str = "helloworld";
		char[] ch = str.toCharArray();//[h, e, l, l, o, w, o, r, l, d]
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;  i<str.length(); i++)
		{
			if(map.containsKey(ch[i]))// if duplicate found
			{
				map.put(ch[i],map.get(ch[i])+1);//l+1, o+1 , l+1
			}else{
				map.put(ch[i], 1);// assign 1 to single character h e ly w r d store in map
			}
		}
		for(Entry<Character, Integer> entry: map.entrySet())
		{
			int count = entry.getValue();// count == 1 always assign in above else
			if(count == 2)// o = 2;
			{
				continue;
			}else{
				System.out.print(entry.getKey());
			}
		}
	}
}



/*    String s1 = "helloworld";
         System.out.println(nonRepeatChar(s1));
	}
	public static String nonRepeatChar(String s1){//s1=helloworld
		StringBuffer sb = new StringBuffer(s1);//10
		  for(int i=0;i < sb.length();i++){// iterate 4 times sb.length 
		     int n=0;
		      for(int j = i+1;j < sb.length();j++)
		        if(sb.charAt(i) == sb.charAt(j)){
		              sb.deleteCharAt(j);
		              n++;
		            }
		        if(n > 0)// if duplicate
		        {
		          sb.deleteCharAt(i);// if duplicate then delete it
		          i--;
		             }
		          }
		            return sb.toString();
 */

