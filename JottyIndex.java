import java.util.*;

public class JottyIndex {
	public static void main(String args[]) {

		String nextIndex = "empty";
		boolean control = true;
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
		System.out.println("There are " + list.size() + " number's in the array.");

	}
}