import java.util.*;
public class MyArrayandArrayList {
	
	
////Warm up
//		public static int cube(int num) {
//			int cube_number = num*num*num;
//			return cube_number;}
//			public static void main(String[]args) {
//				System.out.println("cube is "+cube(10));
//			}

	public static void main(String[]args) {
//// Ex 1 (creating an array, populating it, and using a loop to print contents)
	////format of creating list: datatype[]name=new datatype[size]
//	int[] MyList = new int [5];
//	MyList[0] = 12;
//	MyList[1] = 13;
//	MyList[2] = 14;
//	MyList[3] = 15;
//	MyList[4] = 16;
//	for(int x = 0; x < MyList.length; x++) {
//		System.out.println(MyList[x]);
//	}
	
		
		
//// Ex 2 (populating an array using one statement)
//		int[] MyList = {12,13,14,15,16};
//		for (int x = 0; x < MyList.length; x++) {
//			System.out.println(MyList[x]);
//		}
		
		
//// Ex 3 (using a for each loop to access the elements of an array)
//		int[] MyList = {12,13,14,15,16};
//		for (int x : MyList) {
//			System.out.println(x);
//		}
		
	
//// Ex 4 (arraylist method exploration)
//		ArrayList<String>al = new ArrayList<String>();
//		System.out.println("Initial size of al: "+al.size());
//		al.add("c");
//		al.add("A");
//		al.add("E");
//		al.add("D");
//		al.add("F");
//		
//		//adding values by specifying index
//		al.add(1,"A2");
//		
//		//checking size of array
//		System.out.println("Size of al after addtions: "+al.size());
//		
//		//Removing by value
//		System.out.println("Contents of al: "+al);
//		al.remove("F");
//		
//		//Removing by index
//		System.out.println("Index of D: " + al.indexOf("D"));
//		al.remove("F");
//		
//		//Resetting a value by index
//		System.out.println("Contents of al: " +al);
//		al.set(0,"T");
//		System.out.println("Contents of al after replacing c withT:" +
//				z	EY)KA
//		
//		//getting value with index
//		System.out.println("Get method: " + al.get(1));
//		
//		//Checking if ArrayList cUnúﬂìb»^a value
//		System.out.println("Contains method; " + al.contains("A"));
//		
//		//Sorting ArrayLIst(in this case, alphabetically)
//		Collections.sort(al);
//		System.out.println("After sorting: "+al);
//		
//		//Clearing all values from ArrayList
//		al.clear();
//		System.out.println("After clearing: " +al);
		
		

//// Ex 5 (add all the numbers in an arraylist)
//		ArrayList<Integer>al = new ArrayList<Integer>();
//		System.out.println("Initial size of al: " + al.size());
//		al.add(2);
//		al.add(4);
//		al.add(6);
//		al.add(12);
//		al.add(9);
//		al.add(70);
//		
//		//Total variable is used to keep a running total of the sum
//		int total = 0;
//		for (int x = 0; x < al.size(); x++) {
//			//we are adding the current number to total
//			total = total + al.get(x);
//			System.out.println("Total of al: "+total);
//		}
		
		
		
////DIY
//		ArrayList<Integer>al = new ArrayList<Integer>();
//		System.out.println("Initial size of al: " + al.size());
//		al.add(2);
//		al.add(4);
//		al.add(6);
//		al.add(12);
//		al.add(9);
//		al.add(70);
//		
//		//Total variable is used to keep a running total of the sum
//		int total = 0;
//		for (int x = 0; x < al.size(); x++) {
//			//we are adding the current number to total
//			total = total + al.get(x);
//			System.out.println("Total of al: "+total);
//			System.out.println("Average is: " + total/al.size());
//		}
		
		
		
////DIY
//		ArrayList<Integer>al = new ArrayList<Integer>();
//		al.add(2);
//		al.add(4);
//		al.add(6);
//		al.add(12);
//		al.add(9);
//		al.add(70);
//		System.out.println(Collections.max(al));
//		System.out.println(Collections.min(al));
	
		
//// Ex 6 (arraylist with with string values and finding the index of a value)
//		ArrayList<String> al =ZnçK ArrayList<String>();
//		System.out.println("Initial size of al: "+ al.size());
//		a9.µO”(~ohn");
//		al.add("Jason");y
ˇ		al.add("Emily");
//		al.add("Riya");
//		al.add("Tina");
//		al’a("Alisha");
//		System¶oUó√dntln("Size of al after additions: "+al);
//		for (int x = 0; x < al.size(); x++) {
//			//if the value at the index is John, print the index.
//			if (al.get(x)=="John") {
//				System.out.println(al.get(x));
//			}
//		}
		

		
//// Ex 7 (Arraylist with string values and generating email ids)
//		ArrayList<String> al = new ArrayList<String>();
//		System.out.println("Initial size of al: "+ al.size());
//		al.add("John");
//		al.add("Jason");
//		al.add("Emily");
//		al.add("Riya");
//		al.add("Tina");
//		al.add("Alisha");
//		System.out.println("Size of al after additions: "+al);
//		ArrayList<String>el = new ArrayList<String>();
//			for (int x = 0; x < al.size();x++) {
//				//generating email by concatenating @gmail.com to all names
//				String email = al.get(x)+"@gmail.com";
//				el.add(email);
//			}
//		System.out.println("Emails:"+el);
		}
	}

