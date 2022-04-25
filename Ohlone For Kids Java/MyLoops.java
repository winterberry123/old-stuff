import java.util.Scanner;

public class myloops {

	public static void main(String[] args) {
////Warm  up
//		int n = (int)(Math.random()*50);
//		int n2 = (int)(Math.random()*50);
//		Scanner input = new Scanner(System.in);
//		System.out.println("Tell the sum of '+n2+'+'+n2'");
//		int total = input.nextInt();
//		if (total==n+n2) {
//			System.out.println("correct");
//		}
//		else {
//			System.out.println("incorrect");
//		}
////Exercise 1 (While Loops)
//		int i = 1;
//		while (i<= 20) {
//			System.out.println(i);
//			i++;
//		int i = 20;
//		while (i >= 0) {
//			System.out.println(i);
//			i--;
//		}
//		}
////Exercise 2 (Break Statements)
//		int i = 20;
//		while (i >= 0) {
//			if (i==10) {
//				break;
//			}
//			System.out.println(i);
//			i--;
//		}
		
////Exercise 3 (Continue Statements)
//		int i = 20;
//		while(i >= 0) {
//			if (i==7) {
//				//// 4 is deducted from i, which is currently 7, so after this line, i is 3.
//				i-=4;
//				////Continue statements re-evaluate loop condition. In this case, loop will be re-evaluated with i containing 3.
//				continue;
//			}
//			System.out.println(i);
//			i--;
//		}
		
////Exercise 4 (Skipping Odd Numbers in While Loops)
//		int i = 20;
//		while (i>=0) {
//			////if remainder of i/2 is 1, the current value of i is an odd number
//			if ((i%2)==1) {
//				////decrementing i, to skip over odd i value
//				i--;
//			}
//			System.out.println(i);
//			i--;
//		}
		
////Exercise 5 (Infinite Loops)
//		int i = 20;
//		while (true) {
//			if (i==10) {
//				break;
//			}
//			System.out.println(i);
//			i--;
//		}
		
////Exercise 6 (infinite loops with scanner)
//		while (true) {
//			Scanner input = new Scanner(System.iµ)×c
//			System.out.println("Tell the sides of shape:");
//			String test = input.next();:/ï±	Ïq//will keep on printing inpu« ‰til "text"is given as input
//			if (test.equals("test")) {
//				rÝWk;
//			}
//			System;o¡ã[„jRntln(test);
//		}
	
////DIY
//		while(true) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("Type your name, or type 'Done' if you want to exit" );
//			String name = input.next();
//			if (name.equals("Done")) {
//				break;
//			}
//			System.out.println("Type your last name");
//			String lastname = input.next();
//			System.out.println(name+" "+lastname);
//		}

////Exercise 7 (For Loops)
		////For loop template: for(initialize iterator;condition;manipulate iterator)
//		for (int i = 0; i <=10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
		
////DIY
//		for (int i = 0; i<=10;i++) {
//			if (i==3) {
//				i+=2;
//				continue;
//			}
//			if (i==7) {
//				break;
//			}
//			System.out.println(i);
//		}
		
////Another DIY
		
//			Scanner input = new Scanner(System.in);
//			System.out.println("How many friends do you have?");
//			int num = input.nextInt();
//			for (int i=1;i<=num;i++) {
//				System.out.println("Tell name of friend"+" "+i);
//				String friend = input.next();
//				System.out.println(friend);
//			}
//		System.out.println("I got all your friends' names. Thanks!");
		
		
	}

}
