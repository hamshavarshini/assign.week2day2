package assign.week3day2;

public class Desktop implements Software {

	
	public void hardwareResource(String mouse, int memory, String keyboard) {
		String connection = mouse;
		int totalmemorySize = memory;
		String type = keyboard;
		System.out.println("the connection of mouse is = "+connection);
		System.out.println("the toatal memory size = "+totalmemorySize);
		System.out.println("the type of keyboard = "+type);
		
		
	}

	public void softareResource(String internet, int appliversion) {
		String browser = internet;
		int version = appliversion;
		System.out.println("the browser used = "+browser);
		System.out.println("the  window version = "+version);
		
	}
public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.hardwareResource("wired", 128,"bluetooth");
		desk.softareResource("chrome", 10);
	}

}
