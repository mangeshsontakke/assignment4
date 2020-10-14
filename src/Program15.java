
/*15) pan card number validation:
    all letters shud be in caps,shud be of 10 chars.
    first five letters must be alphabets.
    next 4 letters shud be digits and last letter shud be an alphabet
 *///ifelse

public class Program15 {
	public static void main(String[] args) {
		String panNum = "ABCDgggE1234P";
		PanCardValidation(panNum);
	}
	public static void PanCardValidation(String pan)
	{
		if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))// use regular expression for validation
		{
			System.out.println("PAN CARD Valid");
		}
		else
		{
			System.out.println("PAN CARD Invalid");
		}
	}
	
	
}
