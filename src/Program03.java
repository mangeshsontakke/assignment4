
//3)Input1=”Hello World”;  output-------à  “dello WorlH”.

public class Program03 {

	public static void main(String[] args) {
		String str = "Mangesh Sontakke";
		StringBuffer sb = new StringBuffer();
		  
          sb.append(str.substring(str.length()-1));//d
          sb.append(str.substring(1, str.length()-1));//dello Worl
          sb.append(str.substring(0, 1));// dello WorlH
          System.out.println(sb.toString());
	}

}
