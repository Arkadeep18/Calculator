import java.util.*;
public class Assignment6_1 {

	public static int additionSimple(int x,int y) {
		return x+y;
	}
	public static int subtractionSimple(int x,int y) {
		return x-y;
	}
	public static int multiplicationSimple(int x,int y) {		//Method input
		return x*y;
	}
	public static double divisionSimple (int x,int y) {
		return x/y;
	}
	public static int remainderSimple (int n,int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		return Math.sqrt(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");						//Taking user input and a,b refers to x,y/m,n
		int b = sc.nextInt();
		System.out.println("Enter what you wanna perform");
		String ch = sc.next();
		
	switch(ch) {													//getting from the user which particular operation he wants to do
	case "+" : System.out.println(additionSimple(a, b));
	break;
	case "-" : System.out.println(subtractionSimple(a, b));
	break;
	case "*" : System.out.println(multiplicationSimple(a, b));
	break;
	case "/" : System.out.println(divisionSimple(a, b));
	break;
	case "%" : System.out.println(remainderSimple(a, b));
	break;
	case "r" : System.out.println(squareRootSimple(b));
	break;
	}

}
}
