import java.util.Scanner;



public class Wifi {
	static Scanner myScanner = new Scanner(System.in);
	public static void Diagnosis() {
		
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		if (myScanner.nextLine().equals("yes")) {
			System.out.println("Rebooting your computer seemed to work");
			myScanner.close();
			return;
		}
		System.out.println("Second step: reboot your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		if (myScanner.nextLine().equals("yes")) {
			System.out.println("Rebooting your router seemed to work");
			myScanner.close();
			return;
		}
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		if (myScanner.nextLine().equals("yes")) {
			System.out.println("Checking the router's cables seemed to work");
			myScanner.close();
			return;
		}
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		if (myScanner.nextLine().equals("yes")) {
			System.out.println("Moving your computer closer to your router seemed to work");
			myScanner.close();
			return;
		}
		System.out.println("Fifth step: contact your ISP");
		
		
		myScanner.close();
	}
}
