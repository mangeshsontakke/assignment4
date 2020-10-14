/*7)Input1=”cowboy”; Output1=”cowcow”;
    Input1=”so”;output1=”sososo”; 
    HINT: if they give 3 letter word u have to display 2 time; */

public class Program07 {

	public static void main(String[] args) {
		String str1 = "so";
		StringBuffer sb = new StringBuffer();
		int flag = 0;
		for(int i=0; i<str1.length(); i++){
			if(str1.length() == 2){
				flag = 1;
			}else if(str1.length() >= 3){
				flag = 2;
			}
		}
		if(flag == 1){
			System.out.println(sb.append(str1).append(str1).append(str1));
		}else{
			System.out.println(sb.append(str1.substring(0,3)).append(str1.substring(0, 3)));
		}
	}
	
}
