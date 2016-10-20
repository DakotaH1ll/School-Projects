package swag;

import java.util.ArrayList;

class Helper {

	static ArrayList<String> messageList;
	static ArrayList<String> nameList;

	public static void send(String name, String message) {
		if (nameList.contains(name)) {
			messageList.add(name + ": " + message);	
		} else {
			System.out.println("Unable to send message to " + name);
		}
	}

	public String fetch() {
		return messageList.toString();
	}

	public void login(String name) {
		if (nameList.contains(name)) {
			System.out.println("This name has already been used!");
		} else {
			System.out.println("Welcome " + name);
			nameList.add(name);
		}
		
	}
}