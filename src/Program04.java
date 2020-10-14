
/*4)String array will be given.
if a string is Prefix of an any other string in that array means count.
Resolve this program please check as per program said skip prefix and count others*/

public class Program04 {
	
	public static void main(String[] args) {
		String str = "Sangesh Shivani Samlesh Snehal Sngel";
		String check = "S";
		String[] arr = str.split(" ");
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++)
		{ 
			if(!arr[i].contains(check))
			{
				count++;
			}
		}
		if(count >= 1)
		System.out.println(count);
		else
		System.out.println("Given String not present in String");
	}
}