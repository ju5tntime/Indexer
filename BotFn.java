import java.awt.*;
//import java.awt.event.*;
import java.io.*;
import java.util.*;

public class BotFn{

	Scanner scan = new Scanner(System.in);
	String s = "continue";
	String whereTo = "";
	

	public String hello(){
		System.out.println("\nWhat do you need to do? You can type the following and press enter:\n");
		System.out.println("run bk - BookKeep | "); // run commands
		System.out.println("exit - quits the program"); // exit program
		s = scan.nextLine();
		switch(s){
			case "run bk":
				s = "continue";
				run("bk");
				break;
			case "exit":
				System.out.println("Qutting.. have a nice day!");
				s = "exit";
				break;
			default: 
				s = "continue";
		} return s;
	}
	// create a new bot
	public Robot bot() throws AWTException{
		Robot b = new Robot();
		return b;
		// this is how another method uses this
		//Robot b = bot();
		//b.mouseMove(1005, 10);
	}
	// click the mouse at xy
	public void click(int x, int y) throws AWTException {
		Robot c = new Robot();
		c.mouseMove(x, y);
		
	}
	// open a program
	public void run(String s){
		Runtime run = Runtime.getRuntime();

		switch(s){
			case "bk":
				try{
					System.out.println("\nRunning BookKeep..");
            	run.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\MSACCESS.EXE K:\\accountm.accdb");
            	//
        		} catch (IOException e){
            		e.printStackTrace();
        		} // end case bk
        		break;
        	default:
        		System.out.println("\nTry again");
        		break;
		} // end switch
	}

} //end BotFn 