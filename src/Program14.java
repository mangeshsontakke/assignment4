
import java.util.Scanner;

/*14)Validate Password
validation based on following criteria:
-> minimum length is 8
-> should contain any of these @/_/#
-> should not start with number/special chars(@/#/_)
-> should not end with special chars
-> can contain numbers,letters,special chars
*/


public class Program14 {
    public static void main(String args[]) {  
	         
	        Scanner input=new Scanner(System.in);
			System.out.println("Enter a Password:  ");
			String s=input.nextLine();
			//String s="PaSS#30m";
			
			boolean b1=false;
			if(s.length()>=8){
			char c=s.charAt(0);
			
			char cc=s.charAt(s.length()-1);
			if(Character.isDigit(c)){
				b1=false;
			}else{
				if(c=='@' || c=='_' || c=='#'){
					if(cc=='@' || cc=='_' || cc=='#'){
					b1=false;
					} 
				}	
					
			else{
						b1=true;
					 }

			}	
			}
			
			if(b1==true)
				System.out.println("valid password");
			else
				System.out.println("Invalid password");

	        
	    }
}
	
