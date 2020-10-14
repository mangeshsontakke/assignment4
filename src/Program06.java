
/*6)int[] input={2,1,4,1,2,3,6};
    check whether the input has the sequence of "1,2,3". if so-
    output=true;
    int[] input={1,2,1,3,4,5,8};
    output=false */


public class Program06 {

	public static void main(String[] args) {
		int[] arr={2,1,4,1,2,3,6};
		String temp = "";
		for(int i=0; i<arr.length; i++)
		{
			temp = temp + arr[i];// array covert into temp "2141236"
		}
		if(temp.contains("452"))// check if yes then true otherwise false
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}