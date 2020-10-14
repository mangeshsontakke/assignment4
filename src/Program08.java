
import java.util.Scanner;

/*8) input---input1=1;
            input2=4;
            input3=1;
    output1=4;
    operation--- print the element which is not repeated    
    if all the inputs r different sum all inputs
    input---input1=1;
            input2=2;
            input3=3;
    output1=6;
 */
public class Program08 {

	public static void main(String[] args) {
		//int a = 1, b = 4 , c = 1 , add = 0;
		//int a = 1, b = 2 , c = 3 , add = 0;
		int a , b , c , add = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input1: ");
		a = sc.nextInt();
		System.out.println("Input2: ");
		b = sc.nextInt();
		System.out.println("Input3: ");
		c = sc.nextInt();
		if(a != b && b != c && c != a){
			add = add + a + b + c;
		}else if(a == c && a != b)
			add = add + b;
		else if(a == b && a != c)
			add = add + c;
		else if(b == c && b != a)
			add = add + a;
		else
			System.out.println("all are same: " +a);
		System.out.println(add);

	}

}
