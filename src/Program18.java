
/*18) i/p: Honesty is my best policy
    o/p: Honesty
    Return the maximum word length from the given string.
    If there are two words of same length then,
    return the word which comes first based on alphabetical order.
 */
public class Program18 {
	public static void main(String[] args) {

		// only require alphabetic order traversing
		
		String str = "mangeshsontakke is my best policy";
		String[] words = str.toLowerCase().split(" ");// length = 5
		String value = null;
		int max = 0, len = 0;
		
		for (int i = 0; i < words.length-1; ++i) 
		{
			for(int j= i+1; j< words.length; ++j)
				{
				if (words[i].compareTo(words[j]) > 0)// Honesty length = 7
					{
						String temp = words[i];//Honesty
						words[i] = words[j];
						words[j] = temp;
					}
				}
		}
		
		for(int i=0; i<words.length-1;  i++)
		{
			int size = words[i].length();
			if(max < size)
			{
			value = words[i];
			len = value.length();
			max = len;
			}
		}System.out.println(value);
	}
}