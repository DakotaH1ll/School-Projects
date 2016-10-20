package swag;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client {
	Socket socket;

	static class Sender extends Thread {
		DataOutputStream dataOut;
		Helper helper;

		public Sender(DataOutputStream dataOut) {
			this.dataOut = dataOut;
			this.helper = new Helper();
		}

		public void run() {
			while (true) {
				try {

					dataOut.flush();
					synchronized (System.out) {
					}
					Thread.sleep(100);
				} catch (Exception e) {
					break;
				}
			}
		}
	}

	static class Receiver extends Thread {
		DataInputStream dataIn;

		public Receiver(DataInputStream dataIn) {
			this.dataIn = dataIn;
		}

		public void run() {
			while (true) {
				try {
					double number = dataIn.readDouble();
					synchronized (System.out) {
						System.out.println("<<<<<<<<<< " + number);
						for (int i = 0; i < 60; i++)
							System.out.print("=");
						System.out.println();
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}

	public Client(String hostname, int port) throws Exception {
		this.socket = new Socket(hostname, port);
	}

	public void connect() throws Exception {
		InputStream in = this.socket.getInputStream();
		OutputStream out = this.socket.getOutputStream();
		DataInputStream dataIn = new DataInputStream(in);
		DataOutputStream dataOut = new DataOutputStream(out);

		// Handle the connection
		System.out.println("Handling connection to server");
		Thread sender = new Sender(dataOut);
		Thread receiver = new Receiver(dataIn);

		sender.start();
		receiver.start();

		sender.join();
		receiver.join();
	}

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		String name = args[2];

		Client c = new Client(host, port);

		c.connect();
		Server.helper.login(name);

		while (true) {
			String[] line = scan.nextLine().split(" ");
			String command = line[0];
			String person = line[1];
			String message = line[2];

			if (command == "send") {
				Helper.send(person, message);
			} else if (command == "fetch") {
				Server.helper.fetch();
			}
		}

	}
}