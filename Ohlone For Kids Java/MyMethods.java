import java.util.Scanner;

public class MyMethods {

////Warm up
//		String toys = "";
//		while (true) {
//			System.out.println("name of toy or done");
//			Scanner input = new Scanner(System.in);
//			String toy = input.next();
//			if (toy.equals("done")) {
//				break;
//			}
//			toys = toys+" "+toy;}
//		System.out.println("you have toys : "+toys);
				
	
//// Ex 1 (Static Methods)
	////the static modifier allows this method to be called without instantiating the object
	////methods with a static modifier are referred to static methods or class methods
	////the void return type declares that this method does not return anything
//		static void speak () {
//			System.out.println("Hello World");
//		}
//		public static void main(String[]args) {
//			speak();
//		}
		
	
//// Ex 2 (methods with return types)
//		static int number() {
//			return 4;
//		}
//		static double  doubleNumber() {
//			return 4.5;
//		}
//		static String myString() {
//			return "Hello World";
//		}
//		static boolean myBoolean() {
//			return true;
//		}
//		public static void main(String[] args) {
//			int num = number();
//			System.out.println(num);
//			double dNum = doubleNumber();
//			System.out.println(dNum);
//			String myStr = myString();
//			System.out.println(myStr);
//			boolean value = myBoolean();
//			System.out.println(value);
//		}
		////this prints out 4,4.5,Hello World, and true in the console

	
////Ex 3 (using variables in static methods)
//		static int num1 = 25;
//		static int num2 = 10;
//		static int myMath() {
//			return num1 + num2;
//		}
//		public static void main(String[] args) {
//			int total = myMath();
//			System.out.println(total);
//		}
	   ////prints out 35
	
	
////DIY 
//	static int width = 25;
//	static int height = 10;
//	static int myMath() {
//		retur¹ «Xt˜4height;
//	}
//	public static void main(String[]args) {
//		int total = myMath();
//		System.out.println(total);
//	}
	
ƒ"_žspzEx 4 (parameters and arguments)
//	static int myMath(int num1, int num2) {
//		return num1 + num2;
//	}
//	public static void main(String[] args) {
//		int total = myMath(25,10);
//		System.out.println(total);
//	}
		
		
//// Ex 5 (parameters and arguments with string)
//	static String myString(String name, String greet) {
//		return greet +" "+name;
//	}
//	public static void main(String[]args) {
//		String Greeting = myString("John","Hello");
//		System.out.println(Greeting);
//	}
		//// Hello John should be printed in console
		
		
//// DIY
//	static double myCube(double width, double height, double length) {
//		return width*height*length;
//	}
//	////main method has to be String[]args
//	public static void main(String[] args) {
//		double area = myCube(10,3,30);
//		System.out.println(area);
//	}
	
	
//// Ex 6 (Global and Local Variables)
//	static int num = 30;
//	static int num2 = 30;
//	public static void numChange() {
//		////changing the global variable. we are manipulating a class variable via a class method.
//		num = 40;
//		System.out.println("Global variable num:" +num);
//		////this is local variable. They can have the same name as global variables. 
//		////This variable cannot be directly manipulated by any calls outside this method.
//		int num2 = 40;
//		System.out.println("Local variable num2:" + num2);
//	}
//	public static void main(String[]args) {
//		numChange();
//		System.out.println("Num"+num);
//		System.out.println("Num2"+num2);
//	}
	
	
//// Ex 7 (global and local variables)
	////these variables have 2 names: global variable(not being created inside a method)
	////class variable(due to a static modifier)
//		static int num = 30;
//		static int num2 = 30;
//		public static void total () {
//			////adding static variables to get total
//			int total = num+num2;
//			System.out.println("Âo¬8s •| " +total);
//		}
//		public static void main(String[]args) {
//			////executing total function
//			total();
//		}
	////¥"àÇ‡ÁWZis 60" will print
	
	
//// Ex 8 (using scanner in a method)
//	public static void total() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a num");
//		int num1 = input.nextInt();
//		System.out.println("Enter a num");
//		int num2 = input.nextInt();
//		int total = num1 + num2;
//		System.out.println("Total is " + total);
//	}
//	public static void main(String[]args) {
//		total();
//	}
	
	
//// DIY
//	public static void total() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number of pizzas:");
//		int pizza = input.nextInt();
//		System.out.println("Enter the number of burgers:");
//		int burger = input.nextInt();
//		int total = pizza*6+burger*3;	
//		System.out.println("Your total is:"+total);
//	}
//	public static void main(String[]args) {
//		total();
//	}
	
	
	
		
		
		
		
		
		
		
}
