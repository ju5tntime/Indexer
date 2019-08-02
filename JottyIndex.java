import java.util.*;
import java.io.*; // this has PrintWriter and File in it

public class JottyIndex {
	public static void main(String args[]) {

		// vars
		String nextIndex = "empty";
		boolean control = true;
	
		// utilities
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		

		while(control) {
			System.out.println("Lets add another stupid index! Gimme it:");
			if(!nextIndex.equals("end")) {
				nextIndex = scan.nextLine();
				list.add(nextIndex);
			} else {
				list.remove("end");
				break;
			}
			
		}
		System.out.println("The array has " + list + " in it. Yay.");
		System.out.println("There are " + list.size() + " indices in the array.");

	}
}